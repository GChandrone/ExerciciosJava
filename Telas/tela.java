import java.awt.Frame;
import javax.swing.*;

public class tela {
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        
        JButton salvar = new JButton("Salvar");

        JButton cancelar = new JButton("Cancelar");
        
        JLabel nome = new JLabel("Nome:");
        JTextField tnome = new JTextField();
        
        JLabel cpf = new JLabel("CPF:");
        JTextField tcpf = new JTextField();

        JLabel telefone = new JLabel("Telefone:");
        JTextField tteleefone = new JTextField();

        JLabel e_mail = new JLabel("E-mail:");
        JTextField te_mail = new JTextField();

        JLabel endereco = new JLabel("Endereço:");
        JTextField tendereco = new JTextField();

        nome.setBounds(10, 10, 100, 100);
        tnome.setBounds(70, 51, 200, 20);

        cpf.setBounds(10, 40, 100, 100);
        tcpf.setBounds(70, 81, 200, 20);
        
        telefone.setBounds(10, 70, 100, 100);
        tteleefone.setBounds(70, 111, 200, 20);
        
        e_mail.setBounds(10, 100, 100, 100);
        te_mail.setBounds(70, 141, 200, 20);     
        
        endereco.setBounds(10, 130, 100, 100);
        tendereco.setBounds(70, 171, 200, 20);

        salvar.setBounds(70, 201, 70, 20);

        cancelar.setBounds(180, 201, 90, 20);

        f.add(salvar);
        f.add(cancelar);
        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setExtendedState(Frame.MAXIMIZED_BOTH);
        f.add(nome);
        f.add(tnome);
        f.add(telefone);
        f.add(tteleefone);
        f.add(cpf);
        f.add(tcpf);
        f.add(e_mail);
        f.add(te_mail);
        f.add(endereco);
        f.add(tendereco);
    }
}