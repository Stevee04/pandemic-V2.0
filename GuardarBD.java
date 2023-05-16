
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GuardarBD {
	static String apodoJugador;
	public static int dificultad;
	public static int rondas;
	public static String resultado = fin.resultado();
	// variables de conexión
	private static final String USER = "DAW_PNDC22_23_EDOR";
	private static final String PWD = "EO123";
	// Si estáis desde casa, la url será oracle.ilerna.com y no 192.168.3.26
	private static final String URL = "jdbc:oracle:thin:@oracle.ilerna.com:1521:xe";

	public static void baseDeDatos() {
		// variable con la conexión
		Connection con = conectarBaseDatos();

		ArrayList<Vacunas> listaVacunas = new ArrayList<>();

		// ?
		if (con != null) {
			// Funciones programadas
			System.out.println(" Guardar vacunas en arrayList");
			guardarVacunas(listaVacunas);

			// ?
			System.out.println("Tamaño de listaVacunas: " + listaVacunas.size());
//			System.out.println(" Insert de jugador");
//			insertarJugador(con);

			System.out.println(" Insert de partida");
			insertarPartida(con, listaVacunas, busc_ciudad.CiudadInfectada);

//			System.out.println(" Update de los puntos del jugador");
//			insertarPuntosJugador();

			// si no se puede cerrar la conexión muestra el error
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// connecta con la base de datos
	public static Connection conectarBaseDatos() {
		// variables
		Connection con = null;

		System.out.println(" Intentando conectarse a la base de datos");

		// - - - - - - - - - - - - - - - - - -
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL, USER, PWD);
			System.out.println(" Conectados a la base de datos");
		} catch (ClassNotFoundException e) {
			System.out.println(" No se ha encontrado el driver " + e);
		} catch (SQLException e) {
			System.out.println(" Error en las credenciales o en la URL " + e);
		}
		// - - - - - - - - - - - - - - - - - -

		System.out.println("Conectados a la base de datos");

		return con;
	}

	public static void insertarJugador(Connection con) {
		// variables del programa
		boolean jugadorEncontrado = false;
		String apodoParaComprobar = apodoJugador;
		String apodoRecojidoBD;

		do {
			System.out.println("Hace el select para saber el jugador");
			// realizamos un select y se guarda en la variable
			String comprobarApodo = "SELECT J.APODO FROM JUGADORES J";

			// pedimos datos
			System.out.print(" Introduce tu apodo de jugador: " + apodoParaComprobar);

			// - - - - - - - - - - - - - - - - - -
			try {
				System.out.println(" Entra en el try");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(comprobarApodo);

				if (rs.isBeforeFirst()) {
					System.out.println(" Entra en el bucle");
					while (rs.next()) {
						// recoje el valor
						apodoRecojidoBD = rs.getString("APODO");

						// comprobará si el usuario ya está introducido
						if (apodoRecojidoBD.equals(apodoParaComprobar)) {
							jugadorEncontrado = true;
							System.out.println(" El jugador ha sido encontrado");
						} else {
							jugadorEncontrado = false;
							System.out.println(" El jugador NO ha sido encontrado");
						}
					}
					System.out.println("Sale del try");
				}

			} catch (SQLException e) {
				System.out.println("Salta error");
				e.printStackTrace();
			}
			// - - - - - - - - - - - - - - - - - -
			System.out.println();
			System.out.println("finiquitado el error");

			// si el jugador es nuevo introduce al usuario
			if (jugadorEncontrado == false) {
				/*
				 * el valor de la ID siempre será 9, al insertar en la BD se modifica para que
				 * obtenga el NEXTVAL de jugadores y la puntuación pro defecto será 0
				 */
				String sql = "INSERT INTO JUGADORES VALUES('" + 1 + "', '" + apodoJugador + "', '" + 0 + "')";

				// - - - - - - - - - - - - - - - - - -
				try {
					Statement st = con.createStatement();
					st.execute(sql);

					System.out.println(" Persona registrada correctamente");
				} catch (SQLException e) {
					System.out.println(" Ha habido un error en el Insert " + e);
				}
				// - - - - - - - - - - - - - - - - - -
			} else {
				System.out.println(" El jugador ya esta introducido, repita el nombre.");
			}
			// si el jugador ya esta introducido repite el bucle
		} while (jugadorEncontrado == true);

	}

	private static void insertarPartida(Connection con, ArrayList<Vacunas> listaVacunas,
			ArrayList<ciudad_infectada> CiudadInfectada) {
		// hace el insert
		// realizamos un select y se guarda en la variable
		// String cojerIdJugador = "SELECT J.IDJUGADOR FROM JUGADORES J WHERE J.APODO =
		// apodoJugador";
		System.out.println(" Inserta partida pruebas");
		System.out.println(dificultad);
		System.out.println(rondas);
		System.out.println(resultado);
		System.out.println("Va pal insert");
		String sql = "INSERT INTO Partidas VALUES (autoidpartida.nextval, '" + apodoJugador + "', " + dificultad + ", "
				+ rondas + ", '" + resultado + "', vacunasPartida(";
		for (int i = 0; i < listaVacunas.size(); i++) {
			Vacunas vac = listaVacunas.get(i);
			sql += "vacunas(" + vac.getid_Vacunas() + ", '" + vac.getnombreVacuna() + "', "
					+ vac.getporcentajeRealizado() + ")";
			if (i < listaVacunas.size() - 1) {
				sql += ", ";
			}
		}
		sql += "), ciudadesPartida(";
		for (int e = 0; e < CiudadInfectada.size(); e++) {
			System.out.println("Ciudad numero " + e);
			ciudad_infectada ciu = CiudadInfectada.get(e);
			sql += "ciudades(" + ciu.getNumCiudad() + ", '" + ciu.getCiudad() + "', " + ciu.getInfeccion() + ", "
					+ ciu.getBrote() + ", '" + ciu.getVirus() + "')";
			if (e < CiudadInfectada.size() - 1) {
				sql += ", ";
			}
		}
		sql += "))";
		// - - - - - - - - - - - - - - - - - -
		try {
			Statement st = con.createStatement();
			System.out.println(sql);
			st.execute(sql);
			System.out.println(" Persona registrada correctamente");
		} catch (SQLException e) {
			System.out.println(" Ha habido un error en el Insert " + e);
		}
	}

	public static void guardarVacunas(ArrayList<Vacunas> listaVacunas) {
		int contVacunas = 0;
		VacunasPor VPor = new VacunasPor();
		System.out.println(" Entro en la funcion guardarVacunas");
		// if (contVacunas == 0) {
		for (int i = 0; i < 4; i++) {
			System.out.println(" Entro en el bucle de la funcion");
			System.out.println(i);
			if (i == 0) {
				// Poneos los datos al objeto
				Vacunas v = new Vacunas(1, "Alfa", VPor.Alfa);

				// Añadimos el objeto al Arraylist
				listaVacunas.add(v);
				System.out.println(" Vacuna añadida correctamente" + VPor.Alfa);
			}
			if (i == 1) {
				// Poneos los datos al objeto
				Vacunas v = new Vacunas(2, "Beta", VPor.Beta);

				// Añadimos el objeto al Arraylist
				listaVacunas.add(v);
				System.out.println(" Vacuna añadida correctamente" + VPor.Beta);
			}
			if (i == 2) {
				// Poneos los datos al objeto
				Vacunas v = new Vacunas(3, "Delta", VPor.Delta);

				// Añadimos el objeto al Arraylist
				listaVacunas.add(v);
				System.out.println(" Vacuna añadida correctamente" + VPor.Delta);
			}
			if (i == 3) {
				// Poneos los datos al objeto
				Vacunas v = new Vacunas(4, "Gama", VPor.Gama);

				// Añadimos el objeto al Arraylist
				listaVacunas.add(v);
				System.out.println(" Vacuna añadida correctamente" + VPor.Gama);
			}
			// }
		}
	}

	static void insertarPuntosJugador(Connection con) {
		int p = 100; // prueba
		// prueba
		System.out.print(" El usuario es: " + apodoJugador);

		String sql = "UPDATE JUGADORES SET PUNTOSREALIZADOS = " + p + " WHERE APODO = apodoJugador";

		// - - - - - - - - - - - - - - - - - -
		try {
			Statement st = con.createStatement();
			st.execute(sql);

			System.out.println(" Update de puntos echo correctamente");
		} catch (SQLException e) {
			System.out.println(" Ha habido un error en el update " + e);
		}
	}

}
