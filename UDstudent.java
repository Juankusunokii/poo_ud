public class UDstudent extends estudiante {
    private String languages;
    private boolean repeating;
    private int assistance;

    public void setLanguages (String languages){
        this.languages = languages;
    }
    
    public void setReapiting (boolean repeating){
        this.repeating = repeating;
    }
    
    public void setAssistance (int assistance){
        this.assistance = assistance;
    }
    
    
    public String getlanguages (){
        return languages;
    }

    public boolean getrepeating (){
        return repeating;
    }

    public int  getAssistance (){
        return assistance;
    }

}
public class Engine {
    public Integer cC;
    public Integer Price;
    public Integer Weight = 200;

    public Integer calculatedPrice(){
        
        if ( this.cC < 1600 && this.cC > 1200 ){
            this.price = 10000000;
        }
        else if (cC < 1200){
            this.price = 8000000;
        }
        else if (cC > 1600){
            this.price = 12000000;
        }
        else {
            System.out.println("Pregunte por su preferencia");
        }
        return this.Price;
    }

    public Integer calculatedWeight(){
         
        if ( this.cC < 1600 && this.cC > 1200){
            this.weight += 15;
        }
        else if (cC < 1200){
            this.Weight += 12; 
        }
        else if (cC > 1600){
            this.Weight = 20;
        }
        return this.Weight;
    }
}
public class Chassis {

    public String type;
    public Integer price;


    public Integer calculatePrice(){
        if (this.type == "deportivo"){
            this.price += 5000000;
        }
        else if (this.type == "classic"){
            this.price += 1000000;
        }
        return this.price;
    }
    
}
import Chassis;
import Engine;


public class Car{

    public String color;

    private void calcualatedPrice(){

    }
    
    public string toString(){

    }
}
import Car;
import util.java.Scanner;

public class Catalog {

    public static void printMenu() {

        System.out.println("===== Welcome to  =====");
        System.out.println("Choose an option:");
        
    }
    
    
}
