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

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import cakeApieces.ABEvent;
import cakeApieces.ABListener;

import cakeGUI.BoxGUI;



public class ActionBk implements ABListener {
    
    private BoxGUI boxGui;

    public ActionBk(BoxGUI boxGui) {
        this.boxGui = boxGui;
    }

    @Override
    public void abPerformed(ABEvent e){

        

        if (e.getABCommand().equals("CUPCAKE")) {

            int a = e.getACState();
            String b = boxGui.geTp4().getTortaElegida().toString();

            if(a == 1){
                boxGui.geTp5().setTortaText("---CUPCAKE----"+b);
                a = 0;
                boxGui.geTp4().getComboKekeCH().setEnabled(false);
                boxGui.geTp4().getComboKekeME().setEnabled(false);
            }else {
                boxGui.geTp5().setTortaText("Se desactivo Cupcake");
                 a = 1;
             }
        }
        
        
    }
}
