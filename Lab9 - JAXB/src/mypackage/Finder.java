package mypackage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Finder {
    public static void main(String[] args) {
        System.out.println("Hi. This tiny program searches for a specific name in a pre-created registry. Let's get started\n To exit, input '0'. Otherwise, input any string");
        Scanner scanner = new Scanner(System.in);
        String name = "";
        try {
            JAXBContext jc = JAXBContext.newInstance(Main.class);
            Unmarshaller u = jc.createUnmarshaller();
            Main main = (Main) u.unmarshal(new FileInputStream("src/mypackage/registry.xml"));
            List<Husband> husbands = main.getHusband();
            List<String> surnames_list = husbands.stream().map(Husband::getFullname).collect(Collectors.toList());

            while (true) {
                name = scanner.next();
                if (name.equals("0")) {
                    break;
                }
                List<String> res = new ArrayList<>();
                for (String fullname : surnames_list) {
                    String[] names = fullname.split(" ");
                    for (String part : names) {
                        if (part.equals(name)) {
                            res.add(fullname);
                        }
                    }
                }
                if (res.size() > 0) {
                    System.out.println("People with name " + name + ":");
                    for (String fullname : res) {
                        System.out.println(fullname);
                    }
                } else {
                    System.out.println("No husbands with name " + name + " were found");
                }
            }

            System.out.println("Got '0'. Going to finish.\nThanks for the attention!");

        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
