/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExemploConversorTemp {
    //método para converter celsius para fahrenheit
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        
        //solicite ao usuário a temperatura em Celsius
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();
        
        //converte a temperatura para fahrenheit
        double fah = celsiusParaFahrenheit(celsius);
        
        //exibir o resultado
        System.out.println(celsius+" °C equivale a "+fah+" °F");        
        
        
        
        
        
    }
}
