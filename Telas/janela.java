import java.awt.Frame;
import javax.swing.*;

public class janela {
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        JButton b = new JButton("Cadastrar");
        JLabel nome = new JLabel("Nome:");
        JTextField tnome = new JTextField();
        JLabel telefone = new JLabel("Telefone:");
        JTextField tteleefone = new JTextField();

        telefone.setBounds(10, 40, 100, 100);
        tteleefone.setBounds(70, 81, 200, 20);
        nome.setBounds(10, 10, 100, 100);
        tnome.setBounds(55, 51, 200, 20);
        b.setBounds(900, 500, 100, 40);
                
        f.add(b);
        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setExtendedState(Frame.MAXIMIZED_BOTH);
        f.add(nome);
        f.add(tnome);
        f.add(telefone);
        f.add(tteleefone);
    }
}