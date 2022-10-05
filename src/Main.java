import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Contact friend1 = new Friend("Hans", "0173838");
        Smartphone handy1 = new Smartphone("s01", "Samsung");
        //handy1.setManufactureName("Samsung");
        //System.out.println("Handy1: " + handy1);
        Contact friend3 = new Friend("Meier", "1234");
        Contact friend2 = new Friend("Wurst", "789523");
        ArrayList<Contact> arrayContacts = new ArrayList<>();
        arrayContacts.add(friend2);
        arrayContacts.add(friend3);
        System.out.println(arrayContacts);
        System.out.println();

        //freund.contactName = "Hugo";
        //freund.telefonnummer = "0190666";

        //System.out.println(freund.toString());
    }
}