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
public class Cocktail extends alcohlicDrink{

    /**adds spirit to drink
     *
     * <p> outputs adding two spirits to the drink</p>
     */
    @Override
    public void addSpirit() {
        System.out.println("Add two spirits to glass");
    }

    /**adds a garnish
     *
     * <p> outputs adding a fancy garnish</p>
     */
    @Override
    public void addGarnish() {
        System.out.println("Add fancy garnish");
    }
    
}
