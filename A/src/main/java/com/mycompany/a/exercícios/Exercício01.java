package com.mycompany.a.exercícios;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do funcionario ");
        String nome = input.nextLine();

        System.out.print("Digite o salario do funcionario ");
        int salario = input.nextInt();

        System.out.println("parabens" + nome + "," + salario);

    }

}
