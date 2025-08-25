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
public class Exercício10_Salário {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos dias o cupinhca trabalhou?");
        double dias = teclado.nextDouble();

        double pordia = 25 * 8;

        System.out.println("O Cupincha ganhou:" + (dias * pordia));

    }

}
