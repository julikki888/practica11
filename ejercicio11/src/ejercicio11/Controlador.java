package ejercicio11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{

	Vista miVista;
	Modelo miModelo;
	
	public Controlador(Vista v, Modelo m) {
		miVista = v;
		miModelo = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == miVista.getbTraducir()) {
			miVista.getTfIngles().setText(miModelo.getMiMapa().get(miVista.getTfEspanol().getText()));
		}
	}


}
