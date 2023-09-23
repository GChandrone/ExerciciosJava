/* Gabriel da Cunha
10 - Faça um programa que receba várias idades e que calcule e mostre a média
das idades digitadas. Finalize digitando a idade igual a zero.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int idade = 1, qtdIdade = 0, sumIdade = 0;
        Double mediaIdade = 0.0;
        Scanner leia = new Scanner(System.in);
        while (idade != 0){

            System.out.print("Digite a idade: ");
            idade = leia.nextInt();
            if (idade > 0) {
                qtdIdade++;
                sumIdade += idade;
            } 
            
        } 
        mediaIdade = (double)sumIdade / (double)qtdIdade;
        System.out.println("Média das idades digitadas: " + mediaIdade);
        leia.close();
    }
}
