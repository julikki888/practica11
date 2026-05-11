package ejercicio11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.*;

public class Vista extends JPanel{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8120434776421619605L;
	/**
	 * Metodos de instancia
	 */
	private JTextField tfEspanol, tfIngles;
	private JButton bTraducir, bIntercambiar, bAnadir;
	private JPanel pIzquierdo, pDerecho;
	
	public Vista() {
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(40,40,40,40));
		this.setBackground(new Color(255, 152, 92));
		
		JPanel pCentro = new JPanel(new GridLayout(1,2));
		pCentro.add(pIzquierdo());
		pCentro.add(pDerecho());
		
		this.add(pSur(),BorderLayout.SOUTH);

		this.add(pCentro,BorderLayout.CENTER);
		
		

	}
	
	
	private Component pSur() {
		
		JPanel pSur = new JPanel();
		
		bIntercambiar = new JButton("🔁");
		bIntercambiar.setBackground(new Color(250, 158, 170	));
		
		bAnadir = new JButton("Añadir traduccion");
		bAnadir.setBackground(new Color(250, 158, 170	));
		
		pSur.add(bIntercambiar);
		pSur.add(bAnadir);
		pSur.setBackground(new Color(255, 233, 92));
		
		return pSur;
	}


	private JPanel pIzquierdo() {
		pIzquierdo = new JPanel(new BorderLayout(50,50));
		
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
		pDerecho = new JPanel();
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
		bAnadir.addActionListener(ctr);

	}


	public JTextField getTfEspanol() {return tfEspanol;}
	public JTextField getTfIngles() {return tfIngles;}
	public JButton getbTraducir() {return bTraducir;}
	public JButton getbIntercambiar() {return bIntercambiar;}
	public JButton getbAnadir() {return bAnadir;}
	public JPanel getpIzquierdo() {return pIzquierdo;}
	public JPanel getpDerecho() {return pDerecho;}

	public void setTfEspanol(JTextField tfEspanol) {this.tfEspanol = tfEspanol;}
	public void setTfIngles(JTextField tfIngles) {this.tfIngles = tfIngles;}
	public void setbTraducir(JButton bTraducir) {this.bTraducir = bTraducir;}
	public void setbIntercambiar(JButton bIntercambiar) {this.bIntercambiar = bIntercambiar;}
	public void setbAnadir(JButton bAnadir) {this.bAnadir = bAnadir;}
	public void setpIzquierdo(JPanel pIzquierdo) {this.pIzquierdo = pIzquierdo;}
	public void setpDerecho(JPanel pDerecho) {this.pDerecho = pDerecho;}

	
	
	
}
