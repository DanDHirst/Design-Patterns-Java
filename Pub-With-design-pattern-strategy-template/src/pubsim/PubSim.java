/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsim;

import java.util.Scanner;

/**
 *
 * @author dhirst1
 */
public class PubSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true){
        System.out.println ( " What can I get ya ? " );
        Scanner input = new Scanner ( System.in);
        String answer = input.nextLine();
        
        Landlord drinkServer = new Landlord();
        drinkServer.createDrink(answer);
        drinkServer.serveDrink();
   
        }
    }
}
