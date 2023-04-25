
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class virus {

	// ceramos las variables
	int CodigoEnfermedad = 0;
	String NombreEnfermedad = null;
	String ColorEnfermedad = null;
	static String Info = "C:/Users/oriol/Documents/GitHub/pruebas_pandemic/src/ciutats.txt";
	static String InfoVirus = "C:/Users/oriol/Documents/GitHub/pruebas_pandemic/src/ciudades-enefermedad.bin";
	String green = "\033[32m", red = "\033[31m", blue = "\033[34m", yellow = "\033[37m";
	int x = 0, y = 0;

	public void VirusCiudades() {

		// creamos las variables de VirusCiudades
		String frase = null;
		String[] PartesFrase = null;

		try {

			// abrimos fr,br y fw,bw para poder escribir y leer los archivos
			FileReader fr = new FileReader(Info);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(InfoVirus, true);
			BufferedWriter bw = new BufferedWriter(fw);

			do {

				// lee la linea del archivo
				frase = br.readLine();

				if (frase != null) {

					// separa la frase por partes
					PartesFrase = frase.split(";");

					// de la partes separadas coge el numero y depende de que numero escribe una
					// cosa o otra en el archivo
					switch (Integer.parseInt(PartesFrase[1])) {

					// si el numero es 0 escribe alfa despues del pueblo
					case 0:
						bw.write(PartesFrase[0] + ",Alfa");
						break;

					// si el numero es 1 escribe Beta despues del pueblo
					case 1:
						bw.write(PartesFrase[0] + ",Beta");
						break;

					// si el numero es 2 escribe Gama despues del pueblo
					case 2:
						bw.write(PartesFrase[0] + ",Gama");
						break;

					// si el numero es 3 escribe Delta despues del pueblo
					case 3:
						bw.write(PartesFrase[0] + ",Delta");
						break;
					}

					// saltamos de linea
					bw.newLine();

				}

			} while (frase != null);

			// ceramos todo
			fr.close();
			br.close();
			bw.close();

			// esta el cath para el caso que haya un error salte y diga cual es
		} catch (IOException e) {
			System.out.println(" Error E/S: " + e);
		}

	}

}
