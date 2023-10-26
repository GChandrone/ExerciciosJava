package Funcao;

import java.util.Scanner;

public class funcao {
    public static int calcdesconto(int laranja, int banana) {
        return laranja + banana;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Quantidade de laranjas: ");
        int fruta1 = leia.nextInt();
        System.out.print("Quantidade de bananas: ");
        int fruta2 = leia.nextInt();

        leia.close();

        int resultado = calcdesconto(fruta1, fruta2);
        System.out.println("Quantidade de frutas: " + resultado);
    }

}
