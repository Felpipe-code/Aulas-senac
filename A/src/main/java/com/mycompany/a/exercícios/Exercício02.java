package com.mycompany.a.exercícios;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero");
        int numero = input.nextInt();

        System.out.println("antecessor" + (numero - 1));
        System.out.println("sucessor" + (numero + 1));

    }

}
