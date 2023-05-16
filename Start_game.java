

public class Start_game {
	static int cont = 0;

	public static void Start(int Infeccion) {
		// TODO Auto-generated method stub

		busc_ciudad bc = new busc_ciudad();

		bc.SaveInfCiu(Infeccion);
		cont ++;
		System.out.println("Contador rondas: " + cont);
		GuardarBD.rondas = cont;
	}

	
	// pruebas
	public static void main(String[] args) {
		
		LeerParametros P = new LeerParametros();
		
		P.editar(3);
		Start_game.Start(P.CiuInfInicio);
	}
}
