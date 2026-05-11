package ejercicio11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener{

	private Vista miVista;
	private Modelo miModelo;
	
	public Controlador(Vista v, Modelo m) {
		miVista = v;
		miModelo = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == miVista.getbTraducir() && miVista.getbTraducir().getText().equals("Traducir")) {
			miVista.getTfIngles().setText(miModelo.getMiMapaE().get(miVista.getTfEspanol().getText()));
		}else {
			miVista.getTfIngles().setText(miModelo.getMiMapaI().get(miVista.getTfEspanol().getText()));
		}
		if(e.getSource() == miVista.getbAnadir()) {
			JOptionPane op = new JOptionPane();
			String traduccion = op.showInputDialog("Escribe la nueva palabra a traducir");
			miModelo.annadir(traduccion);
			traduccion = op.showInputDialog("Escribe la traduccion de la palabra anterior");
			miModelo.annadir(traduccion);
		}
		if(e.getSource() == miVista.getbIntercambiar()) {
			if(miVista.getbTraducir().getText().equals("Traducir")) {
				miVista.getbTraducir().setText("Translate");
				miVista.creaBorde(miVista.getpIzquierdo(), "English");
				miVista.creaBorde(miVista.getpDerecho(),"Spanish");
			}else {
				miVista.getbTraducir().setText("Traducir");
				miVista.creaBorde(miVista.getpIzquierdo(), "Español");
				miVista.creaBorde(miVista.getpDerecho(),"Ingles");
			}
		}
	}


}
