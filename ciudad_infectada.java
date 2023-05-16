

public class ciudad_infectada {
	private String Ciudad; 
	private int Infeccion;
	private int Brote;
	private int numCiu;
	private String Virus;
	
	public ciudad_infectada() {
		
	}

	public ciudad_infectada( int numCiu, String Ciudad, int Infeccion, int Brote, String Virus) {
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
	
	public void setBrote(int nuevo_brote) {
	    this.Brote = nuevo_brote;
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