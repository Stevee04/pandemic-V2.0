
public class fin {

	VacunasPor vacuna = new VacunasPor();
	busc_ciudad bc = new busc_ciudad();
	LeerParametros lp = new LeerParametros();

	public int fin() {

		int fi = 0;
		
		//System.out.println(vacuna.getALFA() + ", " + vacuna.getBETA() + ", " + vacuna.getDELTA() + ", " + vacuna.getGAMA());
		
		if (vacuna.Alfa == 90) {
			System.out.println("Has ganado");
			fi = 1;
		}
		
		if (vacuna.getALFA() == 90) {
			System.out.println("Has ganado");
			fi = 1;
		}

		if (bc.contarInfecciones() > lp.EnfActDerrota || bc.contarBrotes() > lp.NumBroDerrota) {
			System.out.println("Has Perdido pringado");
			fi = 1;
			FinGame FG = new FinGame();
			//FG.main(null);
		
		}

		return fi;

	}

}
