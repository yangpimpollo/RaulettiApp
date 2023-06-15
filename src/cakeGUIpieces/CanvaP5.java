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
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Font;

import cakeApieces.AButton;



public class CanvaP5 extends JPanel {

    private AButton botCake;
    private JLabel precioText, porcionText1, porcionText2, porcionText3;
    private JTextArea tortaText;

    public CanvaP5(){
        setLayout(null);

        botCake = new AButton();
        botCake.setText("CAKE");
        botCake.setALocation( 60, 10);
        botCake.setASize(200, 40);
        botCake.setAFont(new java.awt.Font("Andale Mono", 3, 20));
        botCake.setForeground(new java.awt.Color( 245, 51, 87));
        botCake.setOpaque(true);
        botCake.setABackground(new Color( 255, 255, 255));
        botCake.ColorContraste(new Color( 245, 51, 87));
        botCake.setABCommand("botCake");
        add(botCake);
        //botCake.setEnabled(false);

        tortaText = new JTextArea("\n\n\n       Welcome to RaulettiApp ");
        tortaText.setEditable(false);
        tortaText.setBounds( 30, 60, 350, 80);
        tortaText.setOpaque(true);
        tortaText.setBackground(new Color( 255, 255, 255));
        this.add(tortaText);

        precioText = new JLabel("   PEN  0.00");
        precioText.setBounds( 490, 20, 150, 40);
        precioText.setFont(new java.awt.Font("Andale Mono", 0, 20));
        precioText.setForeground(new java.awt.Color( 0, 0, 0));
        precioText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        this.add(precioText);

        porcionText1 = new JLabel("  PN   :");
        porcionText1.setBounds( 430, 90, 80, 30);
        porcionText1.setOpaque(true);
        porcionText1.setBackground(new Color( 0, 255, 0));
        this.add(porcionText1);
        porcionText2 = new JLabel("  PP   :");
        porcionText2.setBounds( 525, 90, 80, 30);
        porcionText2.setOpaque(true);
        porcionText2.setBackground(new Color( 0, 255, 0));
        this.add(porcionText2);
        porcionText3 = new JLabel("  PMax :");
        porcionText3.setBounds( 620, 90, 80, 30);
        porcionText3.setOpaque(true);
        porcionText3.setBackground(new Color( 0, 255, 0));
        this.add(porcionText3);
        
        this.setSize( 740, 150);
        this.setBackground(new Color( 59, 179, 174));
    }

    public AButton getBotCake() {
        return botCake;
    }

    public JTextArea getTortaText() {
        return tortaText;
    }

    public void setTortaText(String a) {
        getTortaText().setText(a);
    }


    public JLabel getPrecioText() {
        return precioText;
    }

    public void setPrecioText(String a) {
        getPrecioText().setText(a);
    }


    public JLabel getPorcionText1() {
        return porcionText1;
    }

    public void setPorcionText1(String a) {
        getPorcionText1().setText(a);
    }

    public JLabel getPorcionText2() {
        return porcionText2;
    }

    public void setPorcionText2(String a) {
        getPorcionText2().setText(a);
    }

    public JLabel getPorcionText3() {
        return porcionText3;
    }

    public void setPorcionText3(String a) {
        getPorcionText3().setText(a);
    }

}
