/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Scanner;

public class Ex9BaseExpoente {
   
    public static long potencia(int base, int expoente) {
        long resultado = 1;

      
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = teclado.nextInt();

        System.out.print("Digite o expoente (inteiro >= 0): ");
        int expoente = teclado.nextInt();

        if (expoente < 0) {
            System.out.println("Expoente negativo não é suportado neste programa.");
        } else {
            System.out.println(base + " elevado a " + expoente + " = " + potencia(base, expoente));
        }

        
    }
}

