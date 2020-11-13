/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IClock;
import interfaces.IGame;
/**
 *
 * @author George.Pasparakis
 */
public class Game extends Naming implements IGame, IClock {
    private Player[] players;
    
    public  Game() {
       System.out.println("Game 1");
    }
    
    public Game(String name, Player[] players) {
        this.setName(name);
        this.start(players);
    }
    
    public void start(Player[] players) {
        System.out.println(this.getName());
        System.out.println("Player " + players[0] + " plays against Player " + players[1]);
        this.players = players;
        this.playersMove(players, new Clock(600));
        
    }
    
    public void playersMove(Player[] players, Clock c) {
        // Player X plays move m against Player Y
        // 15" * 4 = 1' * 10 = 10' == 600"
        // 600" = 40 cycles, 20 cycles
        int timer;
        //Clock clock=new Clock(600);
        for (timer=600; timer>0; timer=timer-30) {
            out(0,1,timer);
           /* System.out.println("Player " + players[0] + " plays move " +
                                       players[0].moves(this) +
                                   " against Player " + players[1]);
            //System.out.println("Time is: " + timer);
            System.out.println("Player " + players[1] + " plays move " +
                                       players[1].moves(this) +
                                   " against Player " + players[0]);*/
           if(timer==30){
               System.out.println("================================");
               System.out.println("          End of Game");
               System.out.println("================================");
           }
        }
    }
    public void out(int a,int b,int timer){
        /*System.out.println("Player " + players[a] + " plays move " +
                players[a].moves(this) +
                " against Player " + players[b]);
        System.out.println("Player " + players[b] + " plays move " +
                players[b].moves(this) +
                " against Player " + players[a]);*/
        System.out.println("Player " + players[a] + " plays move " +
                players[a].moves(this) +
                " against Player " + players[b] +" with " +(timer-15)+ " seconds remaining \n"+"Player " + players[b] + " plays move " + //se ena sout
                players[b].moves(this) +
                " against Player " + players[a]+" with " +(timer-30)+ " seconds remaining " );
    }
    /* or else
    public void out2(int a,int b) {
    System.out.println("Player " + players[a] + " plays move " +
                players[a].moves(this) + " against Player " + players[1]"\n" + timer-15 + "remaining")}
     */
}
