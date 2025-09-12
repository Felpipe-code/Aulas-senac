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
public class Exercício02_Assistente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo ao seu assistente virtual!");
        System.out.println("Escolha uma das opções:");
        System.out.println("[1]Previsão do tempo");
        System.out.println("[2]Notícias");
        System.out.println("[3]Abrir agenda");
        System.out.println("[4]Ouvir música");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você pode criar, editar e excluir.");
                break;
            case 2:
                System.out.println("Você pode criar e editar.");
                break;
            case 3:
                System.out.println("Você pode apenas visualizar.");
                break;
            case 4:
                System.out.println("Você pode apenas visualizar.");
                break;

            default:
                System.out.println("ERRO!!!!!!");
                System.out.println("Opção inválida");
                break;
        }
    }
}
