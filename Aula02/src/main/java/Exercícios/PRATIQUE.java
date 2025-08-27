/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class PRATIQUE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Digite seu número");
        int num = teclado.nextInt();
        int abs = Math.abs(-num);
        System.out.println("Valor absoluto: " + abs);
        
    }
  
}
