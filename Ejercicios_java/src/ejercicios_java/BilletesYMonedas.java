/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
█║▌│█│║▌║││█║▌║▌║█║
©José Ernesto Acevedo Vásquez®  
 ---------- SIS21A------------
 */
public class BilletesYMonedas {
    public static void main(String[] args) {
        
        int[] billetes;
        int[] monedas;
        int tiempo;
        
        try {
            NumberFormat formato = new DecimalFormat("$#,###.##");
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Tiempo de llamada");
              tiempo = Integer.parseInt(leer.readLine());
              
            double valor_llamada = calPrecioLlama(tiempo);
            billetes = calcularBilletes(valor_llamada);
            
            double cambiomonedas = obtenerMonedas(valor_llamada);
            monedas = calcularMonedas(cambiomonedas);
            
            System.out.println("Monto de la llamada: "+valor_llamada);
            System.out.println("----------Billetes-------------");
             System.out.println("$20 :" + billetes[0]);
            System.out.println("$10 :" + billetes[1]);
            System.out.println("$5  :" + billetes[2]);
            System.out.println("$1  :" + billetes[3]);
            System.out.println("---------------Monedas-------------");
            System.out.println("$0.25 :" + monedas[0]);
            System.out.println("$0.10 :" + monedas[1]);
            System.out.println("$0.05 :" + monedas[2]);
            System.out.println("$0.01 :" + monedas[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static double calPrecioLlama(int time){
        double valorLlamada = .20;//valor de 20ctvs
        if(time>3){//si el tiempo de llamada es mayor a 3
            time-=3;//tiempo - tiempo = 3;
            valorLlamada +=time *.5;//valor de la llamada + valor de la llamada tiempo
        }
        return valorLlamada;
    }
    
    public static int[] calcularBilletes(double precio_llamada){
        double valor_llamada = precio_llamada;
        int[] billetes = new int[4];
        
        for(int i = 20;i > 0; i--){
            switch(i){
                case 20:
                    if((valor_llamada/25)>0){
                        billetes[0]=(int)valor_llamada/20;
                        valor_llamada -=(20*billetes[0]);
                    }break;
                case 10:
                    if((valor_llamada/25)>0){
                        billetes[1]=(int)valor_llamada/10;
                        valor_llamada -=(10*billetes[1]);
                    }break;
                case 5:
                    if((valor_llamada/25)>0){
                        billetes[2]=(int)valor_llamada/5;
                        valor_llamada -=(5*billetes[2]);
                    }break; 
                case 1:
                    if((valor_llamada/25)>0){
                        billetes[3]=(int)valor_llamada/1;
                        valor_llamada -=(1*billetes[3]);
                    }break;
                    default:
                        break;
            }
        }
        return billetes;
    }
    
    public static int [] calcularMonedas(double monedas){
        int monedas_encontradas = (int)(monedas *100);
        int[] moneda = new int[4];
        
        for(int ite =25; ite > 0; ite--){
        switch (ite) {
                case 25:
                    if((monedas_encontradas/25) > 0){
                        moneda[0] = (int) monedas_encontradas/25;
                        monedas_encontradas -=  (25 * moneda[0]);
                    }   break;
                case 10:
                    if((monedas_encontradas/10) > 0){
                        moneda[1] = (int) monedas_encontradas/10;
                        monedas_encontradas -= (10 * moneda[1]); 
                    }
                    break;
                case 5:
                    if((monedas_encontradas/5) > 0){
                        moneda[2] = (int) monedas_encontradas/5;
                        monedas_encontradas -= (5 * moneda[2]);
                    }
                    break;
                case 1:
                    if((monedas_encontradas/1) > 0){
                        moneda[3] = (int) monedas_encontradas/1;
                        monedas_encontradas -= (1 * moneda[3]);
                    }
                    break;
                default:
                    
                    break;
            }
        }
        return moneda;
    }
    
    public static double obtenerMonedas(double precio_llamadas){
        int valor_entero = (int) precio_llamadas;
        return precio_llamadas - valor_entero;
    }
    
    
}
