/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

/**
 *
 * @author FELIPEMACHADOLEANDRO
 */
public class ExemploMatriz01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int [][] tabuada = new int [11][11];
        
        for (int linha = 0; linha < 11; linha++){
            for (int coluna = 0; coluna < 11; coluna++){
                tabuada [linha][coluna] = (linha)*(coluna);
                
                
                
                
                
                
                
            }
            
        }
        
        
        //imprime a tabuada formatada
        
        for (int linha = 0; linha < 11; linha++){
            for (int coluna = 0; coluna < 11; coluna++){
                System.out.println(tabuada[linha][coluna]);
            }
        }
    }
    
}
