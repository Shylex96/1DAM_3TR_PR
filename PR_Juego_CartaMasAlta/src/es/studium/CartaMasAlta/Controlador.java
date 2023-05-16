package es.studium.CartaMasAlta;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener {

	Modelo modelo;
	MenuPrincipal menuPrincipal;
	public Controlador(Modelo m, MenuPrincipal mp) {
		
		this.modelo = m;
		this.menuPrincipal = mp;
		
		// Añadir Listener
		this.menuPrincipal.addWindowListener(this);
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
