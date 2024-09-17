package pacoteSoma;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Soma extends JFrame {

    private JPanel contentPane;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JLabel lblResultado;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Soma frame = new Soma();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Soma() {
        setUndecorated(true);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 466, 386);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNumero1 = new JLabel("Número 1");
        lblNumero1.setFont(new Font("Arial Black", Font.PLAIN, 24));
        lblNumero1.setBounds(45, 29, 127, 51);
        contentPane.add(lblNumero1);
        
        JLabel lblNumero2 = new JLabel("Número 2");
        lblNumero2.setFont(new Font("Arial Black", Font.PLAIN, 24));
        lblNumero2.setBounds(45, 91, 127, 51);
        contentPane.add(lblNumero2);
        
        txtNumero1 = new JTextField();
        txtNumero1.setColumns(10);
        txtNumero1.setBounds(198, 45, 200, 30);
        contentPane.add(txtNumero1);
        
        txtNumero2 = new JTextField();
        txtNumero2.setColumns(10);
        txtNumero2.setBounds(198, 107, 200, 30);
        contentPane.add(txtNumero2);
        
        JButton btnSomar = new JButton("Soma");
        btnSomar.setFont(new Font("Arial Black", Font.PLAIN, 24));
        btnSomar.setBounds(266, 157, 132, 39);
        btnSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(txtNumero1.getText());
                    double n2 = Double.parseDouble(txtNumero2.getText());
                    
                    double soma = n1 + n2;
                    
                    // Update the result label with formatted output
                    lblResultado.setText(String.format("Resultado: %.2f", soma));
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Erro: Entrada inválida!");
                }
            }
        });
        contentPane.add(btnSomar);
        
        JButton btnSair = new JButton("Sair");
        btnSair.setFont(new Font("Arial Black", Font.PLAIN, 24));
        btnSair.setBounds(55, 157, 132, 39);
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        contentPane.add(btnSair);
        
        // Create and position the result label
        lblResultado = new JLabel("");
        lblResultado.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lblResultado.setBounds(45, 220, 353, 30);
        contentPane.add(lblResultado);
    }
}
