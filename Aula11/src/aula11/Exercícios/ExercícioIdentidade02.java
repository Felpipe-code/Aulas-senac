/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.Exercícios;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExercícioIdentidade02 {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println("Matriz");
        for (int[] linha : matriz ){
            for (int elemento : linha) {
                System.out.println(elemento +" | ");
            }
            System.out.println();
        }

    }

}
