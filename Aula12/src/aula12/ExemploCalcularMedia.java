/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExemploCalcularMedia {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Digite o número de alunos: ");
        int numAlunos = teclado.nextInt();
        
        for (int i = 1; i < 10; i++){
            System.out.println("Digite o número de notas para o aluno "+i+" :");
            int numNotas = teclado.nextInt();
            double[]notas = new double [numNotas];
            
            for (int j = 0; j < numNotas; j++){
                System.out.println("Digite a nota"+(j+1)+": ");
                notas[j] = teclado.nextDouble();
            }
            
            double media = calcularMedia(notas);
            System.out.println("A média do aluno "+i+" é: "+media);
            
            
            
        }
        
        
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas){
            soma += nota;
            
        }
        return soma / notas.length;
    }
    
}
