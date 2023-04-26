import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JToggleButton;
import java.awt.Toolkit;

public class Play extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play frame = new Play();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	boolean ver = false;
	boolean ver2 = true;

	private JPanel contentPanel;

	// es una clase para poder redondear el boton
	public class RoundedButton extends JButton {

		public RoundedButton(String label) {
			super(label);

			// Asegurarse de que el botón sea completamente opaco
			setContentAreaFilled(false);
		}

		// Anular el método paintComponent() para dibujar el botón personalizado
		protected void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;

			// Dibujar un rectángulo redondeado
			RoundRectangle2D rect = new RoundRectangle2D.Float(0, 0, (getWidth() - 1) * 2, (getHeight() - 1) * 2, 26,
					26);

			// Establecer un color de fondo redondeado utilizando GradientPaint
			GradientPaint gradient = new GradientPaint(0, 0, new Color(255, 255, 255), 0, getHeight(),
					new Color(255, 255, 255));
			g2.setPaint(gradient);

			g2.fill(rect);

			// Dibujar el texto
			super.paintComponent(g);
		}

		// Anular el método paintBorder() para eliminar el borde predeterminado del
		// botón
		protected void paintBorder(Graphics g) {
			// No hacer nada
		}
	}

	/**
	 * Create the frame.
	 */
	public Play() {

		int[] NVirus = new int[4];
		VacunasPor Vacuna = new VacunasPor();

		setFont(new Font("Times New Roman", Font.PLAIN, 29));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\oriol\\Pictures\\logo smbf.png"));
		setBackground(Color.BLACK);
		setTitle("PANDEMIC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1257, 792);
		setResizable(false);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		// es el panel general va debajo de todo
		JPanel panel_general = new JPanel();
		panel_general.setBorder(new LineBorder(new Color(15, 255, 177), 6, true));
		panel_general.setBackground(new Color(0, 0, 0));
		panel_general.setBounds(0, 0, 1241, 755);
		contentPanel.add(panel_general);
		panel_general.setLayout(null);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JPanel vacuna2 = new JPanel();
		vacuna2.setBorder(new LineBorder(new Color(15, 255, 177), 6));
		vacuna2.setVisible(ver);
		vacuna2.setBackground(null);
		vacuna2.setBounds(0, 568, 1241, 187);
		panel_general.add(vacuna2);
		vacuna2.setLayout(null);

		JButton btnAlfa = new JButton("");
		btnAlfa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAlfa.setIcon(new ImageIcon(Play.class.getResource("/vacunas/alfa2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnAlfa.setIcon(new ImageIcon(Play.class.getResource("/vacunas/alfa1.png")));
			}
		});

		btnAlfa.setIcon(new ImageIcon(Play.class.getResource("/vacunas/alfa1.png")));
		btnAlfa.setContentAreaFilled(false);
		btnAlfa.setBorderPainted(false);
		btnAlfa.setBorder(null);
		btnAlfa.setBackground((Color) null);
		btnAlfa.setBounds(10, 40, 305, 108);
		vacuna2.add(btnAlfa);

		JButton btnBeta = new JButton("");
		btnBeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBeta.setIcon(new ImageIcon(Play.class.getResource("/vacunas/beta2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnBeta.setIcon(new ImageIcon(Play.class.getResource("/vacunas/beta1.png")));
			}
		});

		btnBeta.setIcon(new ImageIcon(Play.class.getResource("/vacunas/beta1.png")));
		btnBeta.setContentAreaFilled(false);
		btnBeta.setBorderPainted(false);
		btnBeta.setBorder(null);
		btnBeta.setBackground((Color) null);
		btnBeta.setBounds(313, 40, 305, 108);
		vacuna2.add(btnBeta);

		JButton btnDelta = new JButton("");
		btnDelta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDelta.setIcon(new ImageIcon(Play.class.getResource("/vacunas/delta2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDelta.setIcon(new ImageIcon(Play.class.getResource("/vacunas/delta1.png")));
			}
		});

		btnDelta.setIcon(new ImageIcon(Play.class.getResource("/vacunas/delta1.png")));
		btnDelta.setContentAreaFilled(false);
		btnDelta.setBorderPainted(false);
		btnDelta.setBorder(null);
		btnDelta.setBackground((Color) null);
		btnDelta.setBounds(623, 40, 305, 108);
		vacuna2.add(btnDelta);

		JButton btnGama = new JButton("");
		btnGama.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGama.setIcon(new ImageIcon(Play.class.getResource("/vacunas/gama2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnGama.setIcon(new ImageIcon(Play.class.getResource("/vacunas/gama1.png")));
			}
		});

		btnGama.setIcon(new ImageIcon(Play.class.getResource("/vacunas/gama1.png")));
		btnGama.setContentAreaFilled(false);
		btnGama.setBorderPainted(false);
		btnGama.setBorder(null);
		btnGama.setBackground((Color) null);
		btnGama.setBounds(926, 40, 305, 108);
		vacuna2.add(btnGama);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JPanel Action1 = new JPanel();
		Action1.setBorder(new LineBorder(new Color(15, 255, 177), 6));
		Action1.setVisible(true);
		Action1.setBackground(null);
		Action1.setBounds(352, 568, 889, 187);
		panel_general.add(Action1);
		Action1.setLayout(null);

		JButton btnCura = new JButton("");
		btnCura.setContentAreaFilled(false);
		btnCura.setBorderPainted(false);
		btnCura.setBorder(null);
		btnCura.setBackground(null);
		btnCura.setIcon(new ImageIcon(Play.class.getResource("/play/btnCura.png")));
		btnCura.setBounds(36, 45, 378, 108);
		Action1.add(btnCura);

		JButton btnVacuna = new JButton("");
		btnVacuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action1.setVisible(ver);
				vacuna2.setVisible(!vacuna2.isVisible());
			}
		});
		btnAlfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action1.setVisible(true);
				;
			}
		});
		btnBeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action1.setVisible(true);
				;
			}
		});
		btnDelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action1.setVisible(true);
				;
			}
		});
		btnGama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action1.setVisible(true);
				;
			}
		});
		btnVacuna.setContentAreaFilled(false);
		btnVacuna.setBorderPainted(false);
		btnVacuna.setBorder(null);
		btnVacuna.setBackground(null);
		btnVacuna.setIcon(new ImageIcon(Play.class.getResource("/play/btnVacuna.png")));
		btnVacuna.setBounds(469, 45, 378, 108);
		Action1.add(btnVacuna);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (tglbtnNewToggleButton.isSelected()) {
					// Si el botón de alternancia está seleccionado, actualizar la posición y tamaño
					// de los componentes
					btnCura.setIcon(new ImageIcon(Play.class.getResource("/play/btnCura2.png")));
					btnCura.setBounds(107, 11, 468, 166);
					btnVacuna.setIcon(new ImageIcon(Play.class.getResource("/play/btnCura2.png")));
					btnVacuna.setBounds(696, 11, 468, 165);
					Action1.setBounds(0, 568, 1241, 187);
				} else {
					// Si el botón de alternancia no está seleccionado, restaurar la posición y
					// tamaño predeterminados de los componentes
					btnCura.setIcon(new ImageIcon(Play.class.getResource("/play/btnCura.png")));
					btnCura.setBounds(36, 45, 378, 108);
					btnVacuna.setIcon(new ImageIcon(Play.class.getResource("/play/btnVacuna.png")));
					btnVacuna.setBounds(469, 45, 378, 108);
					Action1.setBounds(352, 568, 889, 187);
				}
			}
		});
		tglbtnNewToggleButton.setContentAreaFilled(false);
		tglbtnNewToggleButton.setBorder(null);
		tglbtnNewToggleButton.setBorderPainted(false);
		tglbtnNewToggleButton.setPressedIcon(new ImageIcon(Play.class.getResource("/play/eye.png")));
		tglbtnNewToggleButton.setBackground(null);
		tglbtnNewToggleButton.setOpaque(false);
		tglbtnNewToggleButton.setIcon(new ImageIcon(Play.class.getResource("/play/eye2.png")));
		tglbtnNewToggleButton.setSelectedIcon(new ImageIcon(Play.class.getResource("/play/eye.png")));
		tglbtnNewToggleButton.setBounds(366, 510, 69, 47);
		panel_general.add(tglbtnNewToggleButton);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JLabel LabelMapImage = new JLabel("");
		LabelMapImage.setIcon(new ImageIcon(Play.class.getResource("/play/MapaPokemon.png")));
		LabelMapImage.setBounds(0, 0, 1241, 572);
		panel_general.add(LabelMapImage);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JPanel panel = new JPanel();
		panel.setName("");
		panel.setBackground(Color.BLACK);
		panel.setBounds(6, 573, 346, 175);
		panel_general.add(panel);
		panel.setLayout(null);

		JTextPane txtpnAlfa = new JTextPane();
		txtpnAlfa.setVisible(false);

		JTextPane txtpnInfo = new JTextPane();
		// txtpnInfo.setText("Nº Infeccion: " + busc_ciudad.contarInfecciones() + "Nº
		// Brotes: "+ busc_ciudad.contarBrotes());
		txtpnInfo.setText(
				" Nº Infeccion: " + busc_ciudad.contarInfecciones() + "   Nº Brotes: " + busc_ciudad.contarBrotes());
		txtpnInfo.setForeground(Color.YELLOW);
		txtpnInfo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtpnInfo.setEditable(false);
		txtpnInfo.setBackground(Color.BLACK);
		txtpnInfo.setBounds(0, 0, 346, 30);
		panel.add(txtpnInfo);
		txtpnAlfa.setText("Alfa");
		txtpnAlfa.setForeground(Color.BLUE);
		txtpnAlfa.setFont(new Font("Times New Roman", Font.BOLD, 28));
		txtpnAlfa.setEditable(false);
		txtpnAlfa.setBackground(null);
		txtpnAlfa.setBounds(10, 24, 70, 31);
		panel.add(txtpnAlfa);

		JTextPane txtpnBeta = new JTextPane();
		txtpnBeta.setVisible(false);
		txtpnBeta.setText(" Beta");
		txtpnBeta.setForeground(Color.RED);
		txtpnBeta.setFont(new Font("Times New Roman", Font.BOLD, 28));
		txtpnBeta.setEditable(false);
		txtpnBeta.setBackground(null);
		txtpnBeta.setBounds(74, 24, 70, 31);
		panel.add(txtpnBeta);

		JTextPane txtpnDelta = new JTextPane();
		txtpnDelta.setVisible(false);
		txtpnDelta.setText("Delta");
		txtpnDelta.setForeground(Color.ORANGE);
		txtpnDelta.setFont(new Font("Times New Roman", Font.BOLD, 28));
		txtpnDelta.setEditable(false);
		txtpnDelta.setBackground(null);
		txtpnDelta.setBounds(154, 24, 71, 31);
		panel.add(txtpnDelta);

		JTextPane txtpnGama = new JTextPane();
		txtpnGama.setVisible(false);
		txtpnGama.setText("Gama");
		txtpnGama.setForeground(Color.GREEN);
		txtpnGama.setFont(new Font("Times New Roman", Font.BOLD, 28));
		txtpnGama.setEditable(false);
		txtpnGama.setBackground(null);
		txtpnGama.setBounds(235, 24, 79, 31);
		panel.add(txtpnGama);

		JLabel LoadAlfa = new JLabel("New label");
		LoadAlfa.setVisible(false);
		LoadAlfa.setIcon(new ImageIcon(Play.class.getResource("/play/loadAlfa/0.png")));
		LoadAlfa.setBounds(12, 56, 44, 119);
		panel.add(LoadAlfa);

		btnAlfa.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Vacuna.setALFA(10);
				LoadAlfa.setIcon(Vacuna.getAlfaImage());
				vacuna2.setVisible(false);
			}
		});

		JLabel LoadBeta = new JLabel("New label");
		LoadBeta.setVisible(false);
		LoadBeta.setIcon(new ImageIcon(Play.class.getResource("/play/loadBeta/0.png")));
		LoadBeta.setBounds(85, 55, 44, 119);
		panel.add(LoadBeta);

		btnBeta.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				Vacuna.setBETA(10);
				LoadBeta.setIcon(Vacuna.getBetaImage());
				vacuna2.setVisible(false);

			}
		});

		JLabel LoadDelta = new JLabel("New label");
		LoadDelta.setVisible(false);
		LoadDelta.setIcon(new ImageIcon(Play.class.getResource("/play/loadDelta/0.png")));
		LoadDelta.setBounds(163, 57, 44, 119);
		panel.add(LoadDelta);

		btnDelta.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				Vacuna.setDELTA(10);
				LoadDelta.setIcon(Vacuna.getDeltaImage());
				vacuna2.setVisible(false);

			}
		});

		JLabel LoadGama = new JLabel("New label");
		LoadGama.setVisible(false);
		LoadGama.setIcon(new ImageIcon(Play.class.getResource("/play/loadGama/0.png")));
		LoadGama.setBounds(250, 55, 44, 119);
		panel.add(LoadGama);
		
		btnGama.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				Vacuna.setGAMA(10);
				LoadGama.setIcon(Vacuna.getGamaImage());
				vacuna2.setVisible(false);

			}
		});

		NVirus = busc_ciudad.VirusPueblo;
		if (NVirus[0] == 1) {
			txtpnAlfa.setVisible(true);
			LoadAlfa.setVisible(true);
		}
		if (NVirus[1] == 1) {
			txtpnBeta.setVisible(true);
			LoadBeta.setVisible(true);
		}
		if (NVirus[2] == 1) {
			txtpnDelta.setVisible(true);
			LoadDelta.setVisible(true);
		}
		if (NVirus[3] == 1) {
			txtpnGama.setVisible(true);
			LoadGama.setVisible(true);
		}

	}
}