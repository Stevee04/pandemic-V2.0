import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class btnCIU extends JPanel {

	Play p = new Play();

	public btnCIU(int NumBtn) {
		switch (NumBtn) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			break;
		case 17:
			break;
		case 18:
			break;
		case 19:
			break;
		case 20:
			break;
		case 21:
			break;
		case 22:
			break;
		case 23:
			break;
		case 24:
			break;
		case 25:
			break;
		case 26:
			break;
		case 27:
			break;
		case 28:
			break;
		case 29:
			break;
		case 30:
			break;
		case 31:
			break;
		case 32:
			break;
		case 33:
			break;
		case 34:
			break;
		case 35:
			break;
		case 36:
			break;
		case 37:
			break;
		case 38:
			break;
		case 39:
			break;
		case 40:
			break;
		case 41:
			break;
		case 42:
			break;
		case 43:
			break;
		case 44:
			break;
		case 45:
			break;
		case 46:
			break;
		case 47:
			break;
		case 48:
			break;
		case 49:
			break;
		case 50:
			break;
		}

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JPanel panel_ciudades = new JPanel();
		panel_ciudades.setOpaque(false);
		panel_ciudades.setForeground(null);
		panel_ciudades.setBackground(null);
		panel_ciudades.setBounds(363, 4, 872, 561);
		// panel_general.add(panel_ciudades);
		panel_ciudades.setLayout(null);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-4, 0, 876, 561);
		panel_ciudades.add(lblNewLabel);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JButton btnCiu1 = new JButton("");
		/*
		 * btn[0] = new JButton(""); btn[0].setVisible(false);
		 * btn[0].setBorderPainted(false); btn[0].setBackground(new Color(0, 0, 0));
		 * btn[0].setOpaque(false); btn[0].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[0].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[0].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[0].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[0].setBounds(66, 94, 29, 29); panel_ciudades.add(btn[0]);
		 * 
		 * btn[1] = new JButton(""); btn[1].setVisible(false);
		 * btn[1].setBorderPainted(false); btn[1].setBackground(new Color(0, 0, 0));
		 * btn[1].setOpaque(false); btn[1].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[1].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[1].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[1].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[1].setBounds(164, 98, 29, 29); panel_ciudades.add(btn[1]);
		 * 
		 * btn[2] = new JButton(""); btn[2].setVisible(true);
		 * btn[2].setBorderPainted(false); btn[2].setBackground(new Color(0, 0, 0));
		 * btn[2].setOpaque(false); btn[2].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[2].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[2].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[2].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[2].setBounds(143, 142, 29, 29); panel_ciudades.add(btn[2]);
		 * 
		 * btn[3] = new JButton(""); btn[3].setVisible(true);
		 * btn[3].setBorderPainted(false); btn[3].setBackground(new Color(0, 0, 0));
		 * btn[3].setOpaque(false); btn[3].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[3].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[3].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[3].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[3].setBounds(79, 226, 29, 29); panel_ciudades.add(btn[3]);
		 * 
		 * btn[4] = new JButton(""); btn[4].setVisible(false);
		 * btn[4].setBorderPainted(false); btn[4].setBackground(new Color(0, 0, 0));
		 * btn[4].setOpaque(false); btn[4].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[4].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[4].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[4].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[4].setBounds(199, 131, 29, 29); panel_ciudades.add(btn[4]);
		 * 
		 * btn[5] = new JButton(""); btn[5].setVisible(false);
		 * btn[5].setBorderPainted(false); btn[5].setBackground(new Color(0, 0, 0));
		 * btn[5].setOpaque(false); btn[5].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[5].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[5].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[5].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[5].setBounds(232, 94, 29, 29); panel_ciudades.add(btn[5]);
		 * 
		 * btn[6] = new JButton(""); btn[6].setVisible(false);
		 * btn[6].setBorderPainted(false); btn[6].setBackground(new Color(0, 0, 0));
		 * btn[6].setOpaque(false); btn[6].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[6].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[6].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[6].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[6].setBounds(245, 163, 29, 29); panel_ciudades.add(btn[6]);
		 * 
		 * btn[7] = new JButton(""); btn[7].setVisible(false);
		 * btn[7].setBorderPainted(false); btn[7].setBackground(new Color(0, 0, 0));
		 * btn[7].setOpaque(false); btn[7].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[7].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[7].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[7].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[7].setBounds(137, 277, 29, 29); panel_ciudades.add(btn[7]);
		 * 
		 * btn[8] = new JButton(""); btn[8].setVisible(false);
		 * btn[8].setBorderPainted(false); btn[8].setBackground(new Color(0, 0, 0));
		 * btn[8].setOpaque(false); btn[8].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[8].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[8].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[8].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[8].setBounds(110, 401, 29, 29); panel_ciudades.add(btn[8]);
		 * 
		 * btn[9] = new JButton(""); btn[9].setVisible(false);
		 * btn[9].setBorderPainted(false); btn[9].setBackground(new Color(0, 0, 0));
		 * btn[9].setOpaque(false); btn[9].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[9].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[9].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[9].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[9].setBounds(141, 441, 29, 29); panel_ciudades.add(btn[9]);
		 * 
		 * btn[10] = new JButton(""); btn[10].setVisible(false);
		 * btn[10].setBorderPainted(false); btn[10].setBackground(new Color(0, 0, 0));
		 * btn[10].setOpaque(false); btn[10].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[10].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[10].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[10].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[10].setBounds(208, 400, 29, 29); panel_ciudades.add(btn[10]);
		 * 
		 * btn[11] = new JButton(""); btn[11].setVisible(false);
		 * btn[11].setBorderPainted(false); btn[11].setBackground(new Color(0, 0, 0));
		 * btn[11].setOpaque(false); btn[11].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[11].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[11].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[11].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[11].setBounds(300, 431, 29, 29); panel_ciudades.add(btn[11]);
		 * 
		 * btn[12] = new JButton(""); btn[12].setVisible(false);
		 * btn[12].setBorderPainted(false); btn[12].setBackground(new Color(0, 0, 0));
		 * btn[12].setOpaque(false); btn[12].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[12].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[12].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[12].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[12].setBounds(311, 374, 29, 29); panel_ciudades.add(btn[12]);
		 * 
		 * btn[13] = new JButton(""); btn[13].setVisible(false);
		 * btn[13].setBorderPainted(false); btn[13].setBackground(new Color(0, 0, 0));
		 * btn[13].setOpaque(false); btn[13].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[13].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[13].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[13].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[13].setBounds(389, 289, 29, 29); panel_ciudades.add(btn[13]);
		 * 
		 * btn[14] = new JButton(""); btn[14].setVisible(false);
		 * btn[14].setBorderPainted(false); btn[14].setBackground(new Color(0, 0, 0));
		 * btn[14].setOpaque(false); btn[14].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[14].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[14].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[14].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[14].setBounds(476, 485, 29, 29); panel_ciudades.add(btn[14]);
		 * 
		 * btn[15] = new JButton(""); btn[15].setVisible(false);
		 * btn[15].setBorderPainted(false); btn[15].setBackground(new Color(0, 0, 0));
		 * btn[15].setOpaque(false); btn[15].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[15].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[15].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[15].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[15].setBounds(515, 505, 29, 29); panel_ciudades.add(btn[15]);
		 * 
		 * btn[16] = new JButton(""); btn[16].setVisible(false);
		 * btn[16].setBorderPainted(false); btn[16].setBackground(new Color(0, 0, 0));
		 * btn[16].setOpaque(false); btn[16].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[16].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[16].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[16].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[16].setBounds(531, 435, 29, 29); panel_ciudades.add(btn[16]);
		 * 
		 * btn[17] = new JButton(""); btn[17].setVisible(false);
		 * btn[17].setBorderPainted(false); btn[17].setBackground(new Color(0, 0, 0));
		 * btn[17].setOpaque(false); btn[17].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[17].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[17].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[17].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[17].setBounds(721, 506, 29, 29); panel_ciudades.add(btn[17]);
		 * 
		 * btn[18] = new JButton(""); btn[18].setVisible(false);
		 * btn[18].setBorderPainted(false); btn[18].setBackground(new Color(0, 0, 0));
		 * btn[18].setOpaque(false); btn[18].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[18].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[18].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[18].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[18].setBounds(658, 471, 29, 29); panel_ciudades.add(btn[18]);
		 * 
		 * btn[19] = new JButton(""); btn[19].setVisible(false);
		 * btn[19].setBorderPainted(false); btn[19].setBackground(new Color(0, 0, 0));
		 * btn[19].setOpaque(false); btn[19].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[19].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[19].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[19].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[19].setBounds(761, 478, 29, 29); panel_ciudades.add(btn[19]);
		 * 
		 * btn[20] = new JButton(""); btn[20].setVisible(false);
		 * btn[20].setBorderPainted(false); btn[20].setBackground(new Color(0, 0, 0));
		 * btn[20].setOpaque(false); btn[20].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[20].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[20].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[20].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[20].setBounds(790, 444, 29, 29); panel_ciudades.add(btn[20]);
		 * 
		 * btn[21] = new JButton(""); btn[21].setVisible(false);
		 * btn[21].setBorderPainted(false); btn[21].setBackground(new Color(0, 0, 0));
		 * btn[21].setOpaque(false); btn[21].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[21].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[21].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[21].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[21].setBounds(708, 429, 29, 29); panel_ciudades.add(btn[21]);
		 * 
		 * btn[22] = new JButton(""); btn[22].setVisible(false);
		 * btn[22].setBorderPainted(false); btn[22].setBackground(new Color(0, 0, 0));
		 * btn[22].setOpaque(false); btn[22].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[22].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[22].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[22].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[22].setBounds(717, 384, 29, 29); panel_ciudades.add(btn[22]);
		 * 
		 * btn[23] = new JButton(""); btn[23].setVisible(false);
		 * btn[23].setBorderPainted(false); btn[23].setBackground(new Color(0, 0, 0));
		 * btn[23].setOpaque(false); btn[23].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[23].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[23].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[23].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[23].setBounds(622, 392, 29, 29); panel_ciudades.add(btn[23]);
		 * 
		 * btn[24] = new JButton(""); btn[24].setVisible(false);
		 * btn[24].setBorderPainted(false); btn[24].setBackground(new Color(0, 0, 0));
		 * btn[24].setOpaque(false); btn[24].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[24].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[24].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[24].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[24].setBounds(669, 377, 29, 29); panel_ciudades.add(btn[24]);
		 * 
		 * btn[25] = new JButton(""); btn[25].setVisible(false);
		 * btn[25].setBorderPainted(false); btn[25].setBackground(new Color(0, 0, 0));
		 * btn[25].setOpaque(false); btn[25].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[25].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[25].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[25].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[25].setBounds(796, 348, 29, 29); panel_ciudades.add(btn[25]);
		 * 
		 * btn[26] = new JButton(""); btn[26].setVisible(false);
		 * btn[26].setBorderPainted(false); btn[26].setBackground(new Color(0, 0, 0));
		 * btn[26].setOpaque(false); btn[26].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[26].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[26].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[26].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[26].setBounds(691, 338, 29, 29); panel_ciudades.add(btn[26]);
		 * 
		 * btn[27] = new JButton(""); btn[27].setVisible(false);
		 * btn[27].setBorderPainted(false); btn[27].setBackground(new Color(0, 0, 0));
		 * btn[27].setOpaque(false); btn[27].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[27].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[27].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[27].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[27].setBounds(528, 327, 29, 29); panel_ciudades.add(btn[27]);
		 * 
		 * btn[28] = new JButton(""); btn[28].setVisible(false);
		 * btn[28].setBorderPainted(false); btn[28].setBackground(new Color(0, 0, 0));
		 * btn[28].setOpaque(false); btn[28].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[28].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[28].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[28].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[28].setBounds(559, 308, 29, 29); panel_ciudades.add(btn[28]);
		 * 
		 * btn[29] = new JButton(""); btn[29].setVisible(false);
		 * btn[29].setBorderPainted(false); btn[29].setBackground(new Color(0, 0, 0));
		 * btn[29].setOpaque(false); btn[29].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[29].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[29].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[29].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[29].setBounds(735, 236, 29, 29); panel_ciudades.add(btn[29]);
		 * 
		 * btn[30] = new JButton(""); btn[30].setVisible(false);
		 * btn[30].setBorderPainted(false); btn[30].setBackground(new Color(0, 0, 0));
		 * btn[30].setOpaque(false); btn[30].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[30].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[30].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[30].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[30].setBounds(767, 211, 29, 29); panel_ciudades.add(btn[30]);
		 * 
		 * btn[31] = new JButton(""); btn[31].setVisible(false);
		 * btn[31].setBorderPainted(false); btn[31].setBackground(new Color(0, 0, 0));
		 * btn[31].setOpaque(false); btn[31].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[31].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[31].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[31].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[31].setBounds(779, 106, 29, 29); panel_ciudades.add(btn[31]);
		 * 
		 * btn[32] = new JButton(""); btn[32].setVisible(false);
		 * btn[32].setBorderPainted(false); btn[32].setBackground(new Color(0, 0, 0));
		 * btn[32].setOpaque(false); btn[32].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[32].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[32].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[32].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[32].setBounds(794, 39, 29, 29); panel_ciudades.add(btn[32]);
		 * 
		 * btn[33] = new JButton(""); btn[33].setVisible(false);
		 * btn[33].setBorderPainted(false); btn[33].setBackground(new Color(0, 0, 0));
		 * btn[33].setOpaque(false); btn[33].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[33].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[33].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[33].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[33].setBounds(723, 46, 29, 29); panel_ciudades.add(btn[33]);
		 * 
		 * btn[34] = new JButton(""); btn[34].setVisible(false);
		 * btn[34].setBorderPainted(false); btn[34].setBackground(new Color(0, 0, 0));
		 * btn[34].setOpaque(false); btn[34].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[34].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[34].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[34].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[34].setBounds(719, 151, 29, 29); panel_ciudades.add(btn[34]);
		 * 
		 * btn[35] = new JButton(""); btn[35].setVisible(false);
		 * btn[35].setBorderPainted(false); btn[35].setBackground(new Color(0, 0, 0));
		 * btn[35].setOpaque(false); btn[35].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[35].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[35].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[35].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[35].setBounds(704, 106, 29, 29); panel_ciudades.add(btn[35]);
		 * 
		 * btn[36] = new JButton(""); btn[36].setVisible(false);
		 * btn[36].setBorderPainted(false); btn[36].setBackground(new Color(0, 0, 0));
		 * btn[36].setOpaque(false); btn[36].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[36].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[36].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[36].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[36].setBounds(658, 135, 29, 29); panel_ciudades.add(btn[36]);
		 * 
		 * btn[37] = new JButton(""); btn[37].setVisible(false);
		 * btn[37].setBorderPainted(false); btn[37].setBackground(new Color(0, 0, 0));
		 * btn[37].setOpaque(false); btn[37].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[37].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[37].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[37].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[37].setBounds(597, 95, 29, 29); panel_ciudades.add(btn[37]);
		 * 
		 * btn[38] = new JButton(""); btn[38].setVisible(false);
		 * btn[38].setBorderPainted(false); btn[38].setBackground(new Color(0, 0, 0));
		 * btn[38].setOpaque(false); btn[38].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[38].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[38].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[38].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[38].setBounds(597, 156, 29, 29); panel_ciudades.add(btn[38]);
		 * 
		 * btn[39] = new JButton(""); btn[39].setVisible(false);
		 * btn[39].setBorderPainted(false); btn[39].setBackground(new Color(0, 0, 0));
		 * btn[39].setOpaque(false); btn[39].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[39].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[39].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[39].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[39].setBounds(642, 201, 29, 29); panel_ciudades.add(btn[39]);
		 * 
		 * btn[40] = new JButton(""); btn[40].setVisible(false);
		 * btn[40].setBorderPainted(false); btn[40].setBackground(new Color(0, 0, 0));
		 * btn[40].setOpaque(false); btn[40].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[40].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[40].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[40].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[40].setBounds(607, 223, 29, 29); panel_ciudades.add(btn[40]);
		 * 
		 * btn[41] = new JButton(""); btn[41].setVisible(false);
		 * btn[41].setBorderPainted(false); btn[41].setBackground(new Color(0, 0, 0));
		 * btn[41].setOpaque(false); btn[41].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[41].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[41].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[41].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[41].setBounds(503, 246, 29, 29); panel_ciudades.add(btn[41]);
		 * 
		 * btn[42] = new JButton(""); btn[42].setVisible(false);
		 * btn[42].setBorderPainted(false); btn[42].setBackground(new Color(0, 0, 0));
		 * btn[42].setOpaque(false); btn[42].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[42].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[42].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[42].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[42].setBounds(511, 109, 29, 29); panel_ciudades.add(btn[42]);
		 * 
		 * btn[43] = new JButton(""); btn[43].setVisible(false);
		 * btn[43].setBorderPainted(false); btn[43].setBackground(new Color(0, 0, 0));
		 * btn[43].setOpaque(false); btn[43].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[43].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[43].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[43].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[43].setBounds(421, 239, 29, 29); panel_ciudades.add(btn[43]);
		 * 
		 * btn[44] = new JButton(""); btn[44].setVisible(false);
		 * btn[44].setBorderPainted(false); btn[44].setBackground(new Color(0, 0, 0));
		 * btn[44].setOpaque(false); btn[44].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[44].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[44].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[44].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[44].setBounds(359, 213, 29, 29); panel_ciudades.add(btn[44]);
		 * 
		 * btn[45] = new JButton(""); btn[45].setVisible(false);
		 * btn[45].setBorderPainted(false); btn[45].setBackground(new Color(0, 0, 0));
		 * btn[45].setOpaque(false); btn[45].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[45].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[45].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[45].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[45].setBounds(416, 173, 29, 29); panel_ciudades.add(btn[45]);
		 * 
		 * btn[46] = new JButton(""); btn[46].setVisible(false);
		 * btn[46].setBorderPainted(false); btn[46].setBackground(new Color(0, 0, 0));
		 * btn[46].setOpaque(false); btn[46].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[46].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[46].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[46].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[46].setBounds(349, 165, 29, 29); panel_ciudades.add(btn[46]);
		 * 
		 * btn[47] = new JButton(""); btn[47].setVisible(false);
		 * btn[47].setBorderPainted(false); btn[47].setBackground(new Color(0, 0, 0));
		 * btn[47].setOpaque(false); btn[47].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[47].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[47].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[47].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[47].setBounds(411, 123, 29, 29); panel_ciudades.add(btn[47]);
		 * 
		 * btn[48] = new JButton(""); btn[48].setVisible(false);
		 * btn[48].setBorderPainted(false); btn[48].setBackground(new Color(0, 0, 0));
		 * btn[48].setOpaque(false); btn[48].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[48].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[48].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[48].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[48].setBounds(497, 65, 29, 29); panel_ciudades.add(btn[48]);
		 * 
		 * btn[49] = new JButton(""); btn[49].setVisible(false);
		 * btn[49].setBorderPainted(false); btn[49].setBackground(new Color(0, 0, 0));
		 * btn[49].setOpaque(false); btn[49].addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseEntered(MouseEvent e) { if (btciu == true) {
		 * btn[49].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/cruzCirculo.png"))); } }
		 * 
		 * @Override public void mouseExited(MouseEvent e) { if (btciu == true) {
		 * btn[49].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png"))); } } });
		 * btn[49].setIcon(new
		 * ImageIcon(Play.class.getResource("/ciudades/circulo2.png")));
		 * btn[49].setBounds(337, 58, 29, 29); panel_ciudades.add(btn[49]);
		 * 
		 * }
		 */

	}

	/*
	 * btnCiu1.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { // bc.RestarInfCiu(1);
	 * btnCiu1.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu2.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(2);
	 * btnCiu2.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu3.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(3);
	 * btnCiu3.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu4.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(4);
	 * btnCiu4.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu5.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(5);
	 * btnCiu5.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu6.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(6);
	 * btnCiu6.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu7.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(7);
	 * btnCiu7.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu8.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(8);
	 * btnCiu8.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu9.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(9);
	 * btnCiu9.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu10.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(10);
	 * btnCiu10.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu11.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(11);
	 * btnCiu11.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu12.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(12);
	 * btnCiu12.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu13.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(13);
	 * btnCiu13.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu14.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(14);
	 * btnCiu14.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu15.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(15);
	 * btnCiu15.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu16.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(16);
	 * btnCiu16.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu17.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(17);
	 * btnCiu17.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu18.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(18);
	 * btnCiu18.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu19.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(19);
	 * btnCiu19.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu20.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(20);
	 * btnCiu20.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu21.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(21);
	 * btnCiu21.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu22.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(22);
	 * btnCiu22.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu23.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(23);
	 * btnCiu23.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu24.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(24);
	 * btnCiu24.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu25.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(25);
	 * btnCiu25.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu26.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(26);
	 * btnCiu26.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } });
	 * 
	 * btnCiu27.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(27);
	 * btnCiu27.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu28.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(28);
	 * btnCiu28.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu29.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(29);
	 * btnCiu29.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu30.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(30);
	 * btnCiu30.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu31.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(31);
	 * btnCiu31.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu32.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(32);
	 * btnCiu32.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu33.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(33);
	 * btnCiu33.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu34.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(34);
	 * btnCiu34.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu35.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(35);
	 * btnCiu35.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu36.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(36);
	 * btnCiu36.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu37.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(37);
	 * btnCiu37.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu38.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(38);
	 * btnCiu38.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu39.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(39);
	 * btnCiu39.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu40.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(40);
	 * btnCiu40.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu41.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(41);
	 * btnCiu41.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu42.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(42);
	 * btnCiu42.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu43.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(43);
	 * btnCiu43.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu44.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(44);
	 * btnCiu44.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu45.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(45);
	 * btnCiu45.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu46.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(46);
	 * btnCiu46.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu47.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(47);
	 * btnCiu47.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu48.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(48);
	 * btnCiu48.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu49.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(49);
	 * btnCiu49.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } }); btnCiu50.addMouseListener(new MouseAdapter() {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { bc.RestarInfCiu(50);
	 * btnCiu50.setEnabled(false); cura.setVisible(false); Action1.setVisible(true);
	 * } });
	 */

}
