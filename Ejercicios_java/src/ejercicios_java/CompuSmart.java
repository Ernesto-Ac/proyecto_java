/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.util.Scanner;

/**
 *
█║▌│█│║▌║││█║▌║▌║█║
©José Ernesto Acevedo Vásquez®  
 ---------- SIS21A------------
 */
public class CompuSmart {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Digite el total de sus ventas");
            double toto = leer.nextDouble();
            salLiquido(toto); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void salLiquido(double totalVenta){
        double salFinal = 0.0;
        double comision = 0.0;
        double desc = 0.0;
        String Mensaje = "";
        if(totalVenta > 1 && totalVenta <=999){
            Mensaje = "__Rango bajo de ventas__";
            comision = totalVenta * .05;
            desc = (300 + comision)*.1;
            salFinal = (300 + comision) - desc;
        }else if(totalVenta >= 1000 && totalVenta<=2999){
            Mensaje = "__Rango medio de ventas__";
            comision = totalVenta * .08;
            desc = (300 + comision)*.1;
            salFinal = (300 + comision) - desc;
        }else if(totalVenta>= 3000){
            Mensaje = "__Rango alto de ventas__";
            comision = totalVenta * .1;
            desc = (300 + comision)*.1;
            salFinal = (300 + comision) - desc; 
        }else{
            System.out.println("Mensaje");
        }
        System.out.println(Mensaje);
        System.out.println("Su salario final será de $"+salFinal);
    }
}
