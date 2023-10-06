package ExerciciosVetor;
/*
5. Criar um vetor A com 10 elementos inteiros. 
Construir um vetor B de mesmo tipo e tamanho, 
Sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), 
Ou seja: B[i] = A[i] * i.
*/
public class Exercicio5 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
   
        /*Preenchendo o vetor A com números aleatórios */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100);
            B[i] = A[i] * i;
        }
        
        System.out.println("-------------------");
        System.out.println(" VETOR A | VETOR B");
        System.out.println("-------------------");

        for (int i = 0; i < A.length; i++) {
            System.out.print(String.format("%6s   ", A[i]) + "|  " + String.format("%,d", B[i]));
            System.out.println(" ");
        }
    }   
}
