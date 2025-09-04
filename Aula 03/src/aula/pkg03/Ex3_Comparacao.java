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
public class Ex3_Comparacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Diga o primeiro numero");
        int num1 = teclado.nextInt();
        System.out.println("Agora diga o segundo");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");

        } else if (num1 < num2) {
            System.out.println("O segundo número é maior que o primeiro");

        } else if (num1 == num2) {
            System.out.println("Os dois sao o mesmo numero");

        }
    }

}
