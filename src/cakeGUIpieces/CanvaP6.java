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

import javax.swing.JLabel;
import javax.swing.JToolTip;
import java.awt.Color;

import cakeData.cakeConstant;


public class CanvaP6 extends JLabel {
    public CanvaP6(){
        this.setOpaque(true);
        this.setSize( 115, 115);
        this.setBackground(new Color( 255, 255, 255));
        this.setIcon(cakeConstant.iconQR);
        this.setToolTipText("codeQR (Q)");
    }
}
