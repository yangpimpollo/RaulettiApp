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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cakeGUI.BoxGUI;



public class ActionB4 implements ActionListener {
    
    private BoxGUI boxGui;

    public ActionB4(BoxGUI boxGui) {
        this.boxGui = boxGui;
    }

    @Override
    public void actionPerformed(ActionEvent e){

        //String b = box1.geTp4().getTortaElegida().toString(); 
 
        if (e.getActionCommand().equals("bot1")) {
            
            boxGui.geTpb().geTbot1().setEnabled(false);
            boxGui.geTpb().geTbot2().setEnabled(false);
            boxGui.geTpc().geTbot1().setEnabled(false);
            boxGui.geTpc().geTbot2().setEnabled(false);

            //box1.geTpb().geTbot1().setSelected(false);
            //box1.geTpb().geTbot2().setSelected(false);

            boxGui.geTpb().getComboDC().setEnabled(false);
            boxGui.geTpb().getComboDS().setEnabled(false);
            boxGui.geTpc().getComboDC().setEnabled(false);
            boxGui.geTpc().getComboDS().setEnabled(false);

            boxGui.geTpa().getComboDC().setSelectedIndex(0);
            boxGui.geTpa().getComboDS().setSelectedIndex(0);
            boxGui.geTpb().getComboDC().setSelectedIndex(0);
            boxGui.geTpb().getComboDS().setSelectedIndex(0);
            boxGui.geTpc().getComboDC().setSelectedIndex(0);
            boxGui.geTpc().getComboDS().setSelectedIndex(0);
        }
        if (e.getActionCommand().equals("bot2")) {

            boxGui.geTpb().geTbot1().setEnabled(true);
            boxGui.geTpb().geTbot2().setEnabled(true);
            boxGui.geTpc().geTbot1().setEnabled(true);
            boxGui.geTpc().geTbot2().setEnabled(true);

            boxGui.geTpa().getComboDC().setSelectedIndex(0);
            boxGui.geTpa().getComboDS().setSelectedIndex(0);
        }
        
    }


}
