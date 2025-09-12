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
public class Exercício03_Suporte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Bem vindo ao suporte");
        System.out.println("Escolha uma dessas opções:");
        System.out.println("[1]Problema de internet");
        System.out.println("[2]Problema no login");
        System.out.println("[3]Erro no sistema");
        System.out.println("[4]Solicitação de atualização");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Reinicie o roteador, verifique sua conexão e tente novamente.");
                break;
            case 2:
                System.out.println("Verifique as credenciais e se necessário, redefina sua senha.");
                break;
            case 3:
                System.out.println("Tente reinicar o sistema.");
                break;
            case 4:
                System.out.println("Acesse as configurações e tente instalar a versão mais recente.");
                break;

            default:
                System.out.println("ERRO!!!!!!");
                System.out.println("Opção inválida");
                break;
        }    
    }
    
}
