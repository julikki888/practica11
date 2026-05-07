package ejercicio11;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Vista extends JPanel{

	
	
	/**
	 * Metodos de instancia
	 */
	JTextArea taEspanol, taIngles;
	JButton bTraducir, bIntercambiar;
	
	public Vista() {
		this.setLayout(new BorderLayout());
		
		JPanel pCentro = new JPanel(new GridLayout(1,2));
		pCentro.add(pIzquierdo());
		
		this.add(pCentro,BorderLayout.CENTER);
		
	}
	
	
	private Component pIzquierdo() {
		JPanel pIzquierdo = new JPanel();
		pIzquierdo.setLayout(new BoxLayout(pIzquierdo, BoxLayout.Y_AXIS));
		taEspanol = new JTextArea("Introduce texto a traducir");
		bTraducir = new JButton("Traducir");
		
		pIzquierdo.add(taEspanol);
		pIzquierdo.add(bTraducir);
		
		return pIzquierdo;
	}


	public void control(Controlador ctr) {
		
		
		
	}

}
