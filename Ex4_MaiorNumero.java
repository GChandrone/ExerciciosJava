import java.util.Scanner;

public class Ex4_MaiorNumero {
   public static void main(String[] args) {
        int num = 1, maiorNum = 0, repete = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("============ NÃO DIGITE ZERO ============");

        while (num != 0){

            System.out.print("Digite um número inteiro: ");
            num = leia.nextInt();
    
            if (num > maiorNum) {
                maiorNum = num;   
                repete = 1;
            } else if (num == maiorNum) {
                repete++;
            }
        }
        System.out.println("");
        System.out.println("============ MAIOR NÚMERO ============");
        
        if (repete > 1) {
            System.out.println("Maior número digitado: " + maiorNum);
            System.out.println("Foi digitado: " + repete + " vezes");
        } else {
            System.out.println("Maior número digitado: " + maiorNum);
        }    
        System.out.println("======================================");
        
        leia.close();
    }
}
