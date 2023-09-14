import java.math.BigInteger;
public class Ex7_x2_anterior {
    public static void main(String[] args) {
        BigInteger somatotal = BigInteger.valueOf(1);
        
        System.out.println("================== DOBRO DO ANTERIOR ==================");
        
        for (int i = 1; i <= 64; i++) {
            somatotal = somatotal.multiply(BigInteger.valueOf(2));
        }
        
        System.out.println("=======================================================");
        System.out.println("Soma total: " + somatotal);
    }
}



