/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exemplo_Caso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);        
        
        System.out.println("escolha uma opção");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        int opcao = teclado.nextInt();
        String msn = null ;
        switch (opcao) {
            case 1:
                msn = "novo arquivo";
                break;
            case 2:
                System.out.println("Arquivo salvo");
                break;
            case 3:
                msn = "arquivo salvo como copia";
                break;
                
            case 4:
                msn = "voce saiu do programa";
                break;
            case 5:
                msn = "seu pc esta sendo desligado";
                break;
            default: 
                msn = "opção inválida";
                break;
                
        }
        
        System.out.println("----------------------");
        System.out.println(msn);
        System.out.println("----------------------");
                
        }
        
    }
    

