/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubModelLandlord;

import PubModel.Strategies.IDrinksStrategy;

/**
 *
 * @author dhirst1
 */
public class LandLord extends LandlordFactory{
    @Override
    public IDrinksStrategy selectStrategy(String DrinkType){
        IDrinksStrategy strategy;
        switch (DrinkType) {
            case "Pint":
                strategy = new PubModel.Strategies.TapStrategy();
                break;
            case "Bottle":
                strategy = new PubModel.Strategies.BottleStrategy();
                break;
            case "Tea":
                strategy = new PubModel.Strategies.TeaStrategy();
                break;
            case "Coffee":
                strategy = new PubModel.Strategies.CoffeeStrategy();
                break;
            case "Long Drink":
                strategy = new PubModel.Strategies.LongDrinkStrategy();
                break;
            case "Cocktail":
                strategy = new PubModel.Strategies.CocktailStrategy();
                break;
            default:
                strategy = new PubModel.Strategies.DefaultStrategy();
                break;
        }
        return strategy;
    }
    
}
