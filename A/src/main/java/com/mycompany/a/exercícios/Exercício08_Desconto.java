/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício08_Desconto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);            
        System.out.println("qual o valor do produto?");
        double num = teclado.nextDouble();
        System.out.println("com o nosso desconto de 5% ficou um total de:" + (num / 0.05)+ " R$");
        
        
    }
    
}
