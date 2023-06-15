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

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.Color;

import cakeGUI.BoxGUI;


public class CanvaA1 {

    private BoxGUI boxGui;
    private JDialog d0;

    public CanvaA1(){

        d0 = new JDialog(boxGui.geTf0(), true);
        //d0.setIconImage
        //d0.detLayout(null);
        d0.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); 
        //d0.setUndecorated(false);
        d0.setVisible(true);
        d0.setResizable(false);
        d0.setTitle("RaulettiApp");
        d0.setModal(false);
        d0.setSize(500, 600);
        d0.setLocationRelativeTo(null);
        d0.getContentPane().setBackground(new Color( 204, 152, 232));
        
    }
}
