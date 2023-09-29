/*15 - Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.*/
public class Exercicio15 {
    public static void main(String[] args) {
        int[] array = new int[40];
        int contPar = 0;

        System.out.println("==================================================== 40 POSIÇÕES ==================================================");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                contPar++;
            }
        }
        
        System.out.println(" ");

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("O vetor possui " + contPar + " números pares");
    }
}
