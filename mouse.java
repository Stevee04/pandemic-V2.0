import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class mouse extends JFrame {

	public mouse() {

		// Obtener la imagen del logo
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// Cargar la imagen original del cursor
		Image image = toolkit.getImage("src/mouseimg/prueba2.png");

		// Escalar la imagen a 64x64 (cambia el tamaño según lo que necesites)
		Image scaledImage = image.getScaledInstance(16400, 16400, Image.SCALE_SMOOTH);

		// Crear un nuevo cursor con la imagen escalada
		Cursor cursor = toolkit.createCustomCursor(scaledImage, new Point(0, 0), "CustomCursor");

		// Asignar el nuevo cursor al componente que lo necesita (en este caso, el JFrame)
		setCursor(cursor);
		
		//Cursor cursor = toolkit.createCustomCursor(toolkit.getImage("src/mouseimg/char.png"), new Point(0, 0), "Logo");
	}

	public static void main(String[] args) {
		mouse frame = new mouse();
		frame.setVisible(true);
	}
}