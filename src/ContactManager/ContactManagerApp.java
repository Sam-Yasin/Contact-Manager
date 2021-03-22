package ContactManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactManagerApp {
    public static void main(String[] args) {
        System.out.println("***Welcome to Contacts Manager***\n");
        System.out.println(returnMenuDisplay());

        viewContacts();

    }

    private static String returnMenuDisplay() {
        String choice = "Would you like to?\n\n" +
                "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search contacts by name.\n" +
                "4. Delete Existing contact.\n" +
                "5. Exit" +
                "\n\n" +
                "Select 1, 2, 3, 4, or 5\n";
        return choice;
    }

    private static void  viewContacts() {
        Path cmp = Paths.get("src", "ContactManager", "peopleContacts.txt");
        List<String> contacts = new ArrayList<>();

        try {
            contacts = Files.readAllLines(cmp);
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------------------------");
        for(String contact : contacts) {
            String[] splitContact = contact.split(" ", 3);
            System.out.println("Name: " + splitContact[0] + " " +splitContact[1] + " | " + "Number: " + splitContact[2]);
        }
        System.out.println("--------------------------------------------");
    }

}
