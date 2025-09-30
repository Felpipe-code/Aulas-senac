/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Scanner;

public class Ex1Soma {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Soma: " + somar(num1, num2));

        
    }
}
