import java.io.*;
import java.util.*;
public abstract class Wyvern implements Monster{
    private String element;
    private String habitat;
    private String name;

    public Wyvern(){
        
    }

    public Wyvern(String name, String habitat, String element){
        this.element = element;
        this.habitat = habitat;
        this.name = name;
    }

    //Method to check if a given string is actually a number
    public static boolean isNumeric(String s){
        try{
        Integer.parseInt(s);
        return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    //If the given string is a number, throws an exception

    public static void check(String s){
        if (isNumeric(s) == true){
            throw new InputMismatchException("Don't input numbers.");
        }
    }


    

    public String display(){
        return element + ", " + habitat + ", " + name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setElement(String element){
        this.element = element;
    }
    public String getElement(){
        return element;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat(){
        return habitat;
    }

    
}