package ejercicio11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Vista extends JPanel{

	
	
	/**
	 * Metodos de instancia
	 */
	JTextArea taEspanol, taIngles;
	JButton bTraducir, bIntercambiar;
	
	public Vista() {
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(255, 152, 92));
		
		JPanel pCentro = new JPanel(new GridLayout(1,2));
		pCentro.setPreferredSize(new Dimension(400,200));
		pCentro.add(pIzquierdo());
		pCentro.add(pDerecho());
		
		this.add(pCentro,BorderLayout.CENTER);

	}
	
	
	private Component pIzquierdo() {
		JPanel pIzquierdo = new JPanel();
		pIzquierdo.setLayout(new BoxLayout(pIzquierdo, BoxLayout.Y_AXIS));
		pIzquierdo.setBackground(new Color(255, 233, 92));
		
		taEspanol = new JTextArea("Introduce texto a traducir");
		taEspanol.setPreferredSize(new Dimension(40,20));
		
		bTraducir = new JButton("Traducir");
		bTraducir.setBackground(new Color(255, 233, 92));
	
		
		pIzquierdo.add(taEspanol);
		pIzquierdo.add(bTraducir);
		creaBorde(pIzquierdo, "Español");
		
		return pIzquierdo;
	}
	private Component pDerecho() {
		JPanel pDerecho = new JPanel();
		pDerecho.setLayout(new BoxLayout(pDerecho, BoxLayout.Y_AXIS));
		taIngles = new JTextArea("Traduccion");
		
		pDerecho.add(taIngles);
		
		return pDerecho;
	}
	
	private void creaBorde(JPanel p, String str) {
		p.setBorder(new TitledBorder(str));
	}



	public void control(Controlador ctr) {
		
		
		
	}

}
