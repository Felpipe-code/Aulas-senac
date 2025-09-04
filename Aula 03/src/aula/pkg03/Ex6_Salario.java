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
public class Ex6_Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Diga seu nome:");
        String nome = teclado.next();
        System.out.println("Informe seu salário:");
        int sal = teclado.nextInt();
        System.out.println("Quantos anos você trabalha na empresa?");
        int ano = teclado.nextInt();
        
        if (ano <= 3) {
        double aumento = sal + (sal * 0.03);
            System.out.println("Seu novo salário é: " + aumento);
        } else if (ano > 3 && ano < 10) {
          double aumento = sal + (sal * 0.125);  
          System.out.println("Seu novo salário é: " + aumento);
            
        } else if (ano >= 10){
          double aumento = sal + (sal *0.20);  
          System.out.println("Seu novo salário é: " + aumento);
            
            
            
        }
    }
}
