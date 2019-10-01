import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


public class Sample {
    public static void main(String[] args) {

        TransformerFactory factory = TransformerFactory.newInstance();
        try {
            Source xsl = new StreamSource("conf.xsl");
            Transformer transformer = factory.newTransformer(xsl);
            //transformer.setParameter("min", salary);//dynamically transfer xsl
            Source xml = new StreamSource("data.xml");
            Result result = new StreamResult("output/out.xml");
            transformer.transform(xml, result);
            System.out.println("File was generated successfully");
        } catch (TransformerException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
