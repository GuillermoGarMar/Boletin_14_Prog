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
public class TemperaturaErradaException extends Exception{
    public  TemperaturaErradaException(){
          super("No puede ser menor de 80ºC");
    }
    public TemperaturaErradaException(String s) {
        super(s);
    }
}

      

    
    
