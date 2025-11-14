/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08.Exercícios;

import java.util.ArrayList;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Exercício03_Contem {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("vermelho");
        cores.add("verde");
        cores.add("azul");
        
        
        
        boolean contemamarelo = cores.contains("Amarelo");
        System.out.println(contemamarelo);
        System.out.println(cores);
        
        
    }
    
}
