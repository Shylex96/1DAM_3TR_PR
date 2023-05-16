package es.studium.Slot;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, MouseListener {

	Modelo modelo;
	MenuPrincipal menuPrincipal;
	Tablero tablero;
	
	Controlador(Modelo m, MenuPrincipal mp) {
		
		this.modelo = m;
		this.menuPrincipal = mp;
		
		
		
		this.menuPrincipal.addWindowListener(this);
		this.menuPrincipal.addMouseListener(this);
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void mouseClicked(MouseEvent me) 
	{
		int x = me.getX();
		int y = me.getY();
		
		if (x > 10 && x < 50 && y > 50 && y < 90){
			tablero = new Tablero();
			this.tablero.addWindowListener(this);
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
