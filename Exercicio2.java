/* Gabriel da Cunha
2 - Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que
pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não. Use
alguns dos operadores lógicos OU (||) e E (&&). 
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int idade = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.print("Você pode doar sangue!");
        } else {
            System.out.print("Você não pode doar sangue :(");
        }
        leia.close();
    }
}
