/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakeAction;

/**
 *
 * @author Amber
 */

import cakeApieces.ABEvent;
import cakeApieces.ABListener;

import cakeGUIpieces.Temple;



public class TemAction implements ABListener {

    private Temple temple;

    public TemAction(Temple temple) {
        this.temple = temple;
    }

    @Override
    public void abPerformed(ABEvent e){
        System.out.println("llego TemAction!");
        
        System.out.println(e.getABCommand());

        if (e.getABCommand().equals("COMANDOX")) {
            System.out.println("Comando exitoso!");
        }
        if (e.getABCommand().equals("COMANDOY")) {
            System.out.println("Second Command successful!");
            if(e.getACState()==1) {
                System.out.println("activado");
            }
            if(e.getACState()==0) {
                System.out.println("no activado");
            }
        }
    }
}
