public class PiscineWyvern extends Wyvern{

    public PiscineWyvern(String name, String habitat, String element){
        super(name, habitat, element);
    }

   public String display(){
       return getName() + " is a Piscine Wyvern of the " + getElement() + " element " + "that lives in the " + getHabitat(); 
   }

    

}