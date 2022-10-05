import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Contact friend1 = new Friend("Hans", "0173838");
        Smartphone handy1 = new Smartphone("s01", "Samsung");
        //handy1.setManufactureName("Samsung");
        //System.out.println("Handy1: " + handy1);
        //Contact friend3 = new Friend("Meier", "1234");
        //Contact friend2 = new Friend("Wurst", "789523");
        //ArrayList<Contact> arrayContacts = new ArrayList<>();
        //arrayContacts.add(friend2);
        //arrayContacts.add(friend3);
        //System.out.println(arrayContacts);
        //System.out.println();
        //ArrayList<Contact> phonebook = handy1.phonebook;
        //freund.contactName = "Hugo";
        //freund.telefonnummer = "0190666";
        System.out.println(handy1);
        //handy1.setPhoneNumber();
        System.out.println("\n\nKontakte: " + handy1.phonebook);
        handy1.addContact("00000", "Kalus");
        System.out.println("Alle Kontakte: " +  handy1.phonebook);
    }
}