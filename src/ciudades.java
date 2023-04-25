import java.io.*;
import java.text.DecimalFormat;

public class ciudades {

	// variables que guardan archivos
	String GuardarCiudades = "C:/Users/oriol/Documents/GitHub/pruebas_pandemic/src/ciudadesRedactadas.txt";
	String ciudades = "C:/Users/oriol/Documents/GitHub/pruebas_pandemic/src/ciutats.txt";

	// variables de importación
	DecimalFormat df = new DecimalFormat("#.00");

	// variables del programa
	String fraseLeida = null;
	String[] fraseEnPartes = null;
	String[] partesXY1 = null;
	String[] partesXY2 = null;
	String[] partesCiudades = null;
	double distanciatotal = 0;
	
	public void GenerarCiudades() {
		
		try {
			// variables ficheros
			FileReader fr = new FileReader(ciudades);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(GuardarCiudades, true);
			BufferedWriter bw = new BufferedWriter(fw);

			do {
				// lee línea
				fraseLeida = br.readLine();

				if (fraseLeida != null) {
					fraseEnPartes = fraseLeida.split(";");

					partesXY1 = fraseEnPartes[2].split(",");
					partesCiudades = fraseEnPartes[3].split(",");

					System.out.println("\n");
					System.out.println("La ciudad " + fraseEnPartes[0] + " esta en las cordenadas (" + fraseEnPartes[2]
							+ ") sus ciudades colindantes son: ");

					bw.write("La ciudad " + fraseEnPartes[0] + " esta en las cordenadas (" + fraseEnPartes[2]
							+ ") sus ciudades colindantes son: ");
					fw.flush();
					bw.flush();
					bw.newLine();

					for (int i = 0; i < partesCiudades.length; i++) {
						// coje las coordenadas de la función
						partesXY2 = cordenadas2(fr, br, i);
						distanciatotal = ClacularCor();
						System.out.println("• " + partesCiudades[i] + ", que esta a una distancia de "
								+ df.format(distanciatotal));

						bw.write("• " + partesCiudades[i] + ", que esta a una distancia de "
								+ df.format(distanciatotal));
						fw.flush();
						bw.flush();
						bw.newLine();
					}
					fw.flush();
					bw.flush();
					bw.newLine();
					
					// pruebas
					/*
					 * System.out.println("\n "); for (int i = 0; i < fraseEnPartes.length; i++) {
					 * System.out.println(fraseEnPartes[i]); } System.out.println(partesXY1[0] +
					 * " , " + partesXY1[1]); System.out.println(partesXY2[0] + " , " +
					 * partesXY2[1]); for (int i = 0; i < partesCiudades.length; i++) {
					 * System.out.println(partesCiudades[i] + " , "); }
					 */
				}
			} while (fraseLeida != null);


		} catch (IOException e) {
			System.out.println(" Error E/S: " + e);
		}
		
	}
	

	public long ClacularCor() {
		// variables del programa
		double ciudad1PosX = Integer.parseInt(partesXY1[0]);
		double ciudad1PosY = Integer.parseInt(partesXY1[1]);
		double ciudad2PosX = Integer.parseInt(partesXY2[0]);
		double ciudad2PosY = Integer.parseInt(partesXY2[1]);
		long distancia = 0;

		distancia = (long) Math.sqrt(Math.pow(ciudad2PosX - ciudad1PosX, 2) + Math.pow(ciudad2PosY - ciudad1PosY, 2));

		// Prueba

		// System.out.println("La distancia es de " + df.format(distancia) + "
		// pixeles.");

		return distancia;
	}
	
	public String[] cordenadas2(FileReader fr, BufferedReader br, int i) {

		// Variables

		String[] partes_frase = null;
		String linea = null;

		try {

			// se inicializa para que empieze a leer el archivo desde 0
			fr = new FileReader(ciudades);
			br = new BufferedReader(fr);

			do {

				// lee la linea
				linea = br.readLine();

				// si el pueblo/ciudad es el mismo que el conyucente devuelve las cordenadas
				if (linea != null) {
					partes_frase = linea.split(";");
					if (partes_frase[0].equals(partesCiudades[i])) {
						partesXY2 = partes_frase[2].split(",");
					}
				}

			} while (linea != null);

			// cierra el archivo
			fr.close();
			br.close();

		} catch (IOException e) {
			System.out.println(" Error E/S: " + e);
		}

		// devuelve las cordenadas
		return partesXY2;
	}

}