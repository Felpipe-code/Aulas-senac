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
public class Exercício1_Cumprimento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Qual seu nome completo?");
        String nome = teclado.nextLine();
        System.out.println("Olá " + nome + ", seja bem vindo ao Java!");
    }
    
}
