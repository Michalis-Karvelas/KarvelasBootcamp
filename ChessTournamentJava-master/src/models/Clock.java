/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IClock;

/**
 *
 * @author George.Pasparakis
 */
public class Clock extends Naming implements IClock {
    private int c;

    public Clock(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public static int changeClock(int c){
     return c-15;
    }
}
