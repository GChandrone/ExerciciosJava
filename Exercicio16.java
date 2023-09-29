/*16 - Crie um programa que solicite a entrada de 10 números pelo usuário,
armazenando-os em um vetor, e então monte outro vetor com os valores do primeiro
multiplicados por 5. Exiba os valores dos dois vetores na tela, simultaneamente, em
duas colunas (um em cada coluna), uma posição por linha. */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array_5 = new int[10];
        
        Scanner leia = new Scanner(System.in);

        for (int i = 0, cont = 1; i < array.length; i++, cont++) {
            System.out.print("Digite o " + cont + "° número: ");
            array[i] = leia.nextInt();
            array_5[i] = array[i] * 5;
        }
        
        System.out.println("-------------------------------------");
        System.out.println("Vetor Original | Vetor Multiplicado");
        System.out.println("-------------------------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%9s   ", array[i]) + "   | " + (String.format("%10s    ", array_5[i])));
            System.out.println(" ");
        }
        leia.close();
    }
}
