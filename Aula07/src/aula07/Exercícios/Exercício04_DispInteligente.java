/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07.Exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício04_DispInteligente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Dispositivos inteligentes");
        System.out.println("Escolha uma das opções:");
        System.out.println("[1]Acender luzes");
        System.out.println("[2]Apagar luzes");
        System.out.println("[3]Ligar TV");
        System.out.println("[4]Desligar TV)");
        System.out.println("[5]Abrir portão");
        System.out.println("[6]Fechar portão");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Luzes ligadas.");
                break;
            case 2:
                System.out.println("Luzes apagadas.");
                break;
            case 3:
                System.out.println("TV ligada.");
                break;
            case 4:
                System.out.println("TV Desligada.");
                break;
                
            case 5:
                System.out.println("Portão aberto.");
                break;
            case 6:
                System.out.println("Portão fechado.");

            default:
                System.out.println("ERRO!!!!!!");
                System.out.println("Opção inválida");
                break;
        }
        
    }
}
