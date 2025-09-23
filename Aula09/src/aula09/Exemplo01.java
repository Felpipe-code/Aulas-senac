/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exemplo01 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Digite uma frase:");
        String frase = teclado.nextLine().toLowerCase(); //converte para minusculo
        
        int contadorVogais = 0;
        
        for(char letra : frase.toCharArray()){
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == '0' || letra == 'u'){
                contadorVogais++;
            }
        }
        
        System.out.println("A frase contém "+ contadorVogais + " vogais");
    }
    
}
