import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;
import java.time.LocalTime;
public class RandonFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for (int i = 1; i <= 1000000; i++) {
                LocalTime time = LocalTime.now();
                myWriter.append(time + " - " + (int) (Math.random() * (100 - 1) + 1) + "\n");
            }
            myWriter.close();
            System.out.println("100 números gerados com SUCESSO!!");
        } catch (IOException e) {
            System.out.println("Erro ao Gravar.");
            e.printStackTrace();
        }      
  }
}
    

