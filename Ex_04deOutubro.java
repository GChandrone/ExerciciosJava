import java.util.Scanner;

public class Ex_04deOutubro {
    public static void main(String[] args) {
        int[] Vet = new int[50];

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < Vet.length; i++) {
            System.out.print("Digite o número inteiro da posição " + (i+1) + " : ");
            Vet[i] = leia.nextInt();
            
            System.out.println(""); 
            
            for (int c = 0; c < Vet.length; c++) {
                if (Vet[i] == Vet[c] && i != c) {
                    System.out.println("-----------------------------------------");
                    System.out.println("O número " + Vet[i] + " é repetido!!");
                    System.out.println("-----------------------------------------");
                    System.out.println("");
                    break;
                }
            }
        }
        leia.close();
    }
}
