import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JButton;

public class FinGame extends JFrame {
    private ImageIcon gif;
    private JLabel char1;
    private JLabel char2;
    
    public FinGame() {
        super("Temporizador de GIF");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1264, 738);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);
        
        char1 = new JLabel("");
        char1.setIcon(new ImageIcon(FinGame.class.getResource("/video/deathchar.gif")));
        char1.setBounds(0, 0, 446, 700);
        getContentPane().add(char1);
        
        char2 = new JLabel("");
        char2.setIcon(new ImageIcon(FinGame.class.getResource("/video/deathchar.gif")));
        char2.setBounds(802, 0, 446, 700);
        getContentPane().add(char2);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(444, 0, 361, 700);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JTextPane txtpnGameOver = new JTextPane();
        txtpnGameOver.setAutoscrolls(false);
        txtpnGameOver.setDropMode(DropMode.INSERT);
        txtpnGameOver.setForeground(new Color(255, 255, 0));
        txtpnGameOver.setFont(txtpnGameOver.getFont().deriveFont(txtpnGameOver.getFont().getSize() + 107f));
        txtpnGameOver.setText("GAME\r\nOVER");
        txtpnGameOver.setOpaque(false);
        txtpnGameOver.setEditable(false);
        txtpnGameOver.setBounds(0, 11, 361, 310);
        panel.add(txtpnGameOver);
        
        JButton btnNewButton = new JButton("New Game");
        btnNewButton.setBounds(47, 371, 247, 69);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("save ranking");
        btnNewButton_1.setBounds(47, 468, 247, 69);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Menu");
        btnNewButton_2.setBounds(47, 558, 254, 69);
        panel.add(btnNewButton_2);
        
        
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new FinGame();
    }
}
