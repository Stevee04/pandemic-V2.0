
public class fin {

	VacunasPor vacuna = new VacunasPor();
	busc_ciudad bc = new busc_ciudad();
	LeerParametros lp = new LeerParametros();

	public boolean fin() {

		boolean fi = false;
		
		//System.out.println(vacuna.getALFA() + ", " + vacuna.getBETA() + ", " + vacuna.getDELTA() + ", " + vacuna.getGAMA());
		
		if (Puntuaciaons_Pandemic.getVacunas() == 4) {
			System.out.println("Has ganado");
			fi = true;
		}

		if (bc.contarInfecciones() > lp.EnfActDerrota || bc.contarBrotes() > lp.NumBroDerrota) {
			System.out.println("Has Perdido pringado");
			fi = true;		
		}

		return fi;

	}
	
	public static String resultado() {
		
		String resu = "T";
		
		//GuardarBD.resultado = resu;
		
		return resu;
	}

}
