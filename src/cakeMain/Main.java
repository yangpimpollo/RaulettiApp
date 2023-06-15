/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakeMain;

/**
 *
 * @author Amber
 */

import cakeGUI.*;



public class Main {
    public static void main(String args[]){
        
        
        //Preload lop0 = new Preload();
        //Box1 lop1 = new Box1();
        //lop1.getF0().setVisible(true);
        Thread hilo1 = new Thread(new Preload());
        hilo1.start();
        
        //pausa(3000);
        //Thread hilo2 = new Thread(new BoxGUI());
        //hilo2.start();         
    }

}
