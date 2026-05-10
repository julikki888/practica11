package ejercicio11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Vista extends JPanel{

	
	
	/**
	 * Metodos de instancia
	 */
	JTextField tfEspanol, tfIngles;
	JButton bTraducir, bIntercambiar, bAnadir;
	
	public Vista() {
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(40,40,40,40));
		this.setBackground(new Color(255, 152, 92));
		
		JPanel pCentro = new JPanel(new GridLayout(1,2));
		pCentro.add(pIzquierdo());
		pCentro.add(pDerecho());
		
		bIntercambiar = new JButton("🔁");
		bIntercambiar.setBackground(new Color(250, 158, 170	));
		this.add(bIntercambiar,BorderLayout.SOUTH);
		bAnadir = new JButton("Añadir traduccion");
		
		this.add(pCentro,BorderLayout.CENTER);
		
		

	}
	
	
	private JPanel pIzquierdo() {
		JPanel pIzquierdo = new JPanel(new BorderLayout(50,50));
		
		pIzquierdo.setBackground(new Color(255, 233, 92));
		
		tfEspanol = new JTextField(12);
		
		bTraducir = new JButton("Traducir");
		bTraducir.setBackground(new Color(250, 158, 170	));
		
		
		pIzquierdo.add(tfEspanol, BorderLayout.CENTER);
		pIzquierdo.add(bTraducir, BorderLayout.SOUTH);
		creaBorde(pIzquierdo, "Español");
		
		return pIzquierdo;
	}
	private JPanel pDerecho() {
		JPanel pDerecho = new JPanel();
		tfIngles = new JTextField(12);
		
		pDerecho.add(tfIngles,BorderLayout.CENTER);
		creaBorde(pDerecho, "Ingles");
		pDerecho.setBackground(new Color(255, 233, 92));
		
		return pDerecho;
	}
	
	public void creaBorde(JPanel p, String str) {
		p.setBorder(new TitledBorder(str));
	}



	public void control(Controlador ctr) {
		
		bTraducir.addActionListener(ctr);
		bIntercambiar.addActionListener(ctr);

	}


	public JTextField getTfEspanol() {return tfEspanol;}
	public JTextField getTfIngles() {return tfIngles;}
	public JButton getbTraducir() {return bTraducir;}
	public JButton getbIntercambiar() {return bIntercambiar;}

	public void setTfEspanol(JTextField tfEspanol) {this.tfEspanol = tfEspanol;}
	public void setTfIngles(JTextField tfIngles) {this.tfIngles = tfIngles;}
	public void setbTraducir(JButton bTraducir) {this.bTraducir = bTraducir;}
	public void setbIntercambiar(JButton bIntercambiar) {this.bIntercambiar = bIntercambiar;}

	
	
}
