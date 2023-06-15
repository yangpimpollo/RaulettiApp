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
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class CanvaP4 extends JPanel implements ChangeListener {

    private ButtonGroup butgroup;
    private JRadioButton bot1, bot2;
    private JLabel labelTorta;
    private JComboBox comboKekeCH, comboKekeME;
    private String TortaElegida;

    public CanvaP4(){
        setLayout(null);
        butgroup = new ButtonGroup();
        
        bot1 = new JRadioButton("Chantilly");
        bot1.setSize( 120, 25);
        bot1.setLocation(120, 15);
        bot1.setBackground(new Color( 188, 233, 231));
        bot1.setFont(new java.awt.Font("Andale Mono", 3, 14));
        bot1.setForeground(new java.awt.Color( 0, 0, 0));
        //bot1.setSelected(true);         seleccion por defecto
        bot1.addChangeListener(this);
        bot1.setActionCommand("bot1");
        add(bot1);
        butgroup.add(bot1);

        bot2 = new JRadioButton("Masa Elastica");
        bot2.setSize( 120, 25);
        bot2.setLocation(120, 45);
        bot2.setBackground(new Color( 166, 225, 222));
        bot2.setFont(new java.awt.Font("Andale Mono", 3, 14));
        bot2.setForeground(new java.awt.Color( 0, 0, 0));
        bot2.addChangeListener(this);
        bot2.setActionCommand("bot2");
        add(bot2);
        butgroup.add(bot2);

        labelTorta = new JLabel("TORTA");
        labelTorta.setBounds( 40, 35, 100, 15);
        labelTorta.setFont(new Font("Andale Mono", 3, 15));
        labelTorta.setForeground(new Color( 255, 255, 255));
        add(labelTorta);

        comboKekeCH = new JComboBox();
        comboKekeCH.setBounds(50,100,180,25);
        comboKekeCH.setBackground(new java.awt.Color( 255, 255, 255));
        comboKekeCH.setFont(new java.awt.Font("Andale Mono", 3, 14));
        comboKekeCH.setForeground(new java.awt.Color( 0, 0, 0));
        comboKekeCH.setEnabled(false);
        add(comboKekeCH);

        comboKekeCH.addItem("Ingles");
        comboKekeCH.addItem("Biscochuelo");
        comboKekeCH.addItem("Chocolate");
        comboKekeCH.addItem("Vainilla");
        comboKekeCH.addItem("VainillaC/Chispa");

        comboKekeME = new JComboBox();
        comboKekeME.setBounds(50,100,180,25);
        comboKekeME.setBackground(new java.awt.Color( 255, 255, 255));
        comboKekeME.setFont(new java.awt.Font("Andale Mono", 3, 14));
        comboKekeME.setForeground(new java.awt.Color( 0, 0, 0));
        comboKekeME.setEnabled(false);
        add(comboKekeME);

        comboKekeME.addItem("Ingles");
        comboKekeME.addItem("Novia");
        comboKekeME.addItem("Vainilla");
        comboKekeME.addItem("VainillaC/Chispa");
        


        this.setSize( 280, 150);
        this.setBackground(new Color( 59, 179, 174));
    }
    public void stateChanged(ChangeEvent e){
        if(bot1.isSelected()){
            comboKekeCH.setEnabled(true);
            comboKekeME.setVisible(false);
            comboKekeCH.setVisible(true);
            TortaElegida = "A";
        }
        if(bot2.isSelected()){
            comboKekeME.setEnabled(true);
            comboKekeCH.setVisible(false);
            comboKekeME.setVisible(true);
            TortaElegida = "B";
        }
    
    }

    public String getTortaElegida() {
        return TortaElegida;
    }

    public JComboBox getComboKekeCH() {
        return comboKekeCH;
    }
    public JComboBox getComboKekeME() {
        return comboKekeME;
    }

    public JRadioButton getBot1() {
        return bot1;
    }
    public JRadioButton getBot2() {
        return bot2;
    }
    

}
