package es.studium.Slot;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, MouseListener {

	Modelo modelo;
	MenuPrincipal menuPrincipal;

	Tablero tablero;
	Ranking ranking;
	int tiradas = 0;

	int dinerito;
	int n1, n2, n3;

	Controlador(Modelo m, MenuPrincipal mp) {

		this.modelo = m;
		this.menuPrincipal = mp;

		this.menuPrincipal.addWindowListener(this);
		this.menuPrincipal.addMouseListener(this);

		dinerito = 20;
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		if (tablero != null && tablero.isActive()) {
			tablero.setVisible(false);
		} else if (tablero != null && ranking.isActive()) {
			ranking.setVisible(false);
		} else {
			System.exit(0);
		}
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

		if (menuPrincipal.isActive()) {
			if (x > 20 && x < 60 && y > 50 && y < 90){
				// Primera opción: Tablero
				tablero = new Tablero();
				dinerito = 20;
				tiradas = 0;
				this.tablero.addWindowListener(this);
				this.tablero.addMouseListener(this);

			} else if (x > 80 && x < 120 && y > 100 && y < 140) {
				// Segunda opción: Ayuda


			} else if (x > 140 && x < 180 && y > 160 && y < 200) {
				// Tercera opción: Ranking
				ranking = new Ranking();
				this.ranking.addWindowListener(this);

			} else if (x > 200 && x < 240 && y > 210 && y < 250) {
				// Cuarta opción: Salir

				System.exit(0);
			}
		} else if (tablero.isActive()) {

			// Botón jugar de tablero
			if (x > 20 && x < 250 && y > 210 && y < 250) 
			{

				dinerito--;
				tiradas++;
				n1 = modelo.randomizer();
				n2 = modelo.randomizer();
				n3 = modelo.randomizer();
				tablero.establecerPrimera(modelo.randomizer());
				tablero.establecerSegunda(modelo.randomizer());
				tablero.establecerTercera(modelo.randomizer());

				System.out.println("Resultado: " +n1 + " " + n2 + " " + n3);
				System.out.println("Dinero disponible: " + dinerito + "€\n");

				// Comprobar si premio
				if (n1 == n2 && n2 == n3 && n1 == 14) {
					System.out.println("¡Felicitaciones! Has obtenido el mayor premio: +200€");
					dinerito = dinerito +200;
				} else if (n1 == n2 && n2 == n3 && n3 >= 10 && n1 <= 13) {
					System.out.println("¡Tres números iguales mayores! Premio: +100€");
					dinerito = dinerito + 100;
				} else if (n1 == n2 && n2 == n3 && n3 < 9) {
					System.out.println("¡Tres números iguales! Premio: +20€");
				} else if (n1 == n2) {
					dinerito++;
					System.out.println("¡Mini Recompensa: +1€\n");
				} else if (n2 == n3) {
					dinerito++;
					System.out.println("¡Mini Recompensa: +1€\n");
				} else if (n1 == n3) {
					dinerito++;
					System.out.println("¡Mini Recompensa: +1€\n");
				}
				else if (dinerito == 0) {
					System.out.println("Game Over - Ingrese más dinero para continuar");
					System.out.println("Has realizado " +tiradas + " tiradas.");
					this.tablero.removeMouseListener(this);
					//System.exit(0);

				}
				// Botón avance 1
			} 
			else if (x > 25 && x < 90 && y > 145 && y < 175) {
				n1++;
				dinerito--;

				if (n1 > 14) {
					n1 = 1;
				}
				tablero.establecerPrimera(n1);

			} 
			
			else if (x > 105 && x < 175 && y > 145 && y < 175) {
				n2++;
				dinerito--;

				if (n2 > 14) {
					n2 = 2;
				}
				tablero.establecerSegunda(n2);
			} 
			
			else if (x > 185 && x < 265 && y > 145 && y < 175) {
				n3++;
				dinerito--;

				if (n3 > 14) {
					n3 = 3;
				}
				tablero.establecerTercera(n3);
			}
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
