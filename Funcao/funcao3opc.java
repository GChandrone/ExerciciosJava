package Funcao;

import java.util.Scanner;

public class funcao3opc {
    
    /* Função que calcula a área do círculo */
    public static double areacirculo(double r){
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
    
    /* Função que calcula o volume do cone */
    public static double volumecone(double r, double h){
        double volume = 1.0 / 3.0 * h * Math.PI * Math.pow(r, 2);
        return volume;
    }
    
    /* Procedimento para desenhar o MENU */
    public static void menu(){
        System.out.println("=================== MENU ==================");
        System.out.println("[1] Área do circulo");
        System.out.println("[2] Volume de um Cone ");   
        System.out.println("[3] Sair");
        System.out.print("Opcão: ");
    }

    /* Procedimento para limpar o terminal */
    public static void limpatela() {
        try {
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar o terminal.");
        }
    }

    public static void main(String[] args) {
        String opc = "";
        
        Scanner leia = new Scanner(System.in);
        Scanner enter = new Scanner (System.in);
        
        do {
            opc = "";
            limpatela();

            menu();
            
            opc = leia.next();    

            switch(opc) {
    
                case "1":
                    System.out.print("\nInforme o raio do círculo [metros]: ");
                    double raio = leia.nextDouble();
                    
                    double resultado = areacirculo(raio);

                    System.out.println("-------------------------------------------");
                    System.out.println("A área do círculo é aproximadamente " + String.format("%.2f", resultado) + " m²");
                    
                    System.out.print("\nAperte [Enter] para voltar ao Menu ");
                    enter.nextLine();   
                    
                    break;
                case "2":
                    System.out.print("\nInforme o raio da base do cone [metros]: ");
                    raio = leia.nextDouble();
                    
                    System.out.print("\nInforme a altura do cone [metros]: ");
                    double altura = leia.nextDouble();
                    
                    resultado = volumecone(raio, altura);

                    System.out.println("-------------------------------------------");
                    System.out.println("O volume do cone é aproximadamente " + String.format("%.2f", resultado) + " m³");
                    
                    System.out.print("\nAperte [Enter] para voltar ao Menu ");
                    enter.nextLine();   
                    
                    break;
                case "3":
                    break;
                default:
                    System.out.println("ERRO - Opção não existe");   
                    System.out.print("\nAperte [Enter] para voltar ao Menu ");
                    enter.nextLine();   
            }      
        }    
        while (!opc.equals("3"));

        System.out.println("\nSaindo....");

        leia.close();
        enter.close();
    }
}
    

    
