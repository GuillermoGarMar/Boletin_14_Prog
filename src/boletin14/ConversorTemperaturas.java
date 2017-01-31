/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author ggarciamartinez
 */
public class ConversorTemperaturas {
    private double TF,TR;
    private final int T=80;
    public double CaF(double tempC) throws TemperaturaErradaException{
        if (tempC<T){ 
          throw new TemperaturaErradaException();
        }else{
            TF = (9/5)*tempC + 32.4;
            return TF;
        }
     
        
 }
    public double CaR(double tempC){
        TR = 4.0 / 5.0 * tempC;
        return TR;
    }
    
}
