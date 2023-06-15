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

import javax.swing.*;
import java.awt.*;



public class Preload extends JFrame implements Runnable{

    int x = 0;
    int y = 0;
    int m = 0;
    
    private JLabel label2, label3;
    private Image dbImage;
    private Graphics dbg0;
    private BoxGUI ventana = new BoxGUI();
    /////////////////////////////////////////////////////////////
    public Preload(){
        preloadsquare();
    }

    public void preloadsquare(){
        
        ImageIcon favicon = new ImageIcon("src/imagen/icon.png");
        setIconImage(favicon.getImage());
        //setIconImage(new ImageIcon(getClass().getResource("../imagen/icon.png")).getImage());
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
        setTitle("RaulettiApp歡迎");
        setSize(500,300);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color( 245, 51, 87)); 

        label2 = new JLabel("RaulettiApp 歡迎  version 0.2 by Amber");
        label2.setBounds(340,3,300,30);
        label2.setFont(new Font("Andale Mono", 3, 8));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Pastelería");
        label3.setBounds(330,30,300,100);
        label3.setFont(new Font("Andale Mono", 1, 30));
        label3.setForeground(new Color(0,0,0));
        add(label3);
        
    }
    /////////////////////////////////////////////////////////////
    /*public static void main(String args[]){
        Thread hilo1 = new Thread(new Preload());
        hilo1.start();       
    }*/
    /////////////////////////////////////////////////////////////
    private void update(){
        if(x<=500){
            x+=1;
            y=x/5;
            repaint();

            if(y<=45){
                m=20;
            }else {
                 m=255;
             }
            pausa(20);
        }else{
            pausa(3000);
            x = -50;
            System.out.println("de nuevo");
            ventana.Activar();
            dispose();
            
            //setVisible(false);
            //System.exit(0);
            //Box1 r2 = new Box1();
            //System.exit(0);
        }
    }
    /////////////////////////////////////////////////////////////
    public void paint(Graphics g){
        dbImage = createImage(getWidth(), getHeight());
        dbg0 = dbImage.getGraphics();
        paintComponent(dbg0);
        g.drawImage(dbImage, 0, 0, this);
    }
    public void paintComponent(Graphics g){
        super.paint(g);
        Graphics2D midibujo = (Graphics2D) g;

        int[] coordenadas0X={0,500,500,0};
        int[] coordenadas0Y={130,230,530,330};
        int n0Puntos=4;
  
        midibujo.setColor(new Color(59, 179, 174));
        midibujo.fillPolygon(coordenadas0X, coordenadas0Y, n0Puntos);
        
        int[] coordenadasX={0,500,500,275,0};
        int[] coordenadasY={230,180,230,330,330};
        int nPuntos=5;
  
        midibujo.setColor(new Color(214,16,67));
        midibujo.fillPolygon(coordenadasX, coordenadasY, nPuntos);
       
        midibujo.setColor(new Color(255,255,255));
        midibujo.fillRect(0, 285, x, 3);

        Toolkit t = Toolkit.getDefaultToolkit();
        Image imagen = t.getImage ("src/imagen/logo3.png");
        midibujo.drawImage(imagen, 200, 0, 300, 300, this);

        midibujo.setColor(new Color(255,255,255));
        midibujo.setFont(new Font("Andale Mono", 3, 10));
        midibujo.drawString("Loading... "+y+"%", 10, 280);

        /////////////////////////////////////
        
        
    }
    /////////////////////////////////////////////////////////////
    @Override
    public void run(){
        
        while(x>=0){
            update();
            
        }
    }
    public void pausa(int mlseg){
        try {
            Thread.sleep(mlseg);
        } catch (Exception e) {
          }
    }

}
