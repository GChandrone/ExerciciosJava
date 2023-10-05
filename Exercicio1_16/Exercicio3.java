/* Gabriel da Cunha
3 - Crie um programa que peça um número ao usuário e armazene ele na variável
x. Depois peça outro número e armazene na variável y. Mostre esses números.
Em seguida, faça com que x passe a ter o valor de y, e que y passe a ter o valor
de x.
*/
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        int x = 0, y = 0, aux = 0;
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");
        x = leia.nextInt();
        
        System.out.print("Digite outro número: ");
        y = leia.nextInt();

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);

        aux = x;
        x = y;
        y = aux;
        
        System.out.println("-----------------");

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        leia.close();
    }
}
