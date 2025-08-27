
package com.mycompany.a.Exercícios2;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício4_ConvCelsius {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("digite uma temperatura em °C para ser convertida");
        double temp = teclado.nextDouble();
        double F = (temp * 9/5 + 32);
        System.out.println(temp + "°C = " + F + "°F");
        
    }
}
