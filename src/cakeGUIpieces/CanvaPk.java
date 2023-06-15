/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakeGUIpieces;

/**
 *
 * @author Amber
 */

import javax.swing.JPanel;
//import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;

import cakeApieces.ACheckBox;



public class CanvaPk extends JPanel{

    private ACheckBox cupkakeCk;

    public CanvaPk(){
        setLayout(null);

        cupkakeCk = new ACheckBox();
        cupkakeCk.setLocation( 25, 22);
        cupkakeCk.setAText("cupCake");
        cupkakeCk.setABCommand("CUPCAKE");
        //cupkakeCk.setActionCommand("CUPCAKE");
        //cupkakeCk.setEnabled(false);
        add(cupkakeCk);


        this.setSize( 150, 70);
        this.setBackground(new Color( 214, 16, 67));
    }

    /*public void stateChanged(ChangeEvent e){
        if(cupkakeCk.isSelected() == true){
            KakeInt = 1;
            
        } else {
              KakeInt = 0;
          }
    }*/


    public ACheckBox getCupkakeCk() {
        return cupkakeCk;
    }

    public int getKakeInt() {
        return cupkakeCk.getACState();
    }

}
