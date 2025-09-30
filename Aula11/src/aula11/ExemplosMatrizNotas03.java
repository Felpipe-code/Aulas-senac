/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExemplosMatrizNotas03 {
    public class ExemplosMatrizes {
    public static void main(String[] args) {
        
//        int numero = 5; // recebendo só um valor
//                
//        int[] numeros = {1,2,3,4,5}; //fila
//        
//        int[][] matriz = new int [3][3]; // 3 linhas e 3 colunas
//        
//        [0,0,0]
//        [0,0,0]
//        [0,0,0]
//        
//        [linha][coluna]
//        
//       valor do índice 0 1 2 3 4 5 ...
//       valor da posição  1 2 3 4 5 6 ...
//        
//        matriz[0][0]; // primeira linha, primeira coluna
//        matriz[1][2]; //segunda linha, terceira coluna
        
//        matriz[0][0] = 10; 
//        System.out.println(matriz[0][0]);
//        
        
       
        
//        Aluno 1 -> 7 8 9
//        Aluno 2 -> 5 6 7

        // Nota da segunda prova do aluno 2
        //System.out.println(notas[1][1]); // 6
        
         double[][] notas = {
            {7.5,8.0,9.0}, // notas do aluno 1
            {5.5,6.0,7.0} //notas do aluno 2
        };
        
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.println("Média do aluno "+(i+1)+ ":"+media);
        }
        
//        Concluimos
//        Vetor -> fila (1D)
//        Matriz -> tabela (2D)(3D)       
//        Acesso -> [linha][coluna], sendo sempre usado dois laços
//        
    }
}
}
