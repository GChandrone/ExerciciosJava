/* Gabriel da Cunha
12 - Declare um vetor de 10 posições e o preencha com os 10 primeiros números
ímpares e o escreva.
*/
public class Primeiros_10Impares {
    public static void main(String[] args) {
        int contImpar = 0, num = 0;
        int[] numImpar = new int[10];
        while (contImpar != 10) {
            if (num % 2 == 1) {
                numImpar[contImpar] = num;
                contImpar++;
            }
            num++;
        }     
        System.out.println("============== 10 NÚMEROS PRIMOS ==============");
        for (int i = 0; i < numImpar.length; i++) {
            System.out.println(numImpar[i]);
            
        }
    
    }
}
