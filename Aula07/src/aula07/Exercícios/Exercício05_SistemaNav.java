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
public class Exercício05_SistemaNav {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("Dispositivos inteligentes");
            System.out.println("Escolha uma das opções:");
            System.out.println("[1]Página inicial");
            System.out.println("[2]Perfil");
            System.out.println("[3]Configurações");
            System.out.println("[4]Notificações");
            System.out.println("[5]Sair");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("VOCÊ ESTÁ NA PÁGINA INICIAL");
                    break;
                case 2:
                    System.out.println("VOCÊ ESTÁ NA PÁGINA PERFIL");
                    break;
                case 3:
                    System.out.println("VOCÊ ESTÁ NA PÁGINA CONFIGURAÇÕES");
                    break;
                case 4:
                    System.out.println("VOCÊ ESTÁ NA PÁGINA NOTIFICAÇÕES");
                    break;

            }
        } while (opcao <= 4);

    }
}
