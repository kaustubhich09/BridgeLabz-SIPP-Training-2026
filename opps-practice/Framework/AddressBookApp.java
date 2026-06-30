import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added.");
    }

    static void searchContact(String name) {

        Contact c = map.get(name);

        if (c != null) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    static void deleteContact(String name) {

        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    static void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        for (Contact c : contacts) {
            System.out.println(c.name + " | " + c.phone + " | " + c.email);
        }
    }

    public static void main(String[] args) {

        addContact("Rahul", "9876543210", "rahul@gmail.com");
        addContact("Aman", "9123456789", "aman@gmail.com");
        addContact("Priya", "9988776655", "priya@gmail.com");

        searchContact("Aman");

        deleteContact("Rahul");

        displayContacts();
    }
}