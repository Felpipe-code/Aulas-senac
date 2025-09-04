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
public class Ex5_Terreno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a Largura");
        int larg = teclado.nextInt();
        System.out.println("Informe o comprimento");
        int comp = teclado.nextInt();

        int area = (larg * comp);

        if (area <= 100) {
            System.out.println("Este terreno é POPULAR");

        } else if (area >= 5 && area <= 500) {
            System.out.println("Este terreno é MASTER");

        } else if (area >= 500) {
            System.out.println("Este terreno é VIP");
        }
    }

}
