package ExerciciosVetor;
/*
1. Criar um vetor A com 5 elementos inteiros. 
Construir um vetor B de mesmo tipo e tamanho 
E com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
*/
public class Exercicio1 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
   
        /*Preenchendo o vetor A com números aleatórios */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100);
            B[i] = A[i];
        }
        
        System.out.println("-------------------");
        System.out.println(" VETOR A | VETOR B");
        System.out.println("-------------------");

        for (int i = 0; i < A.length; i++) {
            System.out.print(String.format("%6s   ", A[i]) + "|   " + B[i]);
            System.out.println(" ");
        }
    }   
}