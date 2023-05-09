

public class ciudad_infectada {
	private String Ciudad;
	private int Infeccion;
	private int Brote;
	private int numCiu;
	private String Virus;
	
	public ciudad_infectada() {
		
	}

	public ciudad_infectada(String Ciudad, int Infeccion, int Brote, int numCiu, String Virus) {
		this.Ciudad = Ciudad;
		this.Infeccion = Infeccion;
		this.Brote = Brote;
		this.numCiu = numCiu;
		this.Virus = Virus;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public int getInfeccion() {
		return Infeccion;
	}
	
	public int getNumCiudad() {
		return numCiu;
	}
	
	public void setInfeccion(int nueva_infeccion) {
	    this.Infeccion = nueva_infeccion;
	}

	public int getBrote() {
		return Brote;
	}

	public String getVirus() {
		return Virus;
	}

	public String toString() {

		return (this.getCiudad() + ", " + this.getInfeccion() + ", " + this.getBrote() + ", " + this.getNumCiudad() + ", " + this.getVirus());
		
		}

	}














/*btnCiu1.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
			bc.RestarInfCiu(0);
			btnAtras.setVisible(false);
			cura.setVisible(false);
			Action1.setVisible(true);
	}
});*/





/*
 * btnCiu2.setEnabled(true); btnCiu3.setEnabled(true); btnCiu4.setEnabled(true);
 * btnCiu5.setEnabled(true); btnCiu6.setEnabled(true); btnCiu7.setEnabled(true);
 * btnCiu8.setEnabled(true); btnCiu9.setEnabled(true);
 * btnCiu10.setEnabled(true); btnCiu11.setEnabled(true);
 * btnCiu12.setEnabled(true); btnCiu13.setEnabled(true);
 * btnCiu14.setEnabled(true); btnCiu15.setEnabled(true);
 * btnCiu16.setEnabled(true); btnCiu17.setEnabled(true);
 * btnCiu18.setEnabled(true); btnCiu19.setEnabled(true);
 * btnCiu20.setEnabled(true); btnCiu21.setEnabled(true);
 * btnCiu22.setEnabled(true); btnCiu23.setEnabled(true);
 * btnCiu24.setEnabled(true); btnCiu25.setEnabled(true);
 * btnCiu26.setEnabled(true); btnCiu27.setEnabled(true);
 * btnCiu28.setEnabled(true); btnCiu29.setEnabled(true);
 * btnCiu30.setEnabled(true); btnCiu31.setEnabled(true);
 * btnCiu32.setEnabled(true); btnCiu33.setEnabled(true);
 * btnCiu34.setEnabled(true); btnCiu35.setEnabled(true);
 * btnCiu36.setEnabled(true); btnCiu37.setEnabled(true);
 * btnCiu38.setEnabled(true); btnCiu39.setEnabled(true);
 * btnCiu40.setEnabled(true); btnCiu41.setEnabled(true);
 * btnCiu42.setEnabled(true); btnCiu43.setEnabled(true);
 * btnCiu44.setEnabled(true); btnCiu45.setEnabled(true);
 * btnCiu46.setEnabled(true); btnCiu47.setEnabled(true);
 * btnCiu48.setEnabled(true); btnCiu49.setEnabled(true);
 * btnCiu50.setEnabled(true);
 */

