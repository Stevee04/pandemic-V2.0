
public class Puntuaciaons_Pandemic {

	public static void main(String[] args) {
		// algunos de los valores son para hacer pruebas, luego se tendrán que modificas
		int totalPuntos = 0; // puntos totales para el ranking
		int puntosBase = 300; // puntos base del juego
		int vacunasCompletadas = 4; // cuantas vacunas se han realizado en la partida
		String tipoPartida = "D"; // tipo de partida que se ha jugado ( "F", "M", "D")

		int contarEnfermedades = 10; // cuantas enfermedades han quedado tras perder o ganar la partida
		int contarBrotes = 4; // ciuantos brotes han quedado tras ganar o perder la partida
		int puntosPerdidos = 0; // total de putos perdidos

		boolean victoria = true; // es victoria o derrota
		int puntosGanados = 0; // total de puntos ganados

		puntosPerdidos = calculoPuntosPerdidos(contarBrotes, contarEnfermedades); // calcula los puntos perdidos
		puntosGanados = calculoPuntosGanados(victoria, puntosBase, vacunasCompletadas, tipoPartida); // calcula los
																										// puntos
																										// ganados

		// System.out.println(puntosPerdidos);
		// System.out.println(puntosGanados);

		totalPuntos = puntosGanados - puntosPerdidos; // total de puntos calculados para el ranking

		System.out.println(totalPuntos); // testeo de resultados
	}

	// calcula los puntos perdidos al final de la partida
	public static int calculoPuntosPerdidos(int contarBrotes, int contarEnfermedades) {
		int puntosPerdidos = 0;

		puntosPerdidos = (contarBrotes * 50) + (contarEnfermedades * 10);

		return puntosPerdidos;
	}

	// calcula los puntos ganados al final de la partida
	public static int calculoPuntosGanados(boolean victoria, int puntosBase, int vacunasCompletadas,
			String tipoPartida) {
		int partidaFacil = 100;
		int partidaMedio = 200;
		int partidaDificil = 300;

		int puntosGanados = 0;

		if (victoria == true) {
			if (tipoPartida == "D") {
				puntosGanados = partidaDificil + 400 + (vacunasCompletadas * 100);
			} else if (tipoPartida == "M") {
				puntosGanados = partidaMedio + 400 + (vacunasCompletadas * 100);
			} else {
				puntosGanados = partidaFacil + 400 + (vacunasCompletadas * 100);
			}

		} else {
			puntosGanados = 0;
		}

		return puntosGanados;
	}
}
