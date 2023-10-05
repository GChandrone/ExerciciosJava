/*14 - Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa
deverá fazer uma busca do valor de X no vetor lido e informar a posição em que foi
encontrado ou se não foi encontrado.*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int x = 0, posicao = 0;
    
        Scanner leia = new Scanner(System.in);

        System.out.println("===================== 20 POSIÇÕES =====================");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        
        System.out.println(" ");

        System.out.println("-------------------------------------------------------");
        System.out.print("Digite um número para encontrar no vetor: ");
        x = leia.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                posicao = i+1;
                break;
            } 
        }
        
        System.out.println("=======================================================");
        
        if (posicao > 0) {
                System.out.println("Número " + x + " encontrado na " + posicao + "° Posição!!");
        } else {
                System.out.println("Número " + x + " \"não\" encontrado ):");
        }

        leia.close();    
    }
}
