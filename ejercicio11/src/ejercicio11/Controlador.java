package ejercicio11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{

	Vista miVista;
	
	public Controlador(Vista v) {
		miVista = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == miVista.getbTraducir()) {
			
		}
	}


}
