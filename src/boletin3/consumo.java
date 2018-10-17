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
public class consumo {
    private float km, litros,vMed,pGas;

public consumo(){
}
public consumo(float k, float l, float v, float p){
    km=k;
    litros=l;
    vMed=v;
    pGas=p;
}

public float getTempo(){
float tiempo=km/vMed;
return tiempo;
}
public float comsumoMedio(){
    return litros*100/km;
}

public float consumoEuros(){
    return pGas*(litros*100/km);
}
public void setKms(float km){
  this.km=km;
    }
public void setLitros(float litros){
    this.litros=litros;
}
public void setvMed (float vMed){
this.vMed=vMed;
}
public void setPGas(float pGas){
    this.pGas=pGas;
}
public void getvMed(){
    System.out.print("\n la velocidad media es de "+vMed+"km/h");
  }

}
