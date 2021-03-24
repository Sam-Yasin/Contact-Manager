package ContactManager;

import java.util.Scanner;

public class ContactManagerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Welcome to Contacts Manager***\n");
        System.out.println(ContactTools.returnMenuDisplay());
        int userInput = scanner.nextInt();
//        ContactTools.viewContacts();
//        ContactTools.addNewContact();
//        ContactTools.searchContact();
//        ContactTools.deleteExistingContact();
        runAllMethod(userInput);



    }

    public static void runAllMethod(int choice) {
        switch (choice) {
            case 1:
                ContactTools.viewContacts();
                break;
            case 2:
                ContactTools.addNewContact();
                break;
            case 3:
                ContactTools.searchContact();
            case 4:
                ContactTools.deleteExistingContact();
            default:
                System.out.println("GoodBye!");
                break;
        }
    }
}
