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
public class Ex8_IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Diga seu peso:");
        double peso = teclado.nextDouble();
        System.out.println("Diga sua altura:");
        double altura = teclado.nextDouble();
        
        double IMC = (peso / altura);
        
        if (IMC <= 18.5){
            System.out.println("Voce esta abaixo do peso");    
        }else if (IMC > 18.5 && IMC <= 25) {
            System.out.println("Voce esta no peso ideal");
        }else if (IMC > 25 && IMC <= 30){
            System.out.println("Voce esta sobre peso");   
        }else if (IMC > 30 && IMC <=40){
            System.out.println("Voce esta obeso");
        }else if (IMC > 40){
            System.out.println("Voce esta com obesidade morbida");
        }
            
        
        
        
        
    }
    
    
}
