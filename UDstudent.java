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
    public Integer price;
    public Integer weight = 200;

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
        return this.price;
    }

    public Integer calculatedweight(){
         
        if ( this.cC < 1600 && this.cC > 1200){
            this.weight += 15;
        }
        else if (cC < 1200){
            this.weight += 12; 
        }
        else if (cC > 1600){
            this.weight = 20;
        }
        return this.weight;
    }
}
public class Chassis {

    public String type;
    public Integer price;
    
    public chassis(){
    }
    public Integer calculatePrice(){
        if (this.type.equals("Deportivo")){
            this.price += 5000000;
        }
        else if (this.type.equals("Classic")){
            this.price += 1000000;
        }
        return this.price;
    }
    
}
import Chassis;
import Engine;
import java.util.List;


public class Car{

    private List<Car>cars=null;
    public String color;
    public Integer price;
    Chassis chassis = new Chassis;
    
    public static void main(String[] args) {
        

    }
    public Car(){
    }
    private void calcualatedPrice(){

    }
    
    public String toString(){

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

