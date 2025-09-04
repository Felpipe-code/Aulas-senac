/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg03;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Ex4_Media {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Diga sua primeira nota");
        double nota1 = teclado.nextDouble();
        System.out.println("Diga sua segunda nota");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media <= 4.9) {
            System.out.println("REPROVADO!");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("RECUPERACAO");
        } else if (media >= 7) {
            System.out.println("APROVADO");
        }
    }

}
