import jdk.jfr.DataAmount;
import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Smartphone implements Radio, GPS {

    //Attribute
    private String modelName;
    private String manufactureName;
    private java.util.ArrayList<Contact> ArrayList;
    //private ArrayList<Contact> contactList;
    //Array[] phonebook = new Array[2];
    //Kontakte

    List<Contact> phonebook = new ArrayList<>();

    //Konstruktor default
    public Smartphone(){}
    //Konstruktor mit allen Werten
    public Smartphone(String modelName, String manufactureName) {
        //super(telefonnummer, name);
        this.modelName = modelName;
        this.manufactureName = manufactureName;
    }

    public void addContact(String name, String telefonnummer){
        Friend friend1 = new Friend("Hans", "0173838");
        phonebook.add(friend1);
        Friend friend2 = new Friend("Wurst", "0815");
        phonebook.add(friend2);
        Friend friend3 = new Friend("Peter", "98746423");
        phonebook.add(friend3);
        Friend friend4 = new Friend(name, telefonnummer);
        //System.out.println("Freund 4: " + friend4);
        phonebook.add(friend4);
    }
/*
    public void setPhoneNumber(){
        phonebook.add(friend1);
        phonebook.add(friend2);
        phonebook.add(friend3);
    }
*/
    //Methoden
    public Boolean startRadio(){
        System.out.println("Radio started");
        return true;
    }

    public Boolean stopRadio(){
        System.out.println("Radio stopped");
        return false;
    }

    public String getPosition(){
        return "köln";
    };


    // Getter und Setter für alle Attribiute
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    //toString Methode die den Namen des modells und Herstellers und eine Liste mit allen kontakten zurückgibt
    @Override
    public String toString() {
        return "Smartphone:\n" +
                "modelName='" + modelName +
                "\nmanufactureName='" + manufactureName;
                //", ArrayList=" + ArrayList +
                //", friend1=" + friend1 +
                //", friend2=" + friend2 +
                //", phonebook=" + phonebook +
               // '}';
    }
}
