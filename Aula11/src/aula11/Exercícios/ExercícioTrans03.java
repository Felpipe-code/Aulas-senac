/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.Exercícios;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExercícioTrans03 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz antes : ");
        for (int[] linha : matriz) {
            for (int elemento : linha) {

                System.out.println(elemento + " | ");

            }
        }
        int[][] matriztransp = matriz;
        System.out.println("Matriz depois");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriztransp[j][i] + " | ");
            }
            System.out.println();
        }

    }
}
