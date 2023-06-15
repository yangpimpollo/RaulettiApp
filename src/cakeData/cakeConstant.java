/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakeData;

/**
 *
 * @author Amber
 */

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;


public class cakeConstant {

    public static ImageIcon favicon = new ImageIcon("src/imagen/icon.png");

    public static ImageIcon ckIcon0 = new ImageIcon("src/imagen/cupcake.png");
    public static ImageIcon reIcon0 = new ImageIcon("src/imagen/resetIcon.png");
    public static ImageIcon abIcon0 = new ImageIcon("src/imagen/aboutIcon.png");

    public static ImageIcon ckIcon = new ImageIcon(ckIcon0.getImage().getScaledInstance( 40, 40, Image.SCALE_SMOOTH));
    public static ImageIcon reIcon = new ImageIcon(reIcon0.getImage().getScaledInstance( 30, 30, Image.SCALE_SMOOTH));
    public static ImageIcon abIcon = new ImageIcon(abIcon0.getImage().getScaledInstance( 27, 27, Image.SCALE_SMOOTH));

    public static ImageIcon reIcon0N = new ImageIcon("src/imagen/resetIconN.png");
    public static ImageIcon reIconN = new ImageIcon(reIcon0N.getImage().getScaledInstance( 30, 30, Image.SCALE_SMOOTH));
    public static ImageIcon abIcon0N = new ImageIcon("src/imagen/aboutIconN.png");
    public static ImageIcon abIconN = new ImageIcon(abIcon0N.getImage().getScaledInstance( 27, 27, Image.SCALE_SMOOTH));

    public static ImageIcon iconQR = new ImageIcon("src/imagen/iconQR.png");
    public static ImageIcon iconQ2 = new ImageIcon("src/imagen/QR6.png");  

    //public static favicon;
    public static final String PLAYER = "PLAYER";
    public static final Color Cf53357 = new Color( 245,  51,  87);    //ROJO ESCARLATA
    public static final Color Cd61043 = new Color( 214,  16,  67);    //ROJO MAS ESCARLATA
    public static final Color C3bb3ae = new Color(  59, 179, 174);    //TURQUESA
    public static final Color Cbce9e7 = new Color( 188, 233, 231);    //TURQUESA 1
    public static final Color Ca6e1de = new Color( 166, 225, 222);    //TURQUESA 2
    public static final Color C6dcfca = new Color( 109, 207, 202);    //TURQUESA 3
    public static final Color C000000 = new Color(   0,   0,   0);    //NEGRO
    public static final Color Cffffff = new Color( 255, 255, 255);    //BLANCO
    public static final Color C00ff00 = new Color(   0, 255,   0);    //VERDE

    //public static void init(){
        //favicon = loadImage("src/imagen/icon.png");
        //favicon = new ImageIcon("src/imagen/icon.png");
    //}
}
