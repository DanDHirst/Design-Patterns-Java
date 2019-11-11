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
public abstract class alcohlicDrink implements Drink{

    /**
     *
     */
    public void addIce(){
        System.out.println("Adding ice to glass");
    }

    /**
     *
     */
    public abstract void addSpirit();

    /**
     *
     */
    public void addMixer(){
        System.out.println("adding mixer to glass");
    }

    /**
     *
     */
    public abstract void addGarnish();

    /**
     *
     */
    @Override
    public void serveDrink(){
        addIce();
        addSpirit();
        addMixer();
        addGarnish();
    };
    
}
