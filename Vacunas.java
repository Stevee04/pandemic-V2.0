public class Vacunas {
	private int id_vacunas;
	private String nombreVacuna;
	private int porcentajeRealizado;

	public Vacunas(int id_vacunas, String nombreVacuna, int porcentajeRealizado) {
		super();
		this.id_vacunas = id_vacunas;
		this.nombreVacuna = nombreVacuna;
		this.porcentajeRealizado = porcentajeRealizado;
	}

	public int getid_Vacunas() {
		return id_vacunas;
	}

	public void setid_Vacunas(int id_vacunas) {
		this.id_vacunas = id_vacunas;
	}

	public String getnombreVacuna() {
		return nombreVacuna;
	}

	public void setnombreVacuna(String nombreVacuna) {
		this.nombreVacuna = nombreVacuna;
	}

	public int getporcentajeRealizado() {
		return porcentajeRealizado;
	}

	public void setporcentajeRealizado(int domicilio) {
		this.porcentajeRealizado = domicilio;
	}

	@Override
	public String toString() {
		return "Vacunas [Vacunas= " + this.id_vacunas + ", nombre= " + this.nombreVacuna + this.porcentajeRealizado
				+ " %" + "]";
	}
}
