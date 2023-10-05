/* Gabriel da Cunha
1 - Faça um programa que peça dois números ao usuário e mostre qual o maior e qual o menor 
*/
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, maiorNum = 0, menorNum = 0;
        Scanner leia = new Scanner(System.in);
    
        System.out.print("Digite o 1 ° número \"inteiro\": ");
        num1 = leia.nextInt();
        System.out.print("Digite o 1 ° número \"inteiro\": ");
        num2 = leia.nextInt();
        
        if (num1 > num2) {
            maiorNum = num1;
            menorNum = num2;
            System.out.println("Maior número: " + maiorNum);
            System.out.println("Menor número: " + menorNum);
        } else if(num2 > num1) {
            maiorNum = num2;
            menorNum = num1;
            System.out.println("Maior número: " + maiorNum);
            System.out.println("Menor número: " + menorNum);
        } else {
            System.out.println("Os 2 números são iguais");
        }
        leia.close();
    }    
}
