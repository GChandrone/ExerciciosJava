package ExerciciosVetor;
/*
2. Criar um vetor A com 8 elementos inteiros. 
Construir um vetor B de mesmo tipo e tamanho 
E com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        int[] A = new int[8];
        int[] B = new int[8];
   
        /*Preenchendo o vetor A com números aleatórios */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100);
            B[i] = A[i] * 2;
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
