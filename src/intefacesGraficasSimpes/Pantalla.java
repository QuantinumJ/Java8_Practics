package intefacesGraficasSimpes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Pantalla extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel panel = new JPanel();
	
	JButton btnRojo, btnVerde, btnAzual;
	JMenuItem mnuRojo, mnuVerde,mnuAzul;
	
	ConsoleLog lg = new ConsoleLog();
	
	public Pantalla() {
		setTitle("Interfaz grafica");
		setBounds(0,0,300,100);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		btnRojo = new JButton("Rojo");
		btnRojo.setActionCommand("red");
		btnVerde = new JButton("Verde");
		btnVerde.setActionCommand("green");
		btnAzual = new JButton("Azul");
		btnAzual.setActionCommand("blue");
		
		ReceptorColor ec = new ReceptorColor();
		btnRojo.addActionListener(ec);
		btnVerde.addActionListener(ec);
		btnAzual.addActionListener(ec);
		
		// Creacion de la opcioon al marcar
		JCheckBox chkLog = new JCheckBox("log en consola");
		chkLog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JCheckBox chk;
				chk = (JCheckBox)e.getSource();
				if(chk.isSelected()) {
					btnRojo.addActionListener(lg);
					btnVerde.addActionListener(lg);
					btnAzual.addActionListener(lg);
					mnuRojo.addActionListener(lg);
					mnuVerde.addActionListener(lg);
					mnuAzul.addActionListener(lg);
					
				}else {
					// eliminamos los receptores de los botones y los menus
					btnRojo.removeActionListener(lg);
					btnVerde.removeActionListener(lg);
					btnAzual.removeActionListener(lg);
					mnuRojo.removeActionListener(lg);
					mnuVerde.removeActionListener(lg);
					mnuAzul.removeActionListener(lg);
					
				}
			}
		});
		
		//creacion del menu
		JMenuBar barraMenu = new JMenuBar();
		JMenu mnuColores = new JMenu("colores");
		barraMenu.add(mnuColores);
		mnuRojo = new JMenuItem("rojo");
		mnuRojo.setActionCommand("red");
		mnuVerde = new JMenuItem("verde");
		mnuVerde.setActionCommand("green");
		mnuAzul = new JMenuItem("azul");
		mnuAzul.setActionCommand("blue");
		
		mnuColores.add(mnuRojo);
		mnuColores.add(mnuVerde);
		mnuColores.add(mnuAzul);
		// Asociamos cada receptor con su elementu de menu el mismo que para botones
		mnuRojo.addActionListener(ec);
		mnuVerde.addActionListener(ec);
		mnuAzul.addActionListener(ec);
		//Agregamos el menu a la ventana
		setJMenuBar(barraMenu);
		// creamos el contenedor intermedio
		panel.add(btnRojo);
		panel.add(btnVerde);
		panel.add(btnAzual);
		panel.add(chkLog);
		
		
		
		//Se agrega el contenedor intermedio en el ContentPane
		getContentPane().add(panel);
		// creacion de una instancia de una clase anonima encargada de gestionar los eventos
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
	}
	public class ReceptorColor implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String comando;
			comando = e.getActionCommand();
			if (comando.equals("red")) {
				panel.setBackground(Color.RED);
			}
			if (comando.equals("green")) {
				panel.setBackground(Color.GREEN);
			}
			if (comando.equals("blue")) {
				panel.setBackground(Color.BLUE);
			}
		}
	}
	

}
