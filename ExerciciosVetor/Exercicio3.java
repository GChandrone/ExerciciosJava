package ExerciciosVetor;
/*
3. Criar um vetor A com 15 elementos inteiros. 
Construir um vetor B de mesmo tipo e tamanho, 
Sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, 
Ou seja: B[i] = A[i] * A[I].
*/
public class Exercicio3 {
    public static void main(String[] args) {
        int[] A = new int[15];
        int[] B = new int[15];
   
        /*Preenchendo o vetor A com números aleatórios */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100);
            B[i] = A[i] * A[i];
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
