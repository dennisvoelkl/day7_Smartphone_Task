import jdk.jfr.DataAmount;
import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Data
public class Smartphone extends Friend implements Radio, GPS {

    //Attribute
    private String modelName;
    private String manufactureName;
    //private ArrayList<Contact> contactList;
    //Array[] phonebook = new Array[2];

    //Konstruktor default
    public Smartphone(){}
    //Konstruktor mit allen Werten
    public Smartphone(String telefonnummer, String name, String modelName, String manufactureName) {
        super(telefonnummer, name);
        this.modelName = modelName;
        this.manufactureName = manufactureName;
    }

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
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", manufactureName='" + manufactureName + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", contactName='" + contactName + '\'' +
                "} " + super.toString();
    }
}
