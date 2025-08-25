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
public class Exercício04_conversor_med {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma distância em Metros");
        double num = teclado.nextDouble();
        System.out.println("KM:" + (num / 1000));
        System.out.println("CM:" + (num * 100));
    }

}
