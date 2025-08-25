
package com.mycompany.a.exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício05_Conv_Moedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);      
        System.out.print("Digite um número em reais para ser convertido:");
        double num = teclado.nextDouble();
        System.out.printf("U$: %.2f%n", (num / 5.45));    
                
    }
   
}
