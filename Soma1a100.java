public class Soma1a100 {
    public static void main(String[] args) {
        int somatotal = 0;

        for (int i = 1; i <= 100; i++) {
            somatotal += i;
        }
        
        System.out.println("============= Soma de 1 a 100 =============");
        System.out.println("Soma de todos os números de 1 a 100: " + somatotal);
    }
}
