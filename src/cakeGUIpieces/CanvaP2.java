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
import javax.swing.JToolTip;
import java.awt.Color;
import java.awt.Font;

import cakeApieces.AButton;

import cakeData.cakeConstant;



public class CanvaP2 extends JPanel {

    private AButton boton1, boton2, boton3;

    public CanvaP2(){
        setLayout(null);
 
        boton1 = new AButton();
        boton1.setALocation( 1, 1);
        boton1.setASize(40, 40); 
        boton1.AsignarIcono(cakeConstant.ckIcon);
        boton1.IconoContraste(cakeConstant.ckIcon);
        boton1.setABCommand("TMENU");
        boton1.setToolTipText("menu (M)");
        add(boton1);

        boton2 = new AButton();
        boton2.setALocation( 4, 380);
        boton2.setASize(30, 30); 
        boton2.AsignarIcono(cakeConstant.reIcon);
        boton2.IconoContraste(cakeConstant.reIconN);
        boton2.setABCommand("RESET");
        boton2.setToolTipText("reset (R)");
        add(boton2);
 
        boton3 = new AButton();
        boton3.setALocation( 5, 348);
        boton3.setASize(27, 27); 
        boton3.AsignarIcono(cakeConstant.abIcon);
        boton3.IconoContraste(cakeConstant.abIconN);
        boton3.setABCommand("ABOUT");
        boton3.setToolTipText("about (A)");
        add(boton3);
        
        this.setSize( 46,420);
        this.setBackground(new Color( 245, 51, 87));
    }

    public AButton getBoton1() { return boton1; }
    public AButton getBoton2() { return boton2; }
    public AButton getBoton3() { return boton3; }

}
