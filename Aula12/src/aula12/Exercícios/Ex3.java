/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Scanner;

public class Ex3 {
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = teclado.nextInt();

        if (num < 0) {
            System.out.println("Número inválido. Digite um número positivo.");
        } else {
            System.out.println("Fatorial de " + num + " = " + fatorial(num));
        }

        
    }
}

