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



public class CanvaPD extends JPanel implements ChangeListener {

    private JLabel Torta;
    private JRadioButton bot1, bot2;
    private ButtonGroup butgroup;
    private JComboBox comboDC, comboDS;
    private int FiguraElegida;

    public CanvaPD(){
        setLayout(null);
        butgroup = new ButtonGroup();
        
        Torta = new JLabel("Diametro");
        Torta.setBounds( 25, 5, 100, 15);
        Torta.setFont(new Font("Andale Mono", 3, 15));
        Torta.setForeground(new Color( 255, 255, 255));
        add(Torta);

        bot1 = new JRadioButton("circle");
        bot1.setSize( 80, 20);
        bot1.setLocation( 30, 35);
        bot1.setBackground(new Color( 214, 16, 67));
        bot1.setFont(new java.awt.Font("Andale Mono", 3, 10));
        bot1.setForeground(new java.awt.Color( 255, 255, 255));
        bot1.addChangeListener(this);
        add(bot1);
        butgroup.add(bot1);

        bot2 = new JRadioButton("square");
        bot2.setSize( 80, 20);
        bot2.setLocation( 30, 55);
        bot2.setBackground(new Color( 214, 16, 67));
        bot2.setFont(new java.awt.Font("Andale Mono", 3, 10));
        bot2.setForeground(new java.awt.Color( 255, 255, 255));
        bot2.addChangeListener(this);
        add(bot2);
        butgroup.add(bot2);

        comboDC = new JComboBox();
        comboDC.setBounds( 25, 85, 100, 25);
        comboDC.setBackground(new java.awt.Color( 255, 255, 255));
        comboDC.setFont(new java.awt.Font("Andale Mono", 3, 14));
        comboDC.setForeground(new java.awt.Color( 0, 0, 0));
        comboDC.setEnabled(false);
        add(comboDC);

        comboDC.addItem("0");
        comboDC.addItem("14");
        comboDC.addItem("16");
        comboDC.addItem("18");
        comboDC.addItem("20");
        comboDC.addItem("22");
        comboDC.addItem("26");
        comboDC.addItem("30");
        comboDC.addItem("32");
        comboDC.addItem("34");
        comboDC.addItem("36");
        comboDC.addItem("...");

        comboDS = new JComboBox();
        comboDS.setBounds( 25, 85, 100, 25);
        comboDS.setBackground(new java.awt.Color( 255, 255, 255));
        comboDS.setFont(new java.awt.Font("Andale Mono", 3, 14));
        comboDS.setForeground(new java.awt.Color( 0, 0, 0));
        add(comboDS);

        comboDS.addItem("0");
        comboDS.addItem("15*15");
        comboDS.addItem("20*20");
        comboDS.addItem("25*25");
        comboDS.addItem("30*30");
        comboDS.addItem("32*24");
        comboDS.addItem("30*40");
        comboDS.addItem("30*60");
        comboDS.addItem("40*60");
        comboDS.addItem("40*90");
        comboDS.addItem("...");



        this.setSize( 150, 130);
        this.setBackground(new Color( 214, 16, 67));
    }
    public void stateChanged(ChangeEvent e){
        if(bot1.isSelected()){
            comboDC.setEnabled(true);
            comboDS.setVisible(false);
            comboDC.setVisible(true);
            FiguraElegida = 1;
        }
        if(bot2.isSelected()){
            comboDS.setEnabled(true);
            comboDC.setVisible(false);
            comboDS.setVisible(true);
            FiguraElegida = 2;
        }
    
    }


    public int getFiguraElegidaInt() {
        return FiguraElegida;
    }

    public ButtonGroup getButgroup() {
        return butgroup;
    }

    public JRadioButton geTbot1() {
        return bot1;
    }
    public JRadioButton geTbot2() {
        return bot2;
    }

    public JComboBox getComboDC() {
        return comboDC;
    }
    public JComboBox getComboDS() {
        return comboDS;
    }


}
