public class BruteWyvern extends Wyvern{

    public BruteWyvern(String name, String habitat, String element){
        super(name, habitat, element);
    }

   public String display (){
       return getName() + " is a Brute Wyvern of the " + getElement() + " element " + "that lives in the " + getHabitat();
   }

    

}