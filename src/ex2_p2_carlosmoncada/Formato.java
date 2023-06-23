/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_p2_carlosmoncada;

import java.util.ArrayList;

/**
 *
 * @author calol
 */
public class Formato {
int cantpalabras;
int cantletrasprimeraultima;
ArrayList<String> palabra = new ArrayList<String>();

    public Formato(int cantpalabras, int cantletrasprimeraultima) {
        this.cantpalabras = cantpalabras;
        this.cantletrasprimeraultima = cantletrasprimeraultima;
    }
    public void formato(){
    
    
        for (int i = 0; i < cantpalabras; i++) {
            if (i==0||i==cantpalabras) {
                for (int j = 0; j < cantletrasprimeraultima; j++) {
                int letrarandom=(int) ((Math.random() * (122 - 97)) +97);
                
                
                }
    
            }
        }
            
    
    
    
    }


}
