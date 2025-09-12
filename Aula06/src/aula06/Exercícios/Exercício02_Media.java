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
public class Exercício02_Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        double med;
        double nota;
        double soma = 0;
        int tent = 1;
        
        
        do {
            System.out.println("Escreva notas");
            nota = teclado.nextDouble();
            
            
            
            
            
            if (nota < 0 || nota > 10) {
            
            tent = tent + 0 ;
                System.out.println("Nota invalida");   
             
             }else{
             soma += nota;  
             
                
            tent = tent + 1 ;
                   
                     
                }
            
        }while (tent <= 4);
        med = soma / 4;
        System.out.println("A média desse números é "+med);
        
                
        
    }
  
}
