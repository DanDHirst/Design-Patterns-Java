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
public class BottledDrink extends TapOrBottled{

    /**
     *prepares container
     * 
     * <p>outputs opening bottle</p>
     */
    @Override
    public void prepareContainer() {
        System.out.println("Open bottle");
    }
    
    
}
