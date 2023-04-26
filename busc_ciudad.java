import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class busc_ciudad {

	static String ciudades = "ciutats.txt";
	static String VirusCiudades = "ciudades_enefermedad.bin";
	static ArrayList<ciudad_infectada> CiudadInfectada = new ArrayList<>();;
	static String[] PartesFrase;
	static String[] CiuInf;
	static String[] partesCiudades = null;
	static String NPueblo = "";
	static int[] VirusPueblo = {0,0,0,0};

	public void SaveInfCiu(int InRonda) {
		int infeccion_actual = 0;

		CiuInf = new String[InRonda];

		GuardarArray();

		int[] a = new int[InRonda];

		a = InicioRonda(InRonda);

		for (int i = 0; i < CiudadInfectada.size(); i++) {
			for (int j = 0; j < a.length; j++) {
				ciudad_infectada e = CiudadInfectada.get(a[j]);
				infeccion_actual = e.getInfeccion();
				if (infeccion_actual == 3) {
					NPueblo = e.getCiudad();
					InfeccionColindantes();
				} else {
					e.setInfeccion(infeccion_actual + 1);
					switch(e.getVirus()) {
					case "Alfa":
						VirusPueblo[0] = 1;
						break;
					case "Beta":
						VirusPueblo[1] = 1;
						break;
					case "Delta":
						VirusPueblo[2] = 1;
						break;
					case "Gama":
						VirusPueblo[3] = 1;
						break;
					}

					System.out.println(CiudadInfectada.get(a[j]));
				}
				if (j < a.length) {
					i = CiudadInfectada.size();
				}
			}
		}
	}

	public static void InfeccionColindantes() {

		GuardarColindantes();

		for (int i = 0; i < CiudadInfectada.size(); i++) {

			if (CiudadInfectada.equals(NPueblo)) {
				for (int j = 0; j < CiudadInfectada.size(); j++) {
					for (int j2 = 0; j2 < partesCiudades.length; j2++) {
							if (CiudadInfectada.get(j).equals(partesCiudades[j2])) {
			                   for (int k = 0; k < CiuInf.length; k++) {
								
							}
						}
						
					}
				}
			}
		}
	}

	public static void GuardarColindantes() {

		String fraseLeida = null;
		String[] fraseEnPartes = null;

		try {
			// variables ficheros
			FileReader fr = new FileReader(ciudades);
			BufferedReader br = new BufferedReader(fr);

			do {
				// lee línea
				fraseLeida = br.readLine();

				if (fraseLeida != null) {
					fraseEnPartes = fraseLeida.split(";");

					// busca el pueblo y escribe las colindantes cuando lo encuentra
					if (fraseEnPartes[0].equals(NPueblo)) {
						partesCiudades = fraseEnPartes[3].split(",");
					}
				}

			} while (fraseLeida != null);

		} catch (IOException e) {
			System.out.println(" Error E/S: " + e);
		}
	}

	// coge las infecciones que hay en una ciudad y las va sumando con las demas en
	// el contador

	public static int contarInfecciones() {
		int cont = 0;

		for (int i = 0; i < CiudadInfectada.size(); i++) {

			ciudad_infectada c = CiudadInfectada.get(i);

			if (c.getInfeccion() >= 1) {
				cont += c.getInfeccion();
			}

		}

		return cont;
	}
	
	public static int contarBrotes() {
		int cont = 0;

		for (int i = 0; i < CiudadInfectada.size(); i++) {

			ciudad_infectada c = CiudadInfectada.get(i);

			if (c.getInfeccion() >= 1) {
				cont += c.getBrote();
			}

		}

		return cont;
	}
	

	public void GuardarArray() {

		// ceramos las variables
		// CiudadInfectada = new String[50][4];

		boolean capullo = false;
		String Info = "ciudades_enefermedad.bin";
		int x = 0, y = 0;

		// creamos las variables de VirusCiudades
		String frase = null;
		PartesFrase = new String[2];

		try {

			// abrimos fr,br y fw,bw para poder escribir y leer los archivos
			FileReader fr = new FileReader(Info);
			BufferedReader br = new BufferedReader(fr);

			for (int i = 0; i < 50; i++) {

				// lee la linea del archivo
				frase = br.readLine();

				if (frase != null) {
					// separa la frase por partes
					PartesFrase = frase.split(",");

				}
				if (frase == null) {
					capullo = true;
				}

				ciudad_infectada InfectarCiudad = new ciudad_infectada(PartesFrase[0], 0, 0, PartesFrase[1]);

				CiudadInfectada.add(i, InfectarCiudad);

			}

			for (ciudad_infectada e : CiudadInfectada) {

				System.out.println(e.toString());

			}

		} catch (IOException e) {
			System.out.println(" Error E/S: " + e);
		}
	}

	public static int[] InicioRonda(int InRonda) {

		int[] a = new int[InRonda];
		int numero = 0;

		for (int i = 0; i < a.length; i++) {
			numero = (int) (Math.random() * 50);

			a[i] = numero;
		}

		for (int i = 0; i < InRonda; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("\n");

		return a;
	}

}
