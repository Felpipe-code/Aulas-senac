/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Scanner;

public class Ex8MediaArray {
    
    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            return 0; 
        }

        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return (double) soma / numeros.length;
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

        double media = calcularMedia(numeros);

        System.out.println("A média dos números é: " + media);

    }
}
