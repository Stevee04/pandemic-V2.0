public class ciudad_infectada {
	private String Ciudad;
	private int Infeccion;
	private int Brote;
	private String Virus;

	public ciudad_infectada(String Ciudad, int Infeccion, int Brote, String Virus) {
		this.Ciudad = Ciudad;
		this.Infeccion = Infeccion;
		this.Virus = Virus;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public int getInfeccion() {
		return Infeccion;
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

		return (this.getCiudad() + ", " + this.getInfeccion() + ", " + this.getBrote() + ", " + this.getVirus());
		
		}

	}