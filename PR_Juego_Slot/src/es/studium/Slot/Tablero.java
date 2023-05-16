package es.studium.Slot;

import java.awt.Frame;

public class Tablero extends Frame {

	private static final long serialVersionUID = 1L;
	
	Tablero() {
		
		setTitle("Jugando...");
		setLocationRelativeTo(this);
		setResizable(false);
		setSize(400, 200);
		setVisible(true);
	}

}
