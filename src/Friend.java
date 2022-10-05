public class Friend extends Contact{
    //Attribute
    String telefonnummer;
    //default Konstruktor
    public Friend(){
    }
    //Konstruktor
    public Friend(String telefonnummer, String name) {
        this.telefonnummer = telefonnummer;
        this.contactName = name;
    }
    //Methoden
    public String toString(){
        return ("Name: " + this.contactName +
                "\nNummer: " + this.telefonnummer);
        }

        public String getName(){
          return super.contactName;
        }
    }
