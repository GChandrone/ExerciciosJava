/* Gabriel da Cunha
13 - Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e
vice-e-versa. Escreva ao final o vetor obtido.
*/

import java.lang.Math;

public class Exercicio13 {
    public static void main(String[] args) {
        int[] array = new int[16];
        int[] arrayFirst = new int[8];
        int[] arrayLast = new int[8];
        int[] arrayFinal = new int[16];
        
        System.out.println("============== INVERTENDO VETOR ==============");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 8; i++) {
            /*Pegando as 8 primeiras posições do vetor */
            arrayFirst[i] = array[i];
            
            /*Pegando as 8 ultimas posições do vetor */
            arrayLast[i] = array[8+i];
            
            /*Colocando as 8 ultimas posições primeiro */
            arrayFinal[i] = arrayLast[i];
            
            /*Colocando as 8 primeiras posições por ultima */
            arrayFinal[8+i] = arrayFirst[i];
        }
        for (int i = 0; i < 16; i++) {
            System.out.print(arrayFinal[i] + " ");
        }
    }
}