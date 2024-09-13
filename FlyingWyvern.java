public class FlyingWyvern extends Wyvern{

    public FlyingWyvern(String name, String habitat, String element){
        super(name, habitat, element);
    }

   public String display(){
       return getName() + " is a Flying Wyvern that lives in the " + getHabitat() + " and uses the " + getElement() + " element";
   }

    

}