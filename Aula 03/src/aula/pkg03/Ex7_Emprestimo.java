/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg03;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Ex7_Emprestimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Qual o valor da casa?");
        double valor = teclado.nextDouble();
        System.out.println("Qual seu salario?");
        double sal = teclado.nextDouble();
        System.out.println("Em quantos anos voce vai pagar?");
        int ano = teclado.nextInt();
        
        int meses = (ano * 12);
        double prestacao = (valor / meses);
        
        if (sal > prestacao * 0.03){
            System.out.println("Prestacao aprovada!");    
            
        }else {
            System.out.println("Prestacao negada!");
        }
        
       
        
        
        
        
        
    }
    
}
