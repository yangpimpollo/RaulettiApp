/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakeApieces;

/**
 *
 * @author Amber
 */

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class GButton extends JLabel implements MouseListener {

    private Graphics2D relleno;
    private Color T = new Color(245,51,87);
    private Color R = new Color(255,255,255);
    private Color S = new Color(255,255,255);
    private Color U = new Color(245,51,87);

    public GButton() {
        setSize(156,46);
        //setBackground(null);
        setLocation(97,297);
        setOpaque(true);
        setBackground(new Color(0,0,0,50));
        addMouseListener(this);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //Graphics2D g2d = (Graphics2D) g;
        //Graphics2D myboton = (Graphics2D) g;

        Graphics2D relleno = (Graphics2D) g;
        Graphics2D borde = (Graphics2D) g;
        Graphics2D letra = (Graphics2D) g;

        letra.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        relleno.setColor(S);
        relleno.fillRoundRect(3, 3, 150, 40, 40, 40);
        borde.setColor(new Color(245,51,87));
        //myboton.setStroke(new BasicStroke(2));
        borde.drawRoundRect (3, 3, 150, 40, 40, 40);
        
        letra.setColor(U);
        letra.setFont(new Font("Andale Mono", 0, 20));
        letra.drawString("   PEN  0.00", 3, 32);
    }

    ////////////////////////////////////////////////////////////////
    @Override
    public void mouseEntered(MouseEvent e) {
        S = T;
        U = R;
        repaint();
        //System.out.println("entro al area");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        S = R;
        U = T;
        repaint();
        //System.out.println("salio del area");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        S = T;
        U = R;
        repaint();
  //se llama cuando has dejado de presionar el boton del mouse.
    } 
    @Override
    public void mousePressed(MouseEvent e) {
        S = R;
        U = T;
        repaint();
  //se llama cuando se mantiene presionado el boton.
    }
    @Override
    public void mouseClicked(MouseEvent e) {
  //se invoca cuando presionas y dejas de presionar el boton sin mover el cursor.
    }
}
