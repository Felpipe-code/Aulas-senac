/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;

import java.util.Scanner;

public class Ex6Palindromo {
    
    public static boolean ehPalindromo(String texto) {
        // remover espaços e deixar tudo em minúsculo
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        int i = 0, j = texto.length() - 1;
        while (i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = teclado.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        
    }
}
