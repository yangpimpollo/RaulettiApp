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
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;



public class CanvaPl extends JPanel {

    private ACheckBox nombreCk, fotoTCk, paletaCk;
    //private int N, F, P;

    public CanvaPl(){
        setLayout(null);

        nombreCk = new ACheckBox();
        nombreCk.setAText("Nombre");
        //nombreCk.setSize( 100, 22);
        nombreCk.setLocation( 40, 2);
        //nombreCk.setBackground(new Color( 188, 233, 231));
        //nombreCk.setFont(new java.awt.Font("Andale Mono", 3, 14));
        //nombreCk.setForeground(new java.awt.Color( 0, 0, 0));
        //nombreCk.addChangeListener(this);
        add(nombreCk);

        fotoTCk = new ACheckBox();
        fotoTCk.setAText("FotoTorta");
        //fotoTCk.setSize( 100, 22);
        fotoTCk.setLocation( 40, 30);
        //fotoTCk.setBackground(new Color( 166, 225, 222));
        //fotoTCk.setFont(new java.awt.Font("Andale Mono", 3, 14));
        //fotoTCk.setForeground(new java.awt.Color( 0, 0, 0));
        //fotoTCk.addChangeListener(this);
        add(fotoTCk);

        paletaCk = new ACheckBox();
        paletaCk.setAText("Paletas");
        //paletaCk.setSize( 100, 22);
        paletaCk.setLocation( 40, 58);
        //paletaCk.setBackground(new Color( 109, 207, 202));
        //paletaCk.setFont(new java.awt.Font("Andale Mono", 3, 14));
        //paletaCk.setForeground(new java.awt.Color( 0, 0, 0));
        //paletaCk.addChangeListener(this);
        add(paletaCk);


        this.setSize( 200, 90);
        this.setBackground(new Color( 214, 16, 67));
    }

    /*public void stateChanged(ChangeEvent e){
        if(nombreCk.isSelected() == true){
            N = 1;
        }else {
             N = 0;
         }

        if(fotoTCk.isSelected() == true){
            F = 1;
        }else {
             F = 0;
         }

        if(paletaCk.isSelected() == true){
            P = 1;
        }else {
             P = 0;
         }
    }*/

    public int getNInt() {
        return nombreCk.getACState();
    }
    public int getFInt() {
        return fotoTCk.getACState();
    }
    public int getPInt() {
        return paletaCk.getACState();
    }

}
