package weekSixteen;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;

public class StudentXML {
    public static void main(String[] args) {
        try{
            File input = new File("student_record.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(input);

            System.out.println("root element: " + doc.getDocumentElement().getNodeName());

            NodeList students = doc.getElementsByTagName("student");
            for(int i = 0; i < students.getLength(); i++){
                Node node = students.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.printf("ID: %s\nFirst Name: %s\nLast Name: %s\nMajor: %s\nGPA: %s\n", element.getAttribute("id"), element.getElementsByTagName("firstname").item(0).getTextContent(), element.getElementsByTagName("lastname").item(0).getTextContent(), element.getElementsByTagName("major").item(0).getTextContent(), element.getElementsByTagName("gpa").item(0).getTextContent());
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
