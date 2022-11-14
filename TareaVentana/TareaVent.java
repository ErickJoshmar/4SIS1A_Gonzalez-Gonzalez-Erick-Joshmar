import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareaVent extends JFrame {

    private JPanel mainPanel;
    private JTextField userBox;
    private JPasswordField passBox;
    public TareaVent() {
        this.setTitle("Tarea Ventana");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        iniciarComponentes();

    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();

    }

    private void colocarPaneles() {
        //panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        this.getContentPane().add(mainPanel);
    }

    /**
     * 
     */
    private void colocarBotones() {

        userBox = new JTextField();
        passBox = new JPasswordField();

        //Boton de salir
        JButton registroButton = new JButton("Registrar");
        registroButton.setBounds(180, 80, 120, 30);
        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mainPanel.add(registroButton);

     
    }

    JButton loginButton = new JButton("iniciar Sesion");
    loginButton.setBackground(Color.white);
    loginButton.setBounds(10, 80, 120, 25);
    mainPanel.add(loginButton);

    ActionListener userLoginButton = (ActionEvent e) -> {
        String usuarioUser = "Luis";
        String usuarioPass = "Supercapiron";
        
        if (usuarioUser.equals(userBox.getText())) {
            String contrasena = "";
            
            for (int i = 0; i < passBox.getPassword().length; i++) {
                contrasena += passBox.getPassword()[i];
            }
            
            if (usuarioPass.equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error, contraseña incorrecta");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "¿ Y tú quien eres?");
        }
    };

    loginButton.addActionListener(userLoginButton);
    @Override
    public String toString() {
        return "TareaVent [mainPanel=" + mainPanel + ", userBox=" + userBox + ", passBox=" + passBox + ", loginButton="
                + loginButton + ", userLoginButton=" + userLoginButton + "]";
    }
    }

    private void colocarEtiquetas() {
        //Usuario/contraseña
        JLabel userLabel = new JLabel("Usuario");
        userLabel.setBounds(10, 10, 120, 50);
        mainPanel.add(userLabel);
       
        userBox.setBounds(160, 20, 160, 25);
        mainPanel.add(userBox);

        JLabel userPass = new JLabel("Contraseña");
        userPass.setBounds(10, 40, 80, 50);
        mainPanel.add(userPass);
        passBox.setBounds(160, 50, 160, 25);
        mainPanel.add(passBox);

    }
    public static void main(String[] args) {
        TareaVent mainPanel = new TareaVent();
        mainPanel.setVisible(true);

    }

}