import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    LinkedList<Contact> newList;

    public Main() {
        newList = new LinkedList<>();
    }

    public void addContact(){
        System.out.println("Add an entry: ");

        System.out.print("Enter first and last name: ");
        String name = in.nextLine();

        System.out.print("Enter email address: ");
        String email = in.nextLine();

        System.out.print("Enter phone number: ");
        String number = in.nextLine();

        Contact contact = new Contact(name, email, number);
        newList.add(contact);
    }

    public void deleteContact(){
        System.out.print("Enter index number to delete: ");
        int delete = in.nextInt();
        newList.remove(delete);
    }

    public void emailSearch(){
        System.out.print("Enter email to search for: ");
        String search = in.nextLine();

        for (Contact contact : newList) {
            if (contact.getEmail().equals(search)) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("Phone number: " + contact.getNumber());
                return;
            }
        }

        System.out.println("Email not found.");
    }

    public void printList(){
        System.out.println("Contact List:");
        for (Contact contact : newList) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Phone number: " + contact.getNumber());
            System.out.println();
        }
    }

    public void search(){
        System.out.print("Enter search string: ");
        String search = in.nextLine();

        System.out.println("Search results:");
        for (Contact contact : newList) {
            if (contact.getName().toLowerCase().contains(search.toLowerCase()) ||
                    contact.getEmail().toLowerCase().contains(search.toLowerCase())) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("Phone number: " + contact.getNumber());
                System.out.println();
            }
        }
    }

    public void quit(){
        System.out.println("Exiting the program...");
        System.exit(0);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("*************************");
        System.out.println("(A)dd");
        System.out.println("(D)elete");
        System.out.println("(E)mail Search");
        System.out.println("(P)rint List");
        System.out.println("(S)earch");
        System.out.println("(Q)uit");
        System.out.println("*************************");
        while (true) {
            System.out.print("Please enter a command: ");
            String command = in.nextLine().toUpperCase();

            switch (command) {
                case "A":
                    main.addContact();
                    break;
                case "D":
                    main.deleteContact();
                    break;
                case "E":
                    main.emailSearch();
                    break;
                case "P":
                    main.printList();
                    break;
                case "S":
                    main.search();
                    break;
                case "Q":
                    main.quit();
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}