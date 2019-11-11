/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import PubModelLandlord.LandlordFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.PubGui;

/**
 *
 * @author dhirst1
 */
public class PubStratController implements ActionListener{
    PubGui view;
    LandlordFactory model;

    
    public PubStratController(PubGui view, LandlordFactory model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String answer = view.getDrinkInput();
        if (answer.equals("quit")){
            System.exit(0);
        }
        String info;
      
        model.setStrategy(model.selectStrategy(answer));
        info = model.serveDrink();
        view.setTextSteps(view.getTextSteps() + info);
    }
    public void setButtonListener(){
        view.setButtonListener(this);
    }
    
    
    
    
}
