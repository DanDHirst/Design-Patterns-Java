/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsim;

/**
 *
 * @author dhirst1
 */
public class Landlord {
    private Drink drinkStrategy;

    /**
     *
     */
    public Landlord() {
    }
  
    /**
     *
     * @param drink
     */
    public void createDrink(String drink){
        switch(drink){
            case "Tea":
                drinkStrategy = new Tea();
                break;
            case "Coffee":
                drinkStrategy = new Coffee();
                break;
            case "Bottled":
                drinkStrategy = new BottledDrink();
                break;
            case "On Tap":
                drinkStrategy = new DrinksOnTap();
                break;
            case "Cocktail":
                drinkStrategy = new Cocktail();
                break;
            case "Long Drink":
                drinkStrategy = new LongDrink();
                break;
            default:
                System.out.println("Not available");
            
        }
        
    }

    /**
     *
     */
    public void serveDrink(){
        if(checkIfAvailable()==true){
            drinkStrategy.serveDrink();
            System.out.println("There is your Drink");
            drinkStrategy = null;
        }
        
    }

    /**
     *
     * @return
     */
    public boolean checkIfAvailable(){
        if(drinkStrategy == null){
            return false;
        }
        return true;
    }
        
}
