import javax.swing.ImageIcon;

public class VacunasPor {
	
	int Alfa = 0;
	int Beta = 0;
	int Delta = 0;
	int Gama = 0;
	
	public int getALFA() {
		return Alfa;
	}

	public int getBETA() {
		return Beta;
	}

	public int getDELTA() {
		return Delta;
	}

	public int getGAMA() {
		return Gama;
	}
	
	public void setALFA(int cantidad) {
		Alfa += cantidad;
		System.out.println(Alfa);
	}

	public void setBETA(int cantidad) {
		Beta += cantidad;		
		System.out.println(Beta);
	}

	public void setDELTA(int cantidad) {
		Delta += cantidad;
		System.out.println(Delta);
	}

	public void setGAMA(int cantidad) {
		Gama += cantidad;
		System.out.println(Gama);
	}
	
	
	
	public ImageIcon getAlfaImage() {
		String imagePath ="/play/loadAlfa/Alfa"+Alfa+".png";
		return new ImageIcon(Play.class.getResource(imagePath));
	}
	
	public ImageIcon getBetaImage() {
		String imagePath = "/play/loadBeta/Beta"+Beta+".png";
		return new ImageIcon(Play.class.getResource(imagePath));
	}
	
	public ImageIcon getDeltaImage() {
		String imagePath ="/play/loadDelta/Delta"+Delta+".png";
		return new ImageIcon(Play.class.getResource(imagePath));
	}
	
	public ImageIcon getGamaImage() {
		String imagePath ="/play/loadGama/Gama"+Gama+".png";
		return new ImageIcon(Play.class.getResource(imagePath));
	}

}
