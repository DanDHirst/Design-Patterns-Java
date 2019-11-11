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
public class Coffee extends CaffieneDrink{

    /**brew for coffee
     *<p> outputs Brew coffee in boiled water</p>
     */
    @Override
    public void brew(){
        System.out.println("Brew coffee in boiled water");
    }

    /**adds condiments
     * <p> outputs add milk</p>
     *
     */
    @Override
    public void addCondiments(){
        System.out.println("Add milk");
    }
}
