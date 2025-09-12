/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06.Exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício01_Soma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int soma = 0;
        int num;
        do { 
       System.out.println("Digite um número (0 para sair)");
         num = teclado.nextInt();
        

        soma += num ;
        }while (num > 0);
        System.out.println("o resultado é " +soma);
        
        
    }
 
}
