/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExemploMatrizMedia04 {
      public static void main(String[] args) {
        int[][]matriz = { // Declarando e iniciando uma matriz 4x4
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
        int soma = 0; 
        int totalElementos = 16; //numero total de elementos na matriz
         
        for (int i = 0; i < 4; i++) { //linhas
            for (int j = 0; j < 4; j++) { //colunas
                soma += matriz[i][j]; //somando os elementos da matriz
            }
        }
        double media = (double)soma / totalElementos; 
        System.out.println("A média dos elementos é: "+media);
    }
}  

