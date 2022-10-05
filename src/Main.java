import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Contact friend1 = new Friend("Hans", "0173838");
        Contact friend2 = new Friend("Wurst", "789523");
        ArrayList<Contact> arrayContacts = new ArrayList<>();
        arrayContacts.add(friend1);
        arrayContacts.add(friend2);

        System.out.println(arrayContacts.get(0));
        System.out.println(arrayContacts.get(0));

        //freund.contactName = "Hugo";
        //freund.telefonnummer = "0190666";

        //System.out.println(freund.toString());
    }
}