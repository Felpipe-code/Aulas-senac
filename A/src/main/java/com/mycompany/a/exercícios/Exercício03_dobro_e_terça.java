
package com.mycompany.a.exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício03_dobro_e_terça {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite um numero");
        double num = teclado.nextDouble();
        System.out.println("Dobro:"+ (num * 2));
        System.out.println("Terça Parte:"+ (num / 3));
    }
}
