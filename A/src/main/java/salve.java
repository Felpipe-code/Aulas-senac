
import java.util.Scanner;

public class salve {  
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número da soma: ");
        int n1 = input.nextInt();
        
        System.out.print("Digite o segundo número da soma: ");
        int n2 = input.nextInt();
        
        System.out.println("O primeiro número é " + n1 + " e o segundo número é " + n2);
        System.out.println("A soma entre os números digitados é: " + (n1 + n2));
    }
}
