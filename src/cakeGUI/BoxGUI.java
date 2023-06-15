/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakeGUI;

/**
 *
 * @author Amber
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDialog;
import java.awt.Color;
import java.awt.Font;

import cakeData.cakeConstant;
import cakeGUIpieces.*;
import cakeAction.*;


public class BoxGUI {

    private JFrame f0;
    private JLabel footer;
    private JDialog d0;

    private CanvaP2 p2;
    private CanvaP4 p4;
    private CanvaP5 p5;
    private CanvaP6 p6;
    private CanvaPD pa, pb, pc;
    private CanvaPk pk;
    private CanvaPl pl;
    private CanvaPm pm;
    //private CanvaA0 a0;
    //private CanvaA1 a1;

    public BoxGUI() {
        gui();
    }
    public void gui(){
 
        f0 = new JFrame();
        f0.setIconImage(cakeConstant.favicon.getImage());
        f0.setLayout(null);
        f0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f0.setUndecorated(false);
        f0.setVisible(false);
        f0.setResizable(false);
        f0.setTitle("RaulettiApp");
        f0.setSize( 800, 463);
        f0.setLocationRelativeTo(null);
        f0.getContentPane().setBackground(cakeConstant.Cf53357);
        
      /////////////////////////////////////////////////////////////////////////
        d0 = new JDialog( f0, true);
        //d0.setIconImage
        //d0.detLayout(null);
        d0.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); 
        //d0.setUndecorated(false);
        d0.setVisible(false);
        d0.setResizable(false);
        d0.setTitle("Menu && porciones");
        d0.setModal(false);
        d0.setSize(500, 600);
        d0.setLocationRelativeTo(null);
        d0.getContentPane().setBackground(cakeConstant.Cf53357);

      /////////////////////////////////////////////////////////////////////////
        p2 = new CanvaP2();
        p2.setLocation( 0, 20);
        p2.getBoton1().addABListener(new ActionB2(this)); 
        p2.getBoton2().addABListener(new ActionB2(this)); 
        p2.getBoton3().addABListener(new ActionB2(this)); 
        
        p4 = new CanvaP4();
        p4.setLocation( 45, 0);
        p4.getBot1().addActionListener(new ActionB4(this)); 
        p4.getBot2().addActionListener(new ActionB4(this)); 
        
        p5 = new CanvaP5();
        p5.setLocation( 60, 270);
        p5.getBotCake().addABListener(new ActionB5(this)); 

        p6 = new CanvaP6();
        p6.setLocation( 670, 150);
        //p6.getBotCake().addActionListener(new ActionB5(this)); 

        pa = new CanvaPD();
        pa.setLocation( 335, 15);
        
        pb = new CanvaPD();
        pb.setLocation( 490, 15);
        
        pc = new CanvaPD();
        pc.setLocation( 645, 15);
        
        pk = new CanvaPk();
        pk.setLocation( 0, 175);
        pk.getCupkakeCk().addABListener(new ActionBk(this)); 
        
        pl = new CanvaPl();
        pl.setLocation( 155, 165);
        
        pm = new CanvaPm();
        pm.setLocation( 360, 175);

        footer = new JLabel("RaulettiApp 歡迎  version 0.2 by Amber");
        footer.setBounds( 610, 413, 300, 30);
        footer.setFont(new Font("Andale Mono", 3, 8));
        footer.setForeground(new Color( 255, 255, 255));  
        footer.setToolTipText("by Amber");

      /////////////////////////////////////////////////////////////////////////

        f0.add(footer);  
        f0.add(pa);
        f0.add(pb);
        f0.add(pc);
        f0.add(pk);
        f0.add(pl);
        f0.add(pm);

        f0.add(p6);
        f0.add(p5);
        f0.add(p4);
        f0.add(p2);    
    }

    /*public static void main(String args[]){
        new BoxGUI();
        System.out.println(cakeConstant.PLAYER);
        //Thread hilo1 = new Thread(new ActionBk());
        //hilo1.start();
    }*/
      /////////////////////////////////////////////////////////////////////////
    public CanvaP2 geTp2() { return p2; }
    public CanvaP4 geTp4() { return p4; }
    public CanvaP5 geTp5() { return p5; }
    public CanvaP6 geTp6() { return p6; }

    public CanvaPD geTpa() { return pa; }
    public CanvaPD geTpb() { return pb; }
    public CanvaPD geTpc() { return pc; }

    public CanvaPk geTpk() { return pk; }
    public CanvaPl geTpl() { return pl; }
    public CanvaPm geTpm() { return pm; }

    //public CanvaA0 geTa0() { return a0; }
    //public CanvaA1 geTa1() { return a1; }
    public JFrame geTf0() { return f0; }
    public JDialog geTd0() { return d0; }

    public void Activar() {
        f0.setVisible(true);
    }

}

/*      蛋糕計算機 - cake calculator        */
/*      by.amber: 0261010A010425          */