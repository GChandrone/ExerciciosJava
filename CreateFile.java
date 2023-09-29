import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("Arquivo criado: " + myObj.getName());
      } else {
        System.out.println("Arquivo ja foi criado");
      }
    } catch (IOException e) {
      System.out.println("Erro ao criar o arquivo.");
      e.printStackTrace();
    }
    
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("São Paulo maior do Brasil!!\n");
      myWriter.append("Flamengo ruim!");
      myWriter.close();
      System.out.println("Gravado com sucesso");
    } catch (IOException e) {
      System.out.println("Erro ao Gravar.");
      e.printStackTrace();
    }      
  }
}