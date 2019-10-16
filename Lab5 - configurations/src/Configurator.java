import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Configurator {
    private static final boolean USE_XPATH = false;//change it to true to use xpath

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {
        Scanner scanner = new Scanner(System.in);

        File xmlfile = new File("configuration.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlfile);
        document.getDocumentElement().normalize();

        Element rootElement = document.getDocumentElement();
        System.out.println("Root element is : " + rootElement.getNodeName());
        System.out.println("----------------------------\nConfiguration parameters and it's values are:");


        if (USE_XPATH) {
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath path = xPathFactory.newXPath();
            String xPathString = "/configuration";
            NodeList some = (NodeList) path.evaluate(xPathString, document, XPathConstants.NODESET);

        } else {
            System.out.println("\nno xpath was used during a runtime of this particular script");
            NodeList nodeList = document.getElementsByTagName("*");

            for (int i = 1; i < nodeList.getLength(); i++) {//i=1 to ignore root element
                Element element = (Element) nodeList.item(i);
                Text element_value = (Text) element.getFirstChild();
                System.out.println("* " + element.getNodeName() + " : " + element_value.getWholeText());
            }
            String s = "";
            while (!s.equals("y") && !s.equals("n")) {
                System.out.println("Would you like to change parameters (y/n)?");
                s = scanner.nextLine();
            }

            if (s.equals("y")) {
                System.out.println("If you want to change a certain parameter, input 'y'. Otherwise, input anything else");
                for (int i = 1; i < nodeList.getLength(); i++) {
                    Element element = (Element) nodeList.item(i);
                    Text element_value = (Text) element.getFirstChild();

                    System.out.println("Parameter: " + element.getNodeName() + " is set to " + element_value.getWholeText() + " . Change it(y/n)?");
                    s = scanner.nextLine();
                    if (s.equals("y")) {
                        System.out.println("Please, set a new value:");
                        element.setTextContent(scanner.next());
                    }
                }
            }

            s = "";
            System.out.println("Would you like to add new parameters (y/n)?");
            while (!s.equals("y") && !s.equals("n")) {
                s = scanner.nextLine();
            }
            if (s.equals("y")) {
                System.out.println("To add a parameter, input 'y'. To exit input any other symbol(s)");
                s = scanner.nextLine();
                while (s.equals("y")) {
                    System.out.println("Input new parameter name:");
                    Element new_element = document.createElement(scanner.nextLine());
                    System.out.println("Input it's value");
                    Text value = document.createTextNode(scanner.nextLine());
                    new_element.appendChild(value);
                    rootElement.appendChild(new_element);

                    System.out.println("Would you like to continue?(y/n)");
                    s = scanner.nextLine();
                    if (!s.equals("y")) {
                        System.out.println("Added everything, gonna exit");
                    }
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult result = new StreamResult("output/out.xml");
            transformer.transform(domSource, result);
            System.out.println("Transformation completed");
        }


    }
}
