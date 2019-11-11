/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsim;

/**
 *
 * @author dhirst1
 * @see Drink
 */
public abstract class TapOrBottled implements Drink {

    /**
     *
     */
    public abstract void prepareContainer();

    /**
     *
     */
    public void pourDrink(){
        System.out.println("Pouring Drink");
    }

    /**
     *
     */
    @Override
    public void serveDrink(){
        prepareContainer();
        pourDrink();
    }
    
}
