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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;



public class CanvaPm extends JPanel {

    private JComboBox comboMuñecos, comboComple;
    private JLabel labelMuñecos, labelComple;
    //private int M, C;

    public CanvaPm(){
        setLayout(null);

        comboMuñecos = new JComboBox();
        comboMuñecos.setBounds( 20, 35, 120, 25);
        comboMuñecos.setBackground(new java.awt.Color( 166, 225, 222));
        comboMuñecos.setFont(new java.awt.Font("Andale Mono", 3, 14));
        comboMuñecos.setForeground(new java.awt.Color( 0, 0, 0));
        add(comboMuñecos);

        comboMuñecos.addItem("0");
        comboMuñecos.addItem("1");
        comboMuñecos.addItem("2");
        comboMuñecos.addItem("3");
        comboMuñecos.addItem("4");
        comboMuñecos.addItem("5");
        comboMuñecos.addItem("6");
 
        comboComple = new JComboBox();
        comboComple.setBounds( 160, 35, 120, 25);
        comboComple.setBackground(new java.awt.Color( 214, 16, 67));
        comboComple.setFont(new java.awt.Font("Andale Mono", 3, 14));
        comboComple.setForeground(new java.awt.Color( 0, 0, 0));
        add(comboComple);

        comboComple.addItem("0");
        comboComple.addItem("5");
        comboComple.addItem("10");
        comboComple.addItem("15");
        comboComple.addItem("20");
        comboComple.addItem("25");
        comboComple.addItem("30");
        comboComple.addItem("35");
        comboComple.addItem("40");
        comboComple.addItem("45");
        comboComple.addItem("50");

        labelMuñecos = new JLabel("Muñecos");
        labelMuñecos.setBounds( 40, 10, 100, 15);
        labelMuñecos.setFont(new Font("Andale Mono", 3, 15));
        labelMuñecos.setForeground(new Color( 255, 255, 255));
        add(labelMuñecos);
  
        labelComple = new JLabel("Complemento");
        labelComple.setBounds( 170, 10, 100, 15);
        labelComple.setFont(new Font("Andale Mono", 3, 15));
        labelComple.setForeground(new Color( 255, 255, 255));
        add(labelComple);
 

        this.setSize( 300, 70);
        this.setBackground(new Color( 214, 16, 67));
    }

    public JComboBox getComboMuñecos() {
        return comboMuñecos;
    }
    public JComboBox getComboComple() {
        return comboComple;
    }

}
