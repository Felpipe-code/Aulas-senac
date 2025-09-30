/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Scanner;

public class Ex5 {
    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();

        System.out.println("Número de vogais: " + contarVogais(frase));

        
    }
}

