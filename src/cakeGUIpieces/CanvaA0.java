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

import javax.swing.JWindow;
import java.awt.Color;



public class CanvaA0 {

    private JWindow w0;

    public CanvaA0() {

        w0 = new JWindow();     
        w0.setSize(500, 600); 
        w0.setVisible(false);
        w0.getContentPane().setBackground(new Color( 245, 51, 87));
        w0.setLocationRelativeTo(null);
        //w0.setDefaultCloseOperation(JWindow.EXIT_ON_CLOSE); 
    }

    public JWindow getW0() { return w0; }
}
