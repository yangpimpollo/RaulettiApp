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



public class ABEvent {

    private AButton abutton;
    private ACheckBox acheckBox;
    private String command;
    private int state;

    public ABEvent (AButton abutton, String command){
        this.abutton = abutton;
        this.command = command;
    }
    public ABEvent (ACheckBox acheckBox, int state, String command){
        this.acheckBox = acheckBox;
        this.state = state;
        this.command = command;
    }

    public AButton getAButton(){
        return abutton;
    }  
    public int getACState(){
        return state;
    }
    public String getABCommand(){
        return command;
    }
}
