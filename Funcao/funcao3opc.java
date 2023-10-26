package Funcao;

import java.util.Scanner;

/**
 * funcao3opc
 */
public class funcao3opc {
    
    public static double areacirculo(double r){
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
        
    public static double volumecone(double r, double h){
        double volume = 1 / 3 * h * Math.PI * Math.pow(r, 2);
        return volume;
    }
    
    public static void main(String[] args) {
        int opc = 0;

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("============== MENU ==============");
            System.out.println("[1] Área do circulo");
            System.out.println("[2] Volume de um Cone ");   
            System.out.println("[3] Sair");
            System.out.print("Opcão: ");
            opc = leia.nextInt();    
            
            if (opc < 1 || opc > 3) {
                opc = 0;
            }

            switch(opc) {
    
                case 1:
                    System.out.print("Informe o raio do círculo: ");
                    double raiocirculo = leia.nextDouble();
                    System.out.println("A área do círculo é " + areacirculo(raiocirculo));
                    break;
                case 2:
                    System.out.print("Informe o raio da base do cone: ");
                    double raiocone = leia.nextDouble();
                    
                    System.out.print("Informe a altura do cone: ");
                    double altura = leia.nextDouble();
                    
                    System.out.println("A área do círculo é " + volumecone(raiocone, altura));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERRO - Opção não existe - Tente Novamente");   
            }      
        }
        while (opc != 3);

        System.out.println("Saindo....");

        leia.close();
    }
}
    

    
