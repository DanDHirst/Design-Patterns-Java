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
public abstract class CaffieneDrink implements Drink{

    /**Boils the water
     *
     * <p> outputs boiling the water</p>
     */
    public void boilWater(){
        System.out.println("Boiling water");
    }

    /**
     *brew the drink
     *
     * <p> sets up a abstract method for brewing tea or coffee</p>
     */
    public abstract void brew();

    /**
     * pours the drink to cup 
     *
     * <p> outputs Pouring to cup</p>
     *
     */
    public void pourToCup(){
        System.out.println("Pouring to cup");
    };

    /**
     *add condiments
     *
     * <p> sets up abstract method for adding condiments e.g. lemon for tea</p>
     */
    public abstract void addCondiments();

    /**
     *Implementation template for serving the tea or coffee
     * <p> boils the water first, brews the drink, pours to cup then adds condiments</p>
     */
    @Override
    public void serveDrink(){
        boilWater();
        brew();
        pourToCup();
        addCondiments();
    }
    
}
