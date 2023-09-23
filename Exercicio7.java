/* Gabriel da Cunha
7 - Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
a) A quantidade de pessoas em cada faixa etária;
b) A percentagem de pessoas na primeira e na última faixa etária, com relação ao total de pessoas:
Até 15 anos
De 16 a 30 anos
De 31 a 45 anos
De 46 a 60 anos
Acima de 61 anos
*/
import java.lang.Math;
public class Exercicio7 {
    public static void main(String[] args) {
        int idade = 0, faixa_15 = 0, faixa_16_30 = 0, faixa_31_45 = 0, faixa_46_60 = 0, faixa_61 = 0;
        double porcem_1ft = 0, porcem_2ft = 0;

        for (int i = 1; i <= 15; i++) {
            
            idade = (int)(Math.random() * 100);
            
            System.out.println(i + " ° idade: " + idade);
            
            if (idade <= 15) {
                faixa_15++;
            } else if (idade >= 16 && idade <= 30) {
                faixa_16_30++;
            } else if (idade >= 31 && idade <= 45) {
                faixa_31_45++;
            }else if (idade >= 46 && idade <= 60) {
                faixa_46_60++;
            }else {
                faixa_61++;
            }
        }
        
        System.out.println("============== FAIXA ETÁRIA ==============");

        System.out.println("Até 15 anos: " + faixa_15 + " pessoas");
        System.out.println("De 16 a 30 anos: " + faixa_16_30 + " pessoas");
        System.out.println("De 31 a 45 anos: " + faixa_31_45 + " pessoas");
        System.out.println("De 46 a 60 anos: " + faixa_46_60 + " pessoas");
        System.out.println("Acima de 60 anos: " + faixa_61 + " pessoas");
        System.out.println("Acima de 60 anos: " + faixa_61 + " pessoas");
        
        porcem_1ft = ((double)faixa_15 / 15.0) * 100;
        porcem_2ft = ((double)faixa_61 / 15.0) * 100;

        System.out.println("------------------------------------------");

        System.out.println("Porcentagem de pessoas na primeira faixa etária: " + String.format("%.2f",porcem_1ft) + "%");
        System.out.println("Porcentagem de pessoas na segunda faixa etária: " + String.format("%.2f",porcem_2ft) + "%");

    }
}
