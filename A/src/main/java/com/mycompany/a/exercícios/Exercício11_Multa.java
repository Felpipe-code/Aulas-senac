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
public class Exercício11_Multa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Qual a velocidade do carro?");
        double vel = teclado.nextDouble();
        
        
        
        if (vel > 90) { 
            double multa = (vel * 5);
        
            System.out.println("Você foi multado! Precisa pagar o valor de:" + multa + "R$");
        
        
        
        } else {        
            System.out.println("Você não foi multado");
        
        }
    }
    
}
