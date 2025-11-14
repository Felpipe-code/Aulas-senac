/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exemplo02 {
    public static void main(String[] args) {
        //Substituir elementos: crie um arraylist adicione 5 nomes de frutas e substitua a terceira com morango
        //imprima a lista resultante
        
        Scanner teclado = new Scanner(System.in);        
        
        ArrayList<String> frutas = new ArrayList<>();
        
        System.out.println("Digite 5 nomes de frutas: ");
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Fruta "+(i+1)+" :");
            String fruta = teclado.nextLine();
            frutas.add(fruta);
        }
        System.out.println("Digite a nova fruta para substituir a terceira");
        String novafruta = teclado.nextLine();
        frutas.set(2,novafruta);
        
        System.out.println("Lista de frutas após a substituição: "+frutas);
        
        
    }
    
}
