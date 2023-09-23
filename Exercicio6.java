/* Gabriel da Cunha
6 - Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de
pessoas com idade maior ou igual a 18 anos.
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int idade = 0, maiorIdade = 0;
        Scanner leia = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite sua idade: ");
            idade = leia.nextInt();
            if (idade >=  18) {
                maiorIdade ++;
            }
        }
        System.out.println("Pessoas com idade maior ou igual a 18 anos: " + maiorIdade);
        leia.close();
    }
}
