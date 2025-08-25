/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a.exercícios;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercício12_voto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual sua idade");
        int id = teclado.nextInt();

        if (id >= 18) {
            System.out.println("Voce pode votar");

        } else {
            System.out.println("Voce nao pode votar");
        }

    }

}
