/* Gabriel da Cunha
4 - Faça um programa que peça um número de 2 a 10 ao usuário e usando laços de repetição calcule e
mostre a tabuada desse número.
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int tabuada = 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número de 2 a 10: ");
        tabuada = leia.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada*i);
        }
        leia.close();
    }
}

