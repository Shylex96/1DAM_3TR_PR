package es.studium.Slot;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class MenuPrincipal extends Frame {

	private static final long serialVersionUID = 1L;
	
	MenuPrincipal() {
		
		setTitle("Juego Slot");
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(280, 280);
		setVisible(true);
	}
	
	public void paint (Graphics g) {
		
		Color color = new Color(181,230,29);
		g.setColor(color);
		g.drawRect(20, 50, 40, 40);
		Color color2 = new Color (255, 45, 17);
		g.setColor(color2);
		g.drawRect(80, 100, 40, 40);
		Color color3 = new Color (239, 136, 190);
		g.setColor(color3);
		g.drawRect(140, 160, 40, 40);
		Color color4 = new Color (17, 25, 237);
		g.setColor(color4);
		g.drawRect(200, 210, 40, 40);
		
	}

	
}
