/* Gabriel da Cunha
12 - Declare um vetor de 10 posições e o preencha com os 10 primeiros números
ímpares e o escreva.
*/
public class Exercicio12 {
    public static void main(String[] args) {
        int contImpar = 0;
        int[] numImpar = new int[10];
        
        System.out.println("============== 10 NÚMEROS ÍMPARES ==============");
        for (int i = 1; contImpar < 10 ; i++) {
            if (i % 2 == 1) {
                numImpar[contImpar] = i;
                System.out.println(contImpar+1 + "° Impar = " + numImpar[contImpar]);
                contImpar++;
            }
        }
    }
}
