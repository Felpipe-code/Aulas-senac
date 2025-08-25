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
public class Exercício06_Pintando_Parede {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a largura da parede?");
        double larg = teclado.nextDouble();
        System.out.println("Qual a largura da parede?");
        double alt = teclado.nextDouble();
        
        
        
        System.out.println("A mamãe vai precisar dessa quantidade de litros de tinta:" + (larg * alt / 2));

    }

}
