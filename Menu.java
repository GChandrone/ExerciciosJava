import java.util.Scanner;

public class Menu{

    public static void main(String[] args) {

        int opc = 0;

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("============== MENU ==============");
            System.out.println("[0] Escreve -> 'Olá Mundo!'");
            System.out.println("[1] Escreve -> 'Hello World!'");
            System.out.print("Opcão: ");
            opc = leia.nextInt();    
        
            switch(opc) {
    
                case 0:
                    System.out.println("Olá Mundo!");
                    break;
                case 1:
                    System.out.println("Hello World!");
                    break;
                default:
                    System.out.println("ERRO - Opção não existe - Tente Novamente");   
            }      
        }
        while (opc != 0 && opc != 1);

        leia.close();
   
    }

}