/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7OrdenarArray {
    
    public static int[] ordenarCrescente(int[] numeros) {
        Arrays.sort(numeros);
        return numeros;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você deseja digitar? ");
        int n = teclado.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int[] ordenado = ordenarCrescente(numeros);

        System.out.println("Array em ordem crescente: " + Arrays.toString(ordenado));

       
    }
}
