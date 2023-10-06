package ExerciciosVetor;
/* 
7. Criar dois vetores A e B cada um com 10 elementos inteiros.
Construir um vetor C, onde cada elemento de C é a subtração dos respectivos elementos em A e B, 
ou seja: C[i] = A[i] – B[i].
*/
public class Exercicio7 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        /*Preenchendo o vetor A e B com números aleatórios */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100);
            B[i] = (int)(Math.random() * 100);
            C[i] = A[i] - B[i];
        }
        
        System.out.println("-----------------------------");
        System.out.println(" VETOR A | VETOR B | VETOR C ");
        System.out.println("-----------------------------");

        for (int i = 0; i < A.length; i++) {
            System.out.print(String.format("%6s   ", A[i]) + "|   " + String.format("%2s   ", B[i]) + " |  " + C[i]);
            System.out.println(" ");
        }
    }   
}
