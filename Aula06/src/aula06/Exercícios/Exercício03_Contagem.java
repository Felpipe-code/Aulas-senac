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
public class Exercício03_Contagem {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);        
           int cont = 10;
           
           
           
           do {
               
               
               System.out.println("Contador: "+cont);
               Thread.sleep(1000);
               cont = cont - 1;
               
               
                       
           }while (cont >= 0);
    }
 
}
