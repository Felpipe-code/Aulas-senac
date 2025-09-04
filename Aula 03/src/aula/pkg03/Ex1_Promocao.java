/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg03;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Ex1_Promocao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);  
        System.out.println("Qual seu nome?");
        String nome = teclado.next();
        System.out.println("Qual seu sexo? H ou M");
        String sex = teclado.next();
        System.out.println("Qual o valor da sua compra");
        Double valor = teclado.nextDouble();
        
         if ("M".equals(sex)) {
             
         
             System.out.println("O valor da sua compra foi" +  (valor - (valor * 0.13)));
             
             
             
         }if ("H".equals(sex)) {
             
             System.out.println("O valor da sua compra foi" +  (valor - (valor * 0.05)));
             
             
         }else {
             System.out.println("Sexo inválido");
         }
         
         }
}
        

        
    
    

