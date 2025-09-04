/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg03;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Ex2_Distancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Digite a distância de sua viagem em km:");
        double dist = teclado.nextDouble ();
        
                
        if (dist <= 200){
            double preço = dist * 0.50;
            System.out.println("Sua viagem saiu por: " + preço + "R$");
            
            
        }else {
            
            double preço = dist * 0.45;
            System.out.println("Sua viagem saiu por: " + preço + "R$");
                    
            
            
        } 
            
                
    }
  
}
