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

import javax.swing.ImageIcon;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import cakeApieces.ABEvent;
import cakeApieces.ABListener;

import cakeGUI.BoxGUI;
//import cakeData.cakeConstant;


public class ActionB5 implements ABListener {
    
    private BoxGUI boxGui;

    public ActionB5(BoxGUI boxGui) {
        this.boxGui = boxGui;
    }

    @Override
    public void abPerformed(ABEvent e){
        
        int N = boxGui.geTpl().getNInt();
        int F = boxGui.geTpl().getFInt();
        int P = boxGui.geTpl().getPInt();

        int M = boxGui.geTpm().getComboMuñecos().getSelectedIndex();
        int C = boxGui.geTpm().getComboComple().getSelectedIndex();
          int Ca = C*5;
          int Cx = Ca+10;

        String T = boxGui.geTp4().getTortaElegida();
        String Tx = "";
        String K = "";
        String Kch = boxGui.geTp4().getComboKekeCH().getSelectedItem().toString();
        String Kme = boxGui.geTp4().getComboKekeME().getSelectedItem().toString();

        int kich = boxGui.geTp4().getComboKekeCH().getSelectedIndex();
        int kime = boxGui.geTp4().getComboKekeME().getSelectedIndex();
        int Ki = 0;
        
        int J = 2;
        if(T == "A"){
            K = Kch;
            Tx = "Chantilly";
            Ki = kich;
            J = 0;
        }
        if(T == "B"){
            K = Kme;
            Tx = "Masa Elastica";
            Ki = kime;
            J = 1;
        }

    //////////////////////////////////////////////////////////////////////////
        int Fea = boxGui.geTpa().getFiguraElegidaInt();
        String D1c = boxGui.geTpa().getComboDC().getSelectedItem().toString();
        String D1s = boxGui.geTpa().getComboDS().getSelectedItem().toString();
        int D1cI = boxGui.geTpa().getComboDC().getSelectedIndex();
        int D1sI = boxGui.geTpa().getComboDS().getSelectedIndex();
        int D1i = 0;
        String D1 = "";
        if(Fea == 1){
            D1 = D1c;
            D1i = D1cI;
        }
        if(Fea == 2){
            D1 = D1s;
            D1i = D1sI+11;  
        }

        int Feb = boxGui.geTpb().getFiguraElegidaInt();
        String D2c = boxGui.geTpb().getComboDC().getSelectedItem().toString();
        String D2s = boxGui.geTpb().getComboDS().getSelectedItem().toString();
        int D2cI = boxGui.geTpb().getComboDC().getSelectedIndex();
        int D2sI = boxGui.geTpb().getComboDS().getSelectedIndex();
        int D2i = 0;
        String D2 = "";
        if(Feb == 1){
            D2 = D2c;
            D2i = D2cI;
        }
        if(Feb == 2){
            D2 = D2s;
            D2i = D2sI+11; 
        }

        int Fec = boxGui.geTpc().getFiguraElegidaInt();
        String D3c = boxGui.geTpc().getComboDC().getSelectedItem().toString();
        String D3s = boxGui.geTpc().getComboDS().getSelectedItem().toString();
        int D3cI = boxGui.geTpc().getComboDC().getSelectedIndex();
        int D3sI = boxGui.geTpc().getComboDS().getSelectedIndex();
        int D3i = 0;
        String D3 = "";
        if(Fec == 1){
            D3 = D3c;
            D3i = D3cI;
        }
        if(Fec == 2){
            D3 = D3s;
            D3i = D3sI+11; 
        }

    //////////////////////////////////////////////////////////////////////////
        ActionP1 P7 = new ActionP1(D1i, D2i, D3i, J);
        int X1ia = D1i+10;
        int X2ia = D2i+10;
        int X3ia = D3i+10;

        String code = "byAmber: "+Ki+""+X1ia+""+X2ia+""+X3ia+""+T+""+N+""+F+""+P+""+M+""+Cx;
 
        ActionB6 QR = new ActionB6(code);
    //////////////////////////////////////////////////////////////////////////          
      
        if (e.getABCommand().equals("botCake")) {
            
            if ( T != null ){

            boxGui.geTp5().setTortaText("                                                                                                "+Ki+""+X1ia+""+X2ia+""+X3ia+""+T+" "+
                                      "\n            Torta :     "+Tx+"  ."+
                                      "\n            Keke :     "+K+"  ."+
                                      "\n      Numero :     "+D1+"  "+D2+"  "+D3+
                                      "\n                                                                            N"+N+"-F"+F+"-P"+P+"     M"+M+"  C"+Cx+" ."
                                                                  );
            System.out.println(code);
            } else {
            boxGui.geTp5().setTortaText("\n\n   seleccione su torta ");
            }
        }  
        if (e.getABCommand().equals("botCake")) {
//////////////////////////////////////////////////////////////////////
            boxGui.geTpa().getComboDC().setSelectedIndex(0);
            boxGui.geTpa().getComboDS().setSelectedIndex(0);
            boxGui.geTpb().getComboDC().setSelectedIndex(0);
            boxGui.geTpb().getComboDS().setSelectedIndex(0);
            boxGui.geTpc().getComboDC().setSelectedIndex(0);
            boxGui.geTpc().getComboDS().setSelectedIndex(0);

            boxGui.geTpa().getButgroup().clearSelection();
//////////////////////////////////////////////////////////////////////

        //-----------------------------------------------------
            P7.operacion1(D1i, J);
            P7.operacion2(D2i, J);
            P7.operacion3(D3i, J);
            P7.operacion4();
            P7.operacion5();
            int q1 = P7.getQ1();
            int q2 = P7.getQ2();
            int q3 = P7.getQ3();
            int HM = P7.getH();  
        //-----------------------------------------------------
            boxGui.geTp5().setPorcionText1("  PN   : "+q1);
            boxGui.geTp5().setPorcionText2("  PP   : "+q2);
            boxGui.geTp5().setPorcionText3("  PMax : "+q3);

            boxGui.geTp5().setPrecioText("   PEN  "+HM+".00");
        //-----------------------------------------------------
            QR.calculoQR(code);
            ImageIcon iconoQR = new ImageIcon(QR.getQR());
            boxGui.geTp6().setIcon(iconoQR);
            
        }

    }


}
