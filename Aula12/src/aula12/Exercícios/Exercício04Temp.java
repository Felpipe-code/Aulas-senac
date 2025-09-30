/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.Exercícios;
import java.util.Scanner;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício04Temp {
    //método para converter celsius para fahrenheit
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        
       
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();
        
       
        double fah = celsiusParaFahrenheit(celsius);
        
       
        System.out.println(celsius+" °C equivale a "+fah+" °F");        
        
        
        
        
        
    }
}
