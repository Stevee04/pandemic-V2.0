import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;

import archivos.P_Ciudades;
import archivos.P_Virus;

public class main {

	public static void main(String[] args) {
		
		// hace referencia a las clases
				P_Ciudades ciudades = new P_Ciudades();
				P_Virus virus = new P_Virus();
				
				
				// ejecuta GenerarCiudades de la clase ciudades
				ciudades.GenerarCiudades();
				
				// ejecuta VirusCiudades de la clase virus
				virus.VirusCiudades();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					Cursor cursor = toolkit.createCustomCursor(toolkit.getImage("src/mouseimg/char.png"), new Point(0, 0), "Logo");
					MenuInterfaz frame = new MenuInterfaz();
					frame.setCursor(cursor);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

