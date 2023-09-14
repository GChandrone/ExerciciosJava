public class Ex6_Multiplo10 {
    public static void main(String[] args) {
       
        System.out.println("================ MULTIPLOS DE 10 ================");
        
        for (int i = 1; i <= 100; i++){
            if (i % 10 == 0) {
                System.out.println(i + " -> é Multiplo de 10");
            } else {
                System.out.println(i);
            }
       } 
       System.out.println("===================================================");
    }
}