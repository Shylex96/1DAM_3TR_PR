package es.studium.ejemplos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Rectangulo extends Frame implements WindowListener {

	private static final long serialVersionUID = 1L;

	Rectangulo() {


		addWindowListener(this);
		setSize(300, 300);
		//rect1 = new Rectangle(350, 165, 230, 75);
		//setUndecorated(true);
		setForeground(Color.BLUE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Rectangulo();
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

	public void paint(Graphics g) {

		// Dibujar rectángulo (bordes)
		g.drawRect(125, 125, 50, 50);
		// Establecer color
		g.setColor(Color.RED);
		// Para establecer un color personalizado
		//Color color = new Color (182, 23,45);
		// Rellenarlo con el color
		g.fillRect(125, 125, 50, 50);

		Font font = new Font("Times New Roman", Font.BOLD, 14);
		g.setFont(font);
		g.drawString("Buenas", 125, 90);
	}
}

