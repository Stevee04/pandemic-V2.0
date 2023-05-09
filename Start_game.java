

public class Start_game {

	public static void Start(int Infeccion) {
		// TODO Auto-generated method stub

		busc_ciudad bc = new busc_ciudad();

		bc.SaveInfCiu(Infeccion);

	}

	public static void main(String[] args) {
		
		int c = 0;
		
		do {
			for (int i = 0; i <= 50; i++) {
				System.out.println(c);
				System.out.println(i);
				c++;
			}
		}while (c < 50);
	}
}
