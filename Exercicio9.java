/* Gabriel da Cunha
9 - Faça um programa que recebe a altura de um triângulo em um número inteiro e
imprima-o utilizando asteriscos. Veja o Exemplo:
Entrada: 5
*
**
***
****
*****
*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
       int altura = 0;
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Altura do triânguo: ");
        altura = leia.nextInt(); 
        
        for (int l = 1; l <= altura; l++) {
            for (int c = 1; c <= l; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        leia.close();
    }
}
