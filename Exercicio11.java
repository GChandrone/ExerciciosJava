/* Gabriel da Cunha
11 - Faça um programa que apresente um menu de opções para o cálculo das
seguintes operações entre dois números: adição, subtração, multiplicação e
divisão. O programa deve usar laços de repetição para possibilitar ao usuário a
escolha da operação desejada, a exibição do resultado e a volta ao menu de
opções. O programa só termina quando for escolhida a opção de saída. 
*/
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int opc = 0, num1 = 0, num2 = 0, result = 0;

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("============== MENU ==============");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Sair");
            System.out.print("Opcão: ");
            opc = leia.nextInt();    
        
            if (opc >= 1 && opc < 5) {
                System.out.println("1° Número: ");
                num1 = leia.nextInt(); 
                System.out.println("2° Número: ");
                num2 = leia.nextInt();
            }
            
            switch(opc) {
    
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ERRO - Opção não existe - Tente Novamente");   
            }      
        }
        while (opc != 5);

        System.out.println("Saindo....");

        leia.close();
    }
}
