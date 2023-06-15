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

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import java.awt.Color;

import cakeApieces.AButton;
import cakeApieces.GButton;
import cakeApieces.ACheckBox;
import cakeApieces.AComboBox;
import cakeApieces.ABEvent;
import cakeApieces.ABListener;

import cakeAction.TemAction;



public class Temple implements ABListener {

    private JFrame f0;
    private AButton a0, a1;
    private GButton g0;
    private ACheckBox ck1;
    private AComboBox cb1;
    
    private ImageIcon reIcon, reIconN;
 
    public Temple() {
        square();
    }
    public void square() {
        f0 = new JFrame();
        f0.setLayout(null);
        f0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f0.setVisible(true);
        f0.setTitle("Temple");
        f0.setSize(500,500);
        //f0.getContentPane().setBackground(new Color( 245, 51, 87));
        //f0.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f0.setLocationRelativeTo(null);

        reIcon = new ImageIcon("src/imagen/resetIcon.png");
        reIconN = new ImageIcon("src/imagen/resetIconN.png");

        a0 = new AButton();
        a0.setALocation( 150, 200);
        a0.setASize(50, 50); 
        a0.setOpaque(true);
        a0.setABackground(new Color( 255, 255, 255,0));
        a0.AsignarIcono(reIcon);
        a0.IconoContraste(reIconN);
        a0.ColorContraste(new Color( 0, 255, 0,0));
        //a0.addABListener(this);
        a0.setABCommand("COMANDOX");
        a0.addABListener(new TemAction(this)); 

        a1 = new AButton();
        a1.setText("PEN  0.00");
        a1.setALocation( 100, 100);
        a1.setASize(150, 40);
        a1.setAFont(new java.awt.Font("Andale Mono", 0, 20));
        a1.setForeground(new java.awt.Color( 245, 51, 87));
        a1.setBorder(BorderFactory.createLineBorder(new java.awt.Color( 245, 51, 87))); 
        a1.setOpaque(true);
        a1.setABackground(new Color( 255, 255, 255));
        a1.ColorContraste(new Color( 245, 51, 87));
        a1.addABListener(this);

        g0 = new GButton();
        //g0.setLocation(97,297);
 
        ck1 = new ACheckBox();
        ck1.setLocation(280,100);
        ck1.setAText("cupCake");
        //ck1.addABListener(this);
        ck1.setABCommand("COMANDOY");
        ck1.addABListener(new TemAction(this)); 

        cb1 = new AComboBox();
        cb1.setLocation(280,200);

        f0.add(a0);
        f0.add(a1);
        f0.add(g0);
        f0.add(ck1);
        f0.add(cb1);
    }

    /*public static void main(String args[]){
        new Temple();
    }*/

////////////////////////////////////////////////////////////////
    @Override
    public void abPerformed(ABEvent e){
        System.out.println("Evento exitoso!");
        System.out.println(e.getABCommand());
    }
}
