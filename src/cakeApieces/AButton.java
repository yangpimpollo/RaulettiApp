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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class AButton extends JLabel implements MouseListener {

    private ABListener listener;
    private String Comando;

    private int A, B, X, Y;
    private Color R, T;
    private Font F, G;
    private ImageIcon M, N;

    public AButton() {
        setHorizontalAlignment(JLabel.CENTER);
        addMouseListener(this);
    }

    
    public void setALocation(int x, int y) {
        this.setLocation(x, y);
        this.X = x;
        this.Y = y;
    }
    public void setASize(int a, int b) {
        this.setSize(a, b);
        this.A = a;
        this.B = b;
    }
    public void setABackground(Color r) {
        this.R = r;
        this.setBackground(R);
    }
    public void setAFont(Font f) {
        this.F = f;
        this.setFont(F);
        int p = F.getSize();
        double p2 = p*1.1;
        int p3 = (int)p2;
        G = new Font("Andale Mono", 3, p3);
    }


    public void AsignarIcono(ImageIcon m) {
        M = new ImageIcon(m.getImage().getScaledInstance( A, B, Image.SCALE_SMOOTH));
        this.setIcon(M);
    }
    public void IconoContraste(ImageIcon m) {
        N = new ImageIcon(m.getImage().getScaledInstance( A, B, Image.SCALE_SMOOTH));
    }
    public void ColorContraste (Color t) {
        this.T = t;
    }
    public void addABListener(ABListener arg0){
        this.listener = arg0;
    }
    public void setABCommand(String arg0){
        this.Comando = arg0;
    }


////////////////////////////////////////////////////////////////
    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(T);
        this.setForeground(R);
        try{ this.setIcon(N); }catch (Exception et){}
        //System.out.println("entro al area");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(R);
        this.setForeground(T);
        try{ this.setIcon(M); }catch (Exception et){}
        //System.out.println("salio del area");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.setBackground(T);
        this.setForeground(R);
        this.setFont(F);
        try { this.setIcon(N); } catch (Exception et){}
        this.setSize(A, B);
        this.setLocation(X, Y);
        
  //se llama cuando has dejado de presionar el boton del mouse.
    } 
    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(R);
        this.setForeground(T);
        this.setFont(G);
        double i0 = A*1.1;
        double j0 = B*1.1;
        double k0 = X-((A*0.1)*0.5);
        double l0 = Y-((B*0.1)*0.5); 
        int i = (int)i0;
        int j = (int)j0;
        int k = (int)k0;
        int l = (int)l0; 
        this.setSize(i, j);
        this.setLocation(k, l);  
        try {   
            ImageIcon L = new ImageIcon(N.getImage().getScaledInstance( i, j, Image.SCALE_SMOOTH));
            this.setIcon(L);
        } catch (Exception et){ }
        
  //se llama cuando se mantiene presionado el boton.
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            listener.abPerformed(new ABEvent(this, Comando));
        } catch (Exception e203){}

  //se invoca cuando presionas y dejas de presionar el boton sin mover el cursor.
    }

}
