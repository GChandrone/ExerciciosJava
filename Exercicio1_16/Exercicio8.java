/* Gabriel da Cunha
8 - Escreva um programa que lê o tamanho do lado de um quadrado e imprime um
quadrado daquele tamanho com asteriscos. Seu programa deve usar laços de repetição
e funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
Por exemplo, para lado igual a 5:
*****
*****
*****
*****
*****
*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int lado = 0;
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Tamanho do lado do quadrado (1 a 20): ");
        lado = leia.nextInt();

        for (int l = 1; l <= lado; l++) {
            for (int c = 1; c <= lado; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        leia.close();
    }
}
