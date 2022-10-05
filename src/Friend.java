public class Friend extends Contact{
    //Attribute
    String telefonnummer;
    //default Konstruktor
    public Friend(){
    }
    //Konstruktor
    public Friend(String telefonnummer, String name) {
        this.telefonnummer = telefonnummer;
        super.contactName = name;
    }
    //Methoden
    public String toString(){
        return ("Name: " + contactName +
                "\nNummer: " + telefonnummer + "\n");
        }

        public String getName(){
          return super.contactName;
        }
    }
