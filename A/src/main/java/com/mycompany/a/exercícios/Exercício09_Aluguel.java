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
public class Exercício09_Aluguel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Quantos KM foram percorridos?");
        double km = teclado.nextDouble();
        System.out.println("Quantos dias foram usados?");
        double dia = teclado.nextDouble();
        System.out.println("foram:" +(dia * 90 + km * 0.90 ) + "R$" );
                
    }
    
}
