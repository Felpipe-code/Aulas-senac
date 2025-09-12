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
public class Exercício01_Usuário {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha seu tipo de perfil:");
        System.out.println("[1]Administrador");
        System.out.println("[2]Editor");
        System.out.println("[3]Visitante");
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
                
            default:
                System.out.println("ERRO!!!!!!");
                System.out.println("Opção inválida");
                break;

        }

    }

}
