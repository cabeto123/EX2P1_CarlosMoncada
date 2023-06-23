/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_p2_carlosmoncada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author calol
 */
public class Hangman {

    String palabraescogida = "";
    String palabraconguiones = "";

    public void hagnam(String palabraescogida, String[] palabraconguiones, ArrayList<String> letrasutilizadas, ArrayList<String> palabras) {
        Scanner entrada = new Scanner(System.in);
        int contacertadas = 0;
        int cantintentos = 0;
        System.out.print("El banco de preguntas contiene:       ");
        for (int i = 0; i < palabras.size(); i++) {
            if (i == palabras.size() - 1) {
                System.out.print(palabras.get(i));
            } else {
                System.out.print(palabras.get(i) + ", ");
            }

        }
        System.out.println("");
        System.out.println("Ingrese la cantidad de intentos");
        int intentos = entrada.nextInt();
        System.out.println("¿Desea mantener el registro de letras? (S/N)");
        String resp = entrada.nextLine();
        resp = entrada.nextLine();
        System.out.println("");
        System.out.println("Eligiendo palabra al azar");

        for (int j = 0; j < palabraconguiones.length; j++) {
            System.out.print(palabraconguiones[j]);

        }
        System.out.println("");

        for (int i = 0; i < intentos; i++) {
            if ((contacertadas<palabraescogida.length())) {
                System.out.println("");
                System.out.println("Intento " + i);
                String letra = entrada.nextLine();

                letrasutilizadas.add(letra);
                for (int j = 0; j < palabraescogida.length(); j++) {

                    if (palabraescogida.charAt(j) == letra.charAt(0)) {
                        palabraconguiones[j] = letra;
                        contacertadas++;

                    }

                }
                for (int j = 0; j < palabraconguiones.length; j++) {
                    System.out.print(palabraconguiones[j] + " ");

                }
                
                if (resp.equalsIgnoreCase("s")) {
                    System.out.print("             Letras utilizadas ");
                    System.out.print("{");
                    for (int j = 0; j < letrasutilizadas.size(); j++) {
                        if (j == letrasutilizadas.size()) {
                            System.out.print(letrasutilizadas.get(j));
                        } else {
                            System.out.print(letrasutilizadas.get(j) + ",");

                        }

                    }
                    System.out.println("}");
                }

            } else if(contacertadas==palabraescogida.length()){
                
            break;    
            }
            
        }
        if (contacertadas==palabraescogida.length()) {
            System.out.println("");
            System.out.println("Felicidades gano");
        }else {
            System.out.println("");
            System.out.println("Se le acabaron los intentos");
        
        }

    }

}
