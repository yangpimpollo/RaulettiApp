/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cakeAction;

/**
 *
 * @author Amber
 */

import cakeApieces.ABEvent;
import cakeApieces.ABListener;

import cakeGUI.BoxGUI;



public class ActionB2 implements ABListener {
    
    private BoxGUI boxGui;

    public ActionB2(BoxGUI boxGui) {
        this.boxGui = boxGui;
    }

    @Override
    public void abPerformed(ABEvent e){

        if (e.getABCommand().equals("TMENU")) {
            System.out.println("111");
            boxGui.geTd0().setVisible(true);
        }
        if (e.getABCommand().equals("RESET")) {
            System.out.println("333");
            boxGui.geTf0().setVisible(false);
            boxGui.geTf0().setVisible(true);
        }
        if (e.getABCommand().equals("ABOUT")) {
            System.out.println("222");
            boxGui.geTp5().setVisible(false);
        }
        
    }
}
