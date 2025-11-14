/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rd = new Random();
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            int numeroaleatorio = rd.nextInt(101);
            numeros.add(numeroaleatorio);
            System.out.println("numero"+(i+1)+" :"+numeroaleatorio);
            
        
    }
        Collections.sort(numeros); //order a lista em ordem crescente
        System.out.println("Números ordenados: "+numeros);
    }
}
