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
public class CalculadoraPolaca {

    int cantcaracteres;
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    public void calculadora() {
        Scanner entrada = new Scanner(System.in);

        String resp = "s";
        while (resp.equalsIgnoreCase("S") == true) {
            numeros.clear();
            System.out.println("Digite la cantidad de caracteres que quiere");
            int cantcaracteres = entrada.nextInt();
            for (int i = 0; i < cantcaracteres; i++) {
                System.out.println("Digite el caracter " + (i + 1));
                String caracter = entrada.nextLine();
                if (i == 0) {
                    caracter = entrada.nextLine();
                }

                if (caracter.equalsIgnoreCase("+")) {
                    int numero = numeros.get(numeros.size() - 2);
                    int numero2 = numeros.get(numeros.size() - 1);
                    numeros.remove(numeros.size() - 2);
                    numeros.remove(numeros.size() - 1);
                    numeros.add(numero + numero2);

                } else if (caracter.equalsIgnoreCase("-")) {
                    int numero = numeros.get(numeros.size() - 1);
                    int numero2 = numeros.get(numeros.size() - 2);
                    numeros.remove(numeros.size() - 2);
                    numeros.remove(numeros.size() - 1);
                    numeros.add(numero2 - numero);

                } else if (caracter.equalsIgnoreCase("*")) {
                    int numero = numeros.get(numeros.size() - 1);
                    int numero2 = numeros.get(numeros.size() - 2);
                    numeros.remove(numeros.size() - 2);
                    numeros.remove(numeros.size() - 1);
                    numeros.add(numero * numero2);

                } else if (caracter.equalsIgnoreCase("/")) {
                    int numero = numeros.get(numeros.size() - 1);
                    int numero2 = numeros.get(numeros.size() - 2);
                    numeros.remove(numeros.size() - 2);
                    numeros.remove(numeros.size() - 1);
                    numeros.add(numero / numero2);
                } else {
                    int numero = Integer.parseInt(caracter);
                    numeros.add(numero);

                }

            }
            System.out.println("El resultado es " + numeros);
            System.out.println("Desea seguir evaluando (S/N): ");
            resp = entrada.nextLine();
        }//fin del while

    }
}
