/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_p2_carlosmoncada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author calol
 */
public class EX2_P2_CarlosMoncada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Calculadora Polaca");
            System.out.println("4.Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:int cantpalabras = (int) ((Math.random() * (6 - 3)) + 3);
        
        int cantletrasprimeraultima = (int) ((Math.random() * (5 - 3)) + 3);
            Formato formato= new Formato(cantpalabras,cantletrasprimeraultima);
            formato.formato();
            ArrayList<String> palabrasx = new ArrayList<String>();
            ArrayList<Integer> codigosascii= new ArrayList<Integer>();
            palabrasx=formato.getPalabras();
            codigosascii=formato.ordenar(palabrasx);
            formato.imprimir(codigosascii);
            break;
                    
                   

                case 2: ArrayList<String> palabras = new ArrayList<String>();
                    palabras.add("hola");
                    palabras.add("programacion");
                    palabras.add("soyelmejorprogramador");

                    int opcionx = 0;
                    while (opcionx != 4) {
                        System.out.println("1.Mostrar el banco de palabras");
                        System.out.println("2.Agregar palabra");
                        System.out.println("3.Jugar");
                        System.out.println("4.Salir");
                        opcionx=entrada.nextInt();
                        switch (opcionx) {
                            case 1:for (int i = 0; i < palabras.size(); i++) {
                                
                                    if (i==palabras.size()-1) {
                                    System.out.print(palabras.get(i));
                                }else{
                                    System.out.print(palabras.get(i)+", ");
                                    }
                                
                                }
                            System.out.println("");
                            break;
                            case 2: System.out.println("Digite la palabra nueva:  ");
                                    String nueva=entrada.nextLine();
                                    nueva=entrada.nextLine();
                                    palabras.add(nueva);
                            
                            
                            
                            break;
                            case 3:
                                ArrayList<String> letrasutilizadas = new ArrayList<String>();

                                String palabraescogida;

                                int palabra =  (int) ((Math.random() * ((palabras.size()) - 0)) + 0);
                                
                                palabraescogida = palabras.get(palabra);
                                String[] palabraconguiones = new String[palabraescogida.length()];
                                for (int i = 0; i < palabraescogida.length(); i++) {
                                    palabraconguiones[i] = "-";
                                }
                                Hangman jugar = new Hangman();
                                jugar.hagnam(palabraescogida, palabraconguiones, letrasutilizadas,palabras);
                                break;
                                
                                

                        }

                    }
                    break;

                case 3:
                    CalculadoraPolaca calcu = new CalculadoraPolaca();
                    calcu.calculadora();

                    break;
            }

        }

    }

}
