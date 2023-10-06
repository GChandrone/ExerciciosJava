package ExerciciosVetor;
/*
4. Criar um vetor A com 15 elementos inteiros. 
Construir um vetor B de mesmo tamanho, 
Sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, 
Ou seja: B[i] = sqrt(A[i]).
*/
import static java.lang.Math.sqrt;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] A = new int[15];
        double[] B = new double[15];
   
        /*Preenchendo o vetor A com números aleatórios */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100);
            B[i] = sqrt(A[i]);
        }
        
        System.out.println("-------------------");
        System.out.println(" VETOR A | VETOR B");
        System.out.println("-------------------");

        for (int i = 0; i < A.length; i++) {
            System.out.print(String.format("%6s   ", A[i]) + "|  " + (String.format("%.2f", B[i])));
            System.out.println(" ");
        }
    }   
}
