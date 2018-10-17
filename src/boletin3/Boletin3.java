/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;
import java.util.Scanner;

/**
 *
 * @author socamporomani
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        consumo consume= new consumo();
consume.setLitros(50f);
consume.setPGas(1.57f);
consumo consumo=new consumo(600f,100f,120f,1.57f);
        
       System.out.print("el consumo medio es de "+consumo.comsumoMedio()+" litros cada 100km");
        consumo.setLitros(110f);
        consumo.getvMed();
        

    }
    
}
