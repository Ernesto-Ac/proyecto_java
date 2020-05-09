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
public class Calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Escriba el nombre de la operacion");
            String ops = leer.next();
            System.out.println("Digite el valor numero 1");
            double n1 = leer.nextDouble();
            System.out.println("Digite el valor numero 2");
            double n2 = leer.nextDouble();
            
            operaciones(n1, n2, ops.toUpperCase().charAt(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public static void operaciones (double n1, double n2, char selector){
        double operacion = 0.0;//Es necesario inicializar las variables
        String nOpe = "";
        
        switch(selector){
            case 'S':
               operacion = n1+n2;
               nOpe = "Suma";
               break;
            case 'R':
               operacion = n1-n2;
               nOpe = "Resta";
               break; 
            case 'M':
               operacion = n1*n2;
               nOpe = "Suma";
               break;  
            case 'D':
                operacion = n1 / n2;
                nOpe = "Division";
                break;
            default:
                nOpe = "Operacion no existe";
        }
        //las varaiables de operacion y nOpe deben inicializarse
        System.out.println("El total de su "+ nOpe+ " es de :"+operacion);
    }
}
