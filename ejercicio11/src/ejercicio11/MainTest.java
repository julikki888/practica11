package ejercicio11;

import javax.swing.JFrame;


public class MainTest {

	public static void main(String[] args) {
		Vista miVista = new Vista();
		
		Modelo miModelo = new Modelo();
		
		Controlador ctr = new Controlador(miVista);
		
		miVista.control(ctr);
		
		JFrame ventana = new JFrame("Eventos tipo check, combo y lista");
		
		ventana.setContentPane(miVista);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);
		miVista.bIntercambiar.requestFocusInWindow();

	}

}
