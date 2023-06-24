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
ArrayList<String> palabras = new ArrayList<String>();
ArrayList<Integer> codigosascii= new ArrayList<Integer>();

    public Formato(int cantpalabras, int cantletrasprimeraultima) {
        this.cantpalabras = cantpalabras;
        this.cantletrasprimeraultima = cantletrasprimeraultima;
    }
    public void imprimir(ArrayList<Integer> codigosascii){
        for (int i = 0; i < codigosascii.size(); i++) {
            if (i==codigosascii.size()-1) {
                System.out.println(codigosascii.get(i));
            }else{
                System.out.println(codigosascii.get(i)+"_");
            }
  
        }
    
    }
    public ArrayList<String> formato(){
    String palabra="";
    char letra;
    
    
        for (int i = 0; i < cantpalabras; i++) {
            if (i==0||i==cantpalabras) {
                for (int j = 0; j < cantletrasprimeraultima; j++) {
                int letrarandom=(int) ((Math.random() * (122 - 97)) +97);
                letra=(char)letrarandom;
                palabra+=letra;
                
                }
            palabras.add(palabra);
            palabra="";
            }else{
                int tamañoletraenmedio=(int) ((Math.random() * (5 - 3)) +3);
                for (int j = 0; j < tamañoletraenmedio; j++) {
                int letrarandom=(int) ((Math.random() * (122 - 97)) +97);
                letra=(char)letrarandom;
                palabra+=letra;
                }
                palabras.add(palabra);
                palabra="";
                
   
            
            }
            
        }
        
            
    
    
    return palabras;
    }
    public  ArrayList<Integer> ordenar(ArrayList<String> palabras){
    int numero=0;    
    String salida="";
        for (int i = 0; i < palabras.size(); i++) {
            for (int j = 0; j < palabras.get(i).length(); j++) {
            numero=(char)palabras.get(i).charAt(j);
            codigosascii.add(numero);
            }
        }
    return codigosascii;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }
    
    


}
