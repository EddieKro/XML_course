import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Binder {
    public static void main(String[] args) {
        try{
            JAXBContext jc = JAXBContext.newInstance("generated");
            Unmarshaller u = jc.createUnmarshaller();

        }
    }
}
