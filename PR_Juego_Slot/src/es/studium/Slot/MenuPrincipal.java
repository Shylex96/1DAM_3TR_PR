package es.studium.Slot;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class MenuPrincipal extends Frame {

	private static final long serialVersionUID = 1L;
	
	MenuPrincipal() {
		
		setTitle("Juego Slot");
		setLocationRelativeTo(this);
		setResizable(false);
		setSize(400, 200);
		setVisible(true);
		
	}
	
	public void paint (Graphics g) {
		
		Color color = new Color(181,230,29);
		g.setColor(color);
		g.drawRect(10, 50, 40, 40);
	}

	
}
