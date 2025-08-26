/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.Exercícios2;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício3_Média {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Digite o primeiro número");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = teclado.nextDouble();
        System.out.println("Digite o terceiro número");
        double num3 = teclado.nextDouble();
        
        double media = (num1 + num2 + num3) /3 ; 
        System.out.println("a média desses números é: " + media);
    }
   
}
