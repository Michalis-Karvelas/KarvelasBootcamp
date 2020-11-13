/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IPlayer;
/**
 *
 * @author George.Pasparakis
 */
public class Player extends Naming implements IPlayer {
    private int counter = 0;
            
    public Player() {
        
    }
    
    public Player(String name) {
        this.setName(name);
        System.out.println(name);
    }
    
    /*
        In this method we need to figure out 
        for the specific game which move the player does
    */
    public String moves(Game game) {
        String result = "";
        counter++;
        result = Integer.toString(counter);
//        result = counter + "";
//        result = String.valueOf(counter);
        if (counter==20){ //edw eftiaksa to counter
            counter=0;
        }
        return(result);
    }
}
