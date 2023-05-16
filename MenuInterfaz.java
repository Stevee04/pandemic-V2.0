import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.TextArea;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import java.awt.Cursor;

public class MenuInterfaz extends JFrame {

	boolean ver = false;

	// Se crea una instancia de la clase "LeerParametros" y se asigna a la variable
	// "P"
	LeerParametros P = new LeerParametros();
	// Se crea una instancia de la clase "musica" y se asigna a la variable "m"
	musica m = new musica();

	// Se crea un objeto de la clase JPanel llamado "contentPanel".
	private JPanel contentPanel;

	// El constructor de la clase "MenuInterfaz" comienza a definirse.
	public MenuInterfaz() {
		// se cambia la imagen del raton y se crea el panel
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuInterfaz.class.getResource("/image/demanda.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1182, 588);
		setResizable(false);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		// Se llama al método "menuMusic()" del objeto "m" para que empieze a sonar una
		// cancion
		m.menuMusic();

		// es el panel general va debajo de todo
		JPanel panel_general = new JPanel();
		panel_general.setBackground(Color.LIGHT_GRAY);
		panel_general.setBounds(0, 0, 1166, 549);
		contentPanel.add(panel_general);
		panel_general.setLayout(null);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		// creamos el panel nickname con sus caracterisiticas
		JPanel panelNickname = new JPanel();
		panelNickname.setOpaque(false);
		panelNickname.setBounds(500, 200, 524, 68);
		panel_general.add(panelNickname);
		panelNickname.setVisible(false);
		panelNickname.setForeground(null);
		panelNickname.setBackground(null);
		panelNickname.setLayout(null);

		// creamos un TextField que es para poner tu nombre ( NICK )
		JTextField txtNickname = new JTextField(20);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// Cambiamos la imagen del raton cuando entra dentro del TextField
		Cursor cursor = toolkit.createCustomCursor(toolkit.getImage("src/image/minichiquillo.png"), new Point(0, 0),
				"Logo");
		txtNickname.setCursor(cursor);
		txtNickname.setBounds(194, 11, 245, 43);
		txtNickname.setForeground(new Color(0, 0, 0));
		txtNickname.setBackground(new Color(197, 197, 197));
		txtNickname.setText("Nickname");
		txtNickname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panelNickname.add(txtNickname);

		// creamos un JLabel que pone Introduce tu nickname
		JLabel introLabel = new JLabel("Introduce tu nickname:");
		introLabel.setBounds(10, 7, 188, 50);
		introLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		introLabel.setForeground(new Color(0, 0, 0));
		introLabel.setBackground(new Color(255, 255, 255));
		panelNickname.add(introLabel);

		// creamos un boton llamado saveButton para guardar el NICK dentro de la base de
		// datos
		JButton saveButton = new JButton("");
		// setFocusPainted y setBorderPainted sirven para que solo se vea la imagen del
		// boton y no el reborde
		saveButton.setFocusPainted(false);
		saveButton.setBorderPainted(false);
		saveButton.setOpaque(false);
		saveButton.addMouseListener(new MouseAdapter() {
			@Override
			// cuando el raton entra y sale del boton cambia la imagen
			public void mouseEntered(MouseEvent e) {
				saveButton.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/image/save2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				saveButton.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/image/save.png")));
			}
		});
		saveButton.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/image/save.png")));
		saveButton.setBounds(461, 7, 54, 54);
		panelNickname.add(saveButton);
		saveButton.setBackground(null);

		// creamos un jlabel al fondo del todo para poner una imagen de fondo
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_nick.png")));
		lblNewLabel.setBounds(-19, -12, 560, 90);
		panelNickname.add(lblNewLabel);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		// creamos un panel llamado panelInt en el cual iran todos los botones de la
		// dificultad
		JPanel panelInt = new JPanel();
		panelInt.setVisible(ver);
		panelInt.setBackground(new Color(0, 0, 0));
		panelInt.setBounds(331, 5, 834, 540);
		panel_general.add(panelInt);
		panelInt.setLayout(null);

		// creamos el boton facil para poner el juego en la dificultad facil
		JButton btnFacil = new JButton("");
		btnFacil.setFocusPainted(false);
		btnFacil.setBorderPainted(false);
		btnFacil.addMouseListener(new MouseAdapter() {
			// si el raton esta dentro del boton muestra una imagen si esta fuera muestra
			// otra
			@Override
			public void mouseEntered(MouseEvent e) {
				btnFacil.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_facil.png")));
			}

			public void mouseClicked(MouseEvent e) {
				// para la cancion que hay en el menu
				m.stopMusic();
				// establece NPoke a 3 para luego en la clase play cambiar la imagen del raton a
				// la 3, al igual que el video del final si pierdes
				Play.NPoke = 3;
				// ajusta la dificultad en el archivo parametros.xml dentro de la clase
				// leerparametros
				P.editar(1);
				GuardarBD.dificultad = 1;
				// base de datos chiquillo
				Puntuaciaons_Pandemic.dificultad = 1;
				// en la clase busc_ciudad introduce todos los valores dentro de la array list
				busc_ciudad.GuardarArray();
				// genera las primeras ciudades infectadas segun los ajustes de LeerParametros
				Start_game.Start(LeerParametros.CiuInfInicio);
				// cierra la ventana del menu
				dispose();
				// se abre la ventana del juego
				Play.main(null);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnFacil.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_facil2.png")));
			}
		});
		btnFacil.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_facil2.png")));
		btnFacil.setBounds(225, 22, 395, 140);
		panelInt.add(btnFacil);
		btnFacil.setBackground(null);

		// creamos el boton Normal para poner el juego en la dificultad Normal
		JButton btnNormal = new JButton("");
		btnNormal.setFocusPainted(false);
		btnNormal.setBorderPainted(false);
		btnNormal.addMouseListener(new MouseAdapter() {
			// si el raton esta dentro del boton muestra una imagen si esta fuera muestra
			// otra
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNormal.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_normal.png")));
			}

			public void mouseClicked(MouseEvent e) {
				// para la cancion que hay en el menu
				m.stopMusic();
				// establece NPoke a 2 para luego en la clase play cambiar la imagen del raton a
				// la 2, al igual que el video del final si pierdes
				Play.NPoke = 2;
				// ajusta la dificultad en el archivo parametros.xml dentro de la clase
				// leerparametros
				P.editar(2);
				// GuardarBD.dificultad = 2;
				// base de datos chiquillo
				Puntuaciaons_Pandemic.dificultad = 2;
				// en la clase busc_ciudad introduce todos los valores dentro de la array list
				busc_ciudad.GuardarArray();
				// genera las primeras ciudades infectadas segun los ajustes de LeerParametros
				Start_game.Start(LeerParametros.CiuInfInicio);
				// cierra la ventana del menu
				dispose();
				// se abre la ventana del juego
				Play.main(null);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnNormal.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_normal2.png")));
			}
		});
		btnNormal.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_normal2.png")));
		btnNormal.setBounds(225, 190, 395, 140);
		panelInt.add(btnNormal);
		btnNormal.setBackground(null);

		// creamos el boton Dificil para poner el juego en la dificultad Dificil
		JButton btnDificil = new JButton("");
		btnDificil.setFocusPainted(false);
		btnDificil.setBorderPainted(false);
		btnDificil.addMouseListener(new MouseAdapter() {
			// si el raton esta dentro del boton muestra una imagen si esta fuera muestra
			// otra
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDificil.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_dificil.png")));
			}

			public void mouseClicked(MouseEvent e) {
				// para la cancion que hay en el menu
				m.stopMusic();
				// establece NPoke a 1 para luego en la clase play cambiar la imagen del raton a
				// la 1, al igual que el video del final si pierdes
				Play.NPoke = 1;
				// ajusta la dificultad en el archivo parametros.xml dentro de la clase
				// leerparametros
				P.editar(3);
				GuardarBD.dificultad = 3;
				// base de datos chiquillo
				Puntuaciaons_Pandemic.dificultad = 3;

				busc_ciudad.GuardarArray();
				// en la clase busc_ciudad introduce todos los valores dentro de la array list
				busc_ciudad.GuardarArray();
				// genera las primeras ciudades infectadas segun los ajustes de LeerParametros
				Start_game.Start(LeerParametros.CiuInfInicio);
				// cierra la ventana del menu
				dispose();
				// se abre la ventana del juego
				Play.main(null);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDificil.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_dificil2.png")));
			}
		});
		btnDificil.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/btn_level/btn_dificil2.png")));
		btnDificil.setBounds(225, 370, 395, 140);
		panelInt.add(btnDificil);
		btnDificil.setBackground(null);

		// cuando pulsas el boton guardar se guarda el nick y muestra los botones de las
		// diferentes dificultades
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// guarda el nick en una string que luego se le pasa a la base de datos
				String nickname = txtNickname.getText();
				//GuardarBD.apodoJugador = nickname;
				System.out.println("El nickname es: " + nickname);
				panelNickname.setVisible(false);
				panelInt.setVisible(!panelInt.isVisible());
				// GuardarBD.baseDeDatos();
			}
		});

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		// ceamos un panel llamado panelVersion en la cual se ve la version actual del
		// juego
		JPanel panelVersion = new JPanel();
		panelVersion.setVisible(ver);
		panelVersion.setBackground(new Color(0, 0, 0));
		panelVersion.setBounds(331, 5, 834, 540);
		panel_general.add(panelVersion);
		panelVersion.setLayout(null);

		JTextArea txtrVersion = new JTextArea();
		txtrVersion.setBackground(new Color(66, 66, 66));
		txtrVersion.setForeground(new Color(255, 255, 0));
		txtrVersion.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtrVersion.setText("\r\n                VERSION: 2.5");
		txtrVersion.setBounds(266, 230, 310, 85);
		panelVersion.add(txtrVersion);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		// creamos un panel llamado panelInfo que muestra toda la informacion sobre como
		// se juega el juego que esta guardada dentro de un .txt
		JPanel panelInfo = new JPanel();
		panelInfo.setVisible(ver);
		panelInfo.setBackground(new Color(0, 0, 0));
		panelInfo.setBounds(331, 5, 834, 540);
		panel_general.add(panelInfo);
		panelInfo.setLayout(null);

		// aqui lee el archivo .txt y lo muestra dentro del TextArea
		TextArea textInfo = new TextArea();
		textInfo.setEditable(false);
		try (BufferedReader br = new BufferedReader(new FileReader("InformacionJugoPandemic.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				textInfo.append(line + "\n");
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
		textInfo.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		textInfo.setForeground(new Color(255, 255, 0));
		textInfo.setBackground(new Color(58, 58, 58));
		textInfo.setBounds(10, 10, 814, 520);
		panelInfo.add(textInfo);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		// creamos un panel llamado panelPuntos que muestra los puntos de los anteriores
		// concursantes
		JPanel panelPuntos = new JPanel();
		panelPuntos.setForeground(new Color(0, 0, 0));
		panelPuntos.setVisible(false);
		panelPuntos.setBackground(new Color(0, 0, 0));
		panelPuntos.setBounds(331, 5, 834, 540);
		panelPuntos.setLayout(null);
		panel_general.add(panelPuntos);
		
		JTextArea txtrFdghgfhdjghjhjfhghfgjg = new JTextArea();
		txtrFdghgfhdjghjhjfhghfgjg.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtrFdghgfhdjghjhjfhghfgjg.setForeground(new Color(255, 255, 255));
		txtrFdghgfhdjghjhjfhghfgjg.setText("fdghgfhdjghjhjfhghfgjg");
		txtrFdghgfhdjghjhjfhghfgjg.setBackground(new Color(0, 0, 0));
		txtrFdghgfhdjghjhjfhghfgjg.setEditable(false);
		txtrFdghgfhdjghjhjfhghfgjg.setBounds(10, 10, 435, 520);
		panelPuntos.add(txtrFdghgfhdjghjhjfhghfgjg);
		
		JTextArea txtrDjksvbbbbbbbbbbbbbbbbbb = new JTextArea();
		txtrDjksvbbbbbbbbbbbbbbbbbb.setForeground(new Color(0, 255, 64));
		txtrDjksvbbbbbbbbbbbbbbbbbb.setText("djksvbbbbbbbbbbbbbbbbbb");
		txtrDjksvbbbbbbbbbbbbbbbbbb.setBackground(new Color(192, 192, 192));
		txtrDjksvbbbbbbbbbbbbbbbbbb.setEditable(false);
		txtrDjksvbbbbbbbbbbbbbbbbbb.setBounds(380, 10, 444, 520);
		panelPuntos.add(txtrDjksvbbbbbbbbbbbbbbbbbb);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		// creamos un panel llamado panelAutores en el que se ve sus autores y su
		// contacto
		JPanel panelAutores = new JPanel();
		panelAutores.setVisible(ver);
		panelAutores.setBackground(new Color(0, 0, 0));
		panelAutores.setBounds(331, 5, 834, 540);
		panel_general.add(panelAutores);
		panelAutores.setLayout(null);

		// este jlabel muestra la imagen del autor edgar chiquillo
		JLabel lblLabelEdgar = new JLabel("");
		lblLabelEdgar.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/autores/chiquito.png")));
		lblLabelEdgar.setForeground(new Color(0, 0, 0));
		lblLabelEdgar.setBackground(new Color(0, 0, 0));
		lblLabelEdgar.setBounds(91, 24, 251, 312);
		panelAutores.add(lblLabelEdgar);

		// este jlabel muestra la imagen del autor Orio Esteve
		JLabel lblLabelOriol = new JLabel("");
		lblLabelOriol.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/autores/Oriol.png")));
		lblLabelOriol.setForeground(new Color(0, 0, 0));
		lblLabelOriol.setBackground(new Color(0, 0, 0));
		lblLabelOriol.setBounds(501, 24, 251, 312);
		panelAutores.add(lblLabelOriol);

		// este TextPane muestra el nombre del autor en este caso Edgar Chiquillo y su
		// contacto (gmail)
		JTextPane txtpnEdgarChiquillo = new JTextPane();
		txtpnEdgarChiquillo.setForeground(new Color(255, 255, 0));
		txtpnEdgarChiquillo.setBackground(new Color(49, 49, 49));
		txtpnEdgarChiquillo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtpnEdgarChiquillo.setText("\r\n     Edgar Chiquillo\r\n edgarchb44@gmail.com");
		txtpnEdgarChiquillo.setBounds(67, 358, 311, 108);
		panelAutores.add(txtpnEdgarChiquillo);

		// este TextPane muestra el nombre del autor en este caso Oriol Esteve y su
		// contacto (gmail)
		JTextPane txtpnOriolEsteve = new JTextPane();
		txtpnOriolEsteve.setText("\r\n          Oriol Esteve\r\n orioleshereu@gmail.com");
		txtpnOriolEsteve.setForeground(Color.YELLOW);
		txtpnOriolEsteve.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtpnOriolEsteve.setBackground(new Color(49, 49, 49));
		txtpnOriolEsteve.setBounds(469, 358, 321, 108);
		panelAutores.add(txtpnOriolEsteve);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		// creamos el panel panel_botones en el cual estan todos los botones del menu
		JPanel panel_botones = new JPanel();
		panel_botones.setBackground(Color.BLACK);
		panel_botones.setBounds(7, 7, 314, 535);
		panel_general.add(panel_botones);
		panel_botones.setLayout(null);

		// creamos un boton llamado btnNuevaPartida que cuando se pasa por encima o le
		// das click cambia de imagen, muestra el panel del nickname
		JButton btnNuevaPartida = new JButton("");
		btnNuevaPartida.setFocusPainted(false);
		btnNuevaPartida.setBorderPainted(false);
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAutores.setVisible(false);
				panelVersion.setVisible(false);
				panelInfo.setVisible(false);
				panelPuntos.setVisible(false);
				panelNickname.setVisible(true);
			}
		});
		btnNuevaPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNuevaPartida.setIcon(
						new ImageIcon(MenuInterfaz.class.getResource("/segundobtn/btn_nueva_partida_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnNuevaPartida.setIcon(
						new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_nueva_partida_pequeño.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btnNuevaPartida.setIcon(
						new ImageIcon(MenuInterfaz.class.getResource("/tercerbtn/btn_nueva_partida_pequeño.png")));
			}
		});
		btnNuevaPartida
				.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_nueva_partida_pequeño.png")));
		btnNuevaPartida.setBackground(null);
		btnNuevaPartida.setBounds(-9, -2, 343, 77);
		panel_botones.add(btnNuevaPartida);
		
		// creamos un boton llamado btnCargarPartida que muestra una lista de las partida anteriores
		JButton btnCargarPartida = new JButton("");
		btnCargarPartida.setFocusPainted(false);
		btnCargarPartida.setBorderPainted(false);
		btnCargarPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCargarPartida.setIcon(
						new ImageIcon(MenuInterfaz.class.getResource("/segundobtn/btn_cargar_partida_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCargarPartida.setIcon(
						new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_cargar_partida_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnCargarPartida.setIcon(
						new ImageIcon(MenuInterfaz.class.getResource("/tercerbtn/btn_cargar_partida_pequeño.png")));
				panelNickname.setVisible(true);
			}
		});
		btnCargarPartida
				.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_cargar_partida_pequeño.png")));
		btnCargarPartida.setBackground(null);
		btnCargarPartida.setBounds(-9, 75, 343, 77);
		panel_botones.add(btnCargarPartida);

		// creamos un boton que muestra el panel con la informacion del juego
		JButton btnInfo = new JButton("");
		btnInfo.setFocusPainted(false);
		btnInfo.setBorderPainted(false);
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInt.setVisible(false);
				panelVersion.setVisible(false);
				panelAutores.setVisible(false);
				panelInfo.setVisible(!panelInfo.isVisible());
			}
		});
		btnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnInfo.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/segundobtn/btn_info_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnInfo.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_info_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnInfo.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/tercerbtn/btn_info_pequeño.png")));
			}
		});
		btnInfo.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_info_pequeño.png")));
		btnInfo.setBackground(null);
		btnInfo.setBounds(-9, 152, 343, 77);
		panel_botones.add(btnInfo);

		// creamos un boton que muestra el resumen de las anteriores puntuaciones
		JButton btnResumenPuntuaciones = new JButton("");
		btnResumenPuntuaciones.setFocusPainted(false);
		btnResumenPuntuaciones.setBorderPainted(false);
		btnResumenPuntuaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInt.setVisible(false);
				panelVersion.setVisible(false);
				panelAutores.setVisible(false);
				panelInfo.setVisible(false);
				panelPuntos.setVisible(true);
			}
		});
		btnResumenPuntuaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnResumenPuntuaciones
						.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/segundobtn/btn_resumen_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnResumenPuntuaciones
						.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_resumen_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnResumenPuntuaciones
						.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/tercerbtn/btn_resumen_pequeño.png")));
			}
		});
		btnResumenPuntuaciones
				.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_resumen_pequeño.png")));
		btnResumenPuntuaciones.setBackground(null);
		btnResumenPuntuaciones.setBounds(-9, 229, 343, 77);
		panel_botones.add(btnResumenPuntuaciones);

		// creamos un boton llamado btnAutores que muestra el panel de autores
		JButton btnAutores = new JButton("");
		btnAutores.setFocusPainted(false);
		btnAutores.setBorderPainted(false);
		btnAutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInt.setVisible(false);
				panelVersion.setVisible(false);
				panelAutores.setVisible(!panelAutores.isVisible());
			}
		});
		btnAutores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAutores
						.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/segundobtn/btn_autores_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnAutores.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_autores_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnAutores.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/tercerbtn/btn_autores_pequeño.png")));
			}
		});
		btnAutores.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_autores_pequeño.png")));
		btnAutores.setBackground(null);
		btnAutores.setBounds(-9, 306, 343, 77);
		panel_botones.add(btnAutores);

		// creamos un boton llamado btnVersion que muestra la version en la que se encuentra el juego
		JButton btnVersion = new JButton("");
		btnVersion.setFocusPainted(false);
		btnVersion.setBorderPainted(false);
		btnVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInt.setVisible(false);
				panelAutores.setVisible(false);
				panelVersion.setVisible(!panelVersion.isVisible());
			}
		});
		btnVersion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnVersion
						.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/segundobtn/btn_version_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnVersion.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_version_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnVersion.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/tercerbtn/btn_version_pequeño.png")));
			}
		});
		btnVersion.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_version_pequeño.png")));
		btnVersion.setBackground(null);
		btnVersion.setBounds(-9, 383, 343, 77);
		panel_botones.add(btnVersion);

		// creamos un boton llamado btnSalir que es para cerrar/salir del juego
		JButton btnSalir = new JButton("");
		btnSalir.setFocusPainted(false);
		btnSalir.setBorderPainted(false);
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSalir.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/segundobtn/btn_salida_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSalir.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_salida_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnSalir.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/tercerbtn/btn_salida_pequeño.png")));
				System.exit(0);
			}
		});
		btnSalir.setForeground(null);
		btnSalir.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/primerbtn/btn_salida_pequeño.png")));
		btnSalir.setBackground(null);
		btnSalir.setBounds(-9, 459, 343, 77);
		panel_botones.add(btnSalir);

		// creamos un jlabel que muestra la imagen del fondo (el mapa)
		JLabel LabelMapImage = new JLabel("");
		LabelMapImage.setIcon(new ImageIcon(MenuInterfaz.class.getResource("/image/mapamenu_pequeño.png")));
		LabelMapImage.setBounds(0, 0, 1175, 549);
		panel_general.add(LabelMapImage);
	}
}
