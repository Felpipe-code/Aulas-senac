/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06.Exemplos;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exemplo01_Somador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int soma = 0;
                char resp; //eu quero apenas um caractere
                do{
                    System.out.println("Digite um valor para ser somado");
                            int num = teclado.nextInt();
                            System.out.println("voce deseja continuar s ou n");
                            resp = teclado.next().charAt(0);
                            
                            
                }while (resp != 'n'); //utilizamos aspas simples no char
                System.out.println("a soma de todos valores é "+soma);
               
    }
    
}
