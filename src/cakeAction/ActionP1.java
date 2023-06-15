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

import static java.lang.Math.*;



public class ActionP1 {

    private static int PrecioT[][] = { {0,  50,  55,  55,  60,  70,  80,  90, 115, 125, 145,   0,  70,  80,  90, 100, 115, 135, 180, 225, 265} , 
                                       {0,  55,  60,  60,  65,  80, 105, 120, 145, 165, 185,   0,  85,  95, 125, 165, 140, 175, 225, 265, 325} };

    private static double RadioT[] = {0,  14,  16,  18,  20,  22,  26,  30,  32,  34,  36,  0,  16.92,  22.56,  28.2,  33.85,  31.27,  39.08,  47.87,  55.27,  67.7 };

    private int w1;
    private int w2;
    private int w3;
    private int wa;
    private int T0;

    private int h1;
    private int h2;
    private int h3;
    private int h;
    private int P3;

    private double ia;                  /*   diametro tomado del array   */
    private double P2;                  /*   cantidad de porciones       */
    private static double PO = 45.200779704;        /*  area de porcion  */

    private double t1;
    private double t2;
    private double t3;
    private double t;
    private double tp;
    private double tm;

    private int q1;
    private int q2;
    private int q3;



    public ActionP1(int D1i, int D2i, int D3i, int J) {
        this.w1 = D1i;
        this.w2 = D2i;
        this.w3 = D3i;
        this.T0 = J;
    }

    public void operacion1(int w1, int T0){
        wa = w1;
        calculo();
        t1 = P2;
        h1 = P3;
        System.out.println("op1...");
    }
    public void operacion2(int w2, int T0){
        wa = w2;
        calculo();
        t2 = P2;
        h2 = P3;
        System.out.println("op2...");
    }
    public void operacion3(int w3, int T0){
        wa = w3;
        calculo();
        t3 = P2;
        h3 = P3;
        System.out.println("op3...");
    }
  //-------------------------------------
    public void operacion4(){
        t = t1+t2+t3;
        tm = t*2;
        tp = (t+tm)/2;
        q1 = (int) Math.round(t);
        q2 = (int) Math.round(tp);
        q3 = (int) Math.round(tm);
        System.out.println("op4...");
    }
    public void operacion5(){
        h = h1+h2+h3;
    }

    public void calculo(){
        ia = RadioT[wa];
        P2 = (PI*(pow(ia,2)))/180.80311882;
        P3 = PrecioT[T0][wa];
    }

    public int getQ1() { return q1; }
    public int getQ2() { return q2; }
    public int getQ3() { return q3; }

    public int getH() { return h; }

}
