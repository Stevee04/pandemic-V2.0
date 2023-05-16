import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayerName extends JFrame {
    private JTextField textField;
    private JLabel introLabel;
    private JButton saveButton;
    private String nickname;

    public PlayerName() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\oriol\\Pictures\\logo smbf.png"));
        // Crear el campo de texto y el botón
        textField = new JTextField(20);
        saveButton = new JButton("Guardar");

        // Agregar un ActionListener al botón
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto ingresado por el usuario
                nickname = textField.getText();

                // Hacer algo con el nickname (por ejemplo, guardarlo en una variable)
                System.out.println("El nickname es: " + nickname);
                dispose();
            }
        });

        // Crear el JLabel para el texto de introducción
        introLabel = new JLabel("Introduce tu nickname:");

        // Agregar el campo de texto, el botón y el JLabel al JFrame
        JPanel panel = new JPanel();
        panel.add(introLabel);
        panel.add(textField);
        panel.add(saveButton);
        getContentPane().add(panel);

        // Configurar el JFrame
        setTitle("Ingrese su nickname");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 80));
    }

    public static void introducirNombre() {
        new PlayerName();
    }
}
