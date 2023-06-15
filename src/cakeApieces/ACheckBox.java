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



public class ACheckBox extends JPanel implements MouseListener  {

    private ABListener listener;
    private String Comando;
    
    private Color R = new Color(255,255,255);
    private Color S = new Color(214,14,67);
    private Color T = new Color( 255, 255, 255);
    private Color U = new Color( 214, 14, 67);

    private int x = 0;
    private String L;

    public ACheckBox(){
        setLayout(null);
        setSize(106,31);
        setBackground(new Color(214,14,67));
        addMouseListener(this);
    }

    public void setAText(String l) {
        this.L = l;
    }
    public void addABListener(ABListener arg0){
        this.listener = arg0;
    }
    public void setABCommand(String arg0){
        this.Comando = arg0;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D relleno = (Graphics2D) g;
        Graphics2D borde = (Graphics2D) g;
        Graphics2D check = (Graphics2D) g;
        Graphics2D letra = (Graphics2D) g;
        Graphics2D checI = (Graphics2D) g;

        relleno.setColor(U);
        relleno.fillRoundRect(3, 3, 100, 25, 10, 10);
        borde.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        borde.setColor(new Color( 255, 255, 255));
        borde.drawRoundRect (3, 3, 100, 25, 10, 10);
        if(x==0){
            check.setColor(T);
            check.drawRoundRect (8, 7, 17, 17, 7, 7);
        }
        letra.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        letra.setColor(T);
        letra.setFont(new Font("Andale Mono", 3, 14));
        letra.drawString(L, 30, 21);
        if(x==1){
            Toolkit t = Toolkit.getDefaultToolkit();
            Image imagen = t.getImage ("src/imagen/check.png");
            checI.drawImage(imagen, 8, 8, 16, 16, this);
        }
    }
    ////////////////////////////////////////////////////////////////
    @Override
    public void mouseEntered(MouseEvent e) {
        if(x == 0) {
            T = S;
            U = R;
            repaint();
        }
  //System.out.println("entro al area");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if(x == 0) {
            T = R;
            U = S;
            repaint();
        }
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

        if(x == 0) {
            T = R;
            U = S;
            x = 1;
            repaint();
        } else {
            T = S;
            U = R;
            x = 0;
            repaint();
        }
        try {
            listener.abPerformed(new ABEvent(this, x, Comando));
        } catch (Exception e203){}
  //se invoca cuando presionas y dejas de presionar el boton sin mover el cursor.
    }
    public int getACState() { return x; }
}
