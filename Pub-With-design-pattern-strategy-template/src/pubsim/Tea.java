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
public class Tea extends CaffieneDrink{

    /**Brew the Tea 
     *
     * <p> outputs the value steep tea in water</p>
     */
    @Override
    public void brew(){
        System.out.println("Steep tea in water");
    }

    /**
     * add lemon to tea
     * 
     * <p> Outputs adding lemon to the tea</p>
     */
    @Override
    public void addCondiments(){
        System.out.println("Add lemon");
    }
    
}
