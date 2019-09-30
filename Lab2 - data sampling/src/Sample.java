import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Sample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int salary = Integer.MAX_VALUE;
        boolean flag = false;

        while (!flag)
            try {
                System.out.println("Please, input minimum salary:");
                salary = in.nextInt();
                if (salary <= 0) {
                    if (salary == -1) {
                        return;
                    } else {
                        System.out.println("Salary must be a positive integer!");
                    }
                } else {
                    flag = true;
                }


            } catch (InputMismatchException ime) {
                System.out.println("Salary must be an int. If you want to exit, please, input '-1'");
                in.nextLine();
            }

        System.out.println("Minimum salary equals: " + salary);

        TransformerFactory factory = TransformerFactory.newInstance();
        try {
            Source xsl = new StreamSource("conf.xsl");
            Transformer transformer = factory.newTransformer(xsl);
            transformer.setParameter("min", salary);//dynamically transfer xsl
            Source xml = new StreamSource("data.xml");
            Result result = new StreamResult("output/out.xml");
            transformer.transform(xml, result);
            System.out.println("File was generated successfully");
        } catch (TransformerException e) {
            e.printStackTrace();
            System.out.println("Smth went wrong");
        }
    }
}
