/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
█║▌│█│║▌║││█║▌║▌║█║
©José Ernesto Acevedo Vásquez®  
 ---------- SIS21A------------
 */
public class masaCorporal {
    public static void main(String[] args) {
        try {
           
            Scanner leer = new Scanner(System.in);
             System.out.println("Digite su peso");
             double peso = leer.nextDouble();
             System.out.println("Digite su estatura");
             double estatura = leer.nextDouble();
             diagnostico(peso, estatura);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }
     
    public static void diagnostico(double peso, double estatura){
        NumberFormat formato = new DecimalFormat("#,###.##");
        double mCorpo = 0;
        String sms = "";
        mCorpo = peso / (Math.pow(estatura,2));
        
        if (mCorpo < 18) {
            System.out.println("-----------------------------------------");
            System.out.println("Masa Corporal: " + formato.format(mCorpo) + " kg");
            System.out.println("Peso bajo. Necesario valorar signos de desnutrición");
        }else if(mCorpo >= 18 && mCorpo <=24.9){
             System.out.println("-----------------------------------------");
            System.out.println("Masa Corporal: " + formato.format(mCorpo) + " kg");
            System.out.println("Normal");
        }else if(mCorpo >=25 && mCorpo <=26.9){
             System.out.println("-----------------------------------------");
            System.out.println("Masa Corporal: " + formato.format(mCorpo) + " kg");
            System.out.println("Sobrepeso");
        }else if(mCorpo ==27){
            System.out.println("-----------------------------------------");
            System.out.println("Masa Corporal: " + formato.format(mCorpo) + " kg");
            System.out.println("Obesidad");
        }else if(mCorpo>27 && mCorpo <=29.9){
             System.out.println("-----------------------------------------");
            System.out.println("Masa Corporal: " + formato.format(mCorpo) + " kg");
            System.out.println("Obesidad grado I\n. Riesgo relativo alto para desarrollar enfermedades cardiovasculares");
        }else if(mCorpo>=30 && mCorpo <=39.9){
            System.out.println("-----------------------------------------");
            System.out.println("Masa Corporal: " + formato.format(mCorpo) + " kg");
             System.out.println("Obesidad grado II\nRiesgo relativo muy alto para el desarrollo de enfermedades\n" +
              "cardiovasculares");
        }else if (mCorpo>40) {
            System.out.println("-----------------------------------------");
            System.out.println("Masa Corporal: " + formato.format(mCorpo) + " kg");
            System.out.println("Obesidad grado III Extrema o Mórbida\nRiesgo relativo extremadamente alto para el desarrollo\n" +
            "de enfermedades cardiovasculares");
        }
    }
    
    
}
