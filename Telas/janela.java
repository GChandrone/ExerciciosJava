import java.awt.Frame;
import javax.swing.*;

public class janela {
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        
        JButton b = new JButton("Enviar");
        
        b.setBounds(900, 500, 100, 40);
        
        f.add(b);
        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setExtendedState(Frame.MAXIMIZED_BOTH);
    }
}