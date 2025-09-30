/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.Exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExercícioSoma01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int[][] matriz = new int [4][4];
        
        for (int i = 0; i< 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Elemento[" + i + "][" + j + "]:"); 
                matriz [i][j] = teclado.nextInt();
                
            }
        }
            System.out.println("Matriz");
            for (int[] linha : matriz) {
                for ( int elemento : linha){
                    System.out.println(elemento + " | ");
                }
                System.out.println();
            }
            for (int i = 0; i < 4; i++) {
                int somaLinha = 0;
                int somaColuna = 0;
                for (int j = 0; j < 4; j++) {
                    somaLinha += matriz [i][j];
                    somaColuna += matriz [j][i];
                }
                System.out.println("Soma da linha " + (i + 1) + " : " + somaLinha);
                System.out.println("Soma da coluna " + (i + 1) + " : " + somaColuna);
            }
            
        
    }
}
