/**
 * MaiorValor
 */
 import java.util.Scanner;

 public class MaiorValor {

    public static void main(String[] args) {
        
        int num = 0, maiorNum = 0, repete = 1, numRepete = 0;
    
        Scanner leia = new Scanner(System.in);

        System.out.println("");

        System.out.println("============ MAIOR INTEIRO ============");
        
        for (int i = 1; i <= 3; i++) {
            
            System.out.print("Digite o " + i + "° Valor inteiro: ");
            num = leia.nextInt();
            
            if (num > maiorNum) {
                maiorNum = num;
            }else if (num == maiorNum) {
                repete++;
                numRepete = num;
            }
            
        }
        

        System.out.println("---------------------------------------");
        
        if (repete == 2 && numRepete == maiorNum) {
            System.out.println("O maior valor é " + maiorNum + " e se repete 2 vezes");   
        }else if (repete >= 3){
            System.out.println("Os 3 valores são iguais!");
        }else{
            System.out.println("O maior valor é: " + maiorNum);
        }
        
        System.out.println("");
        
        leia.close();
    }
}