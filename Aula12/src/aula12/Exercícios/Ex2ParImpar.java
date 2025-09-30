/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Scanner;

public class Ex2ParImpar {
    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        if (ehPar(num)) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        
    }
}