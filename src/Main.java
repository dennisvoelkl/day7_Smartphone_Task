public class Main {
    public static void main(String[] args) {

        Contact friend1 = new Friend("Hans", "0173838");

        Friend freund = new Friend();
        freund.contactName = "Hugo";
        freund.telefonnummer = "0190666";

        System.out.println(freund.toString());
    }
}