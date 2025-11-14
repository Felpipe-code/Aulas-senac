/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10.Exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExercícioSomarElementos01 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);        
        int [][] matriz = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++);
            System.out.println("Elemento ["+i+"]["+ j +"]:"); //elemento[1][1]
            matriz [i][j] = teclado.nextInt();
        }
    }
}
