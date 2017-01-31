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
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ConversorTemperaturas conv1 = new ConversorTemperaturas();
        
        try{
            System.out.println("graos fharenheit: " + conv1.CaF(85));
            System.out.println("graos reaumur: " + conv1.CaR(55));
        }
        catch (TemperaturaErradaException e){
            System.out.println(e.toString());
        }
    }
    
}
