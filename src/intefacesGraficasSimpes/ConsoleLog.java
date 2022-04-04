package intefacesGraficasSimpes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JMenuItem;

public class ConsoleLog implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		String mensaje;
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		mensaje = sdf.format(new Date());
		mensaje = mensaje + "click en el ";
		
		if(e.getSource() instanceof JButton) {
			mensaje = mensaje + "boton ";
		}
		if(e.getSource() instanceof JMenuItem) {
			mensaje = mensaje + "menu ";
		}
		mensaje = mensaje + ((AbstractButton)e.getSource()).getText();
		System.out.println(mensaje);
	}

}
