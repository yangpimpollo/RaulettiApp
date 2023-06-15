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

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.RenderingHints;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class AComboBox extends JPanel implements MouseListener {

    private int a = 25;    

    public AComboBox(){
        setLayout(null);
        setSize(106,31);
        setBackground(new Color(214,14,67, 0));  
        //addMouseListener(this);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D relleno = (Graphics2D) g;
        Graphics2D borde = (Graphics2D) g;
        Graphics2D linea = (Graphics2D) g;
        //Graphics2D letra = (Graphics2D) g;
        //Graphics2D checI = (Graphics2D) g;

        relleno.setColor(new Color(214,14,67));
        relleno.fillRoundRect(3, 3, 100, a, 10, 10);

        borde.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        borde.setColor(new Color( 255, 255, 255));
        borde.drawRoundRect (3, 3, 100, a, 10, 10);

        for (int i = 0; i < 4; i++) {
            int b = (i+1)*18;
            linea.drawLine(13, b, 93, b);
            //linea.addMouseListener(this);
        }

        /*letra.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        letra.setColor(T);
        letra.setFont(new Font("Andale Mono", 3, 14));
        letra.drawString(L, 30, 21);

        Toolkit t = Toolkit.getDefaultToolkit();
        Image imagen = t.getImage ("src/imagen/check.png");
        checI.drawImage(imagen, 8, 8, 16, 16, this);*/
    }

    ////////////////////////////////////////////////////////////////
    @Override
    public void mouseEntered(MouseEvent e) {
  //System.out.println("entro al area");
    }
    @Override
    public void mouseExited(MouseEvent e) {
  //System.out.println("salio del area");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
  //se llama cuando has dejado de presionar el boton del mouse.
    } 
    @Override
    public void mousePressed(MouseEvent e) {
  //se llama cuando se mantiene presionado el boton.
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        setSize(106,131);
        a = 125;
        repaint();
  //se invoca cuando presionas y dejas de presionar el boton sin mover el cursor.
    }
}
