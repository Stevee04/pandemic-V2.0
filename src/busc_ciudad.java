import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class busc_ciudad {

	static ArrayList<ciudad_infectada> CiudadInfectada = new ArrayList<>();;
	static String[] PartesFrase;
	static String[] CiuInf;

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
				e.setInfeccion(infeccion_actual + 1);
				System.out.println(e);

				if (j < a.length) {
					i = CiudadInfectada.size();
				}
			}
		}

	}
	
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
			numero = (int) (Math.random() * 50) + 1;

			a[i] = numero;
		}

		for (int i = 0; i < InRonda; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("\n");

		return a;
	}

}
