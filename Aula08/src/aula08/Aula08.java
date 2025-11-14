/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08;

import java.util.ArrayList;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class Aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRIAR UM ARRAYLIST DE STRING
        ArrayList<String>listadenomes = new ArrayList<>();
        
        //Adicionar alguns elementos nele 
        listadenomes.add("Luis");
        listadenomes.add("Felipe");
        listadenomes.add("Ryan");
        
        //ver o nome da posição - luis
        String primeironome = listadenomes.get(0); 


        //remover um elemento
        listadenomes.remove("Felipe"); //remove o NOME
        
        
        
        //verificar o tamanho da lista
        int tamanho = listadenomes.size();
        
        
        //verificar se a lista contém um elemento 'x'
        boolean contemRyan = listadenomes.contains("Ryan");
        //retornar TRUE se "Ryan" estiver na lista
        
        
        
        
        //imprimir os elementos da lista
        for (String nome : listadenomes){
            System.out.println(nome);
        }
    }
    
}
