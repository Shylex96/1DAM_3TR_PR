package es.studium.ejemplos;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;


public class GameExample extends Frame implements WindowListener, MouseListener
{

	private static final long serialVersionUID = 1L;
	// Las coordenadas del cuadrado
	int posX, posY;
	// Las coordenadas del lugar donde pulse
	int pulX, pulY;
	// Las vidas
	int vidas;
	int size = 20;
	Random rnd = new Random();
	
	
	
	public GameExample()
	{
		vidas = 3;
		// Obtener los valores iniciales del cuadrado
		obtenerPosicion();
		addWindowListener(this);
		addMouseListener(this);
		setLocationRelativeTo(this);
		setSize(220,220);
		setVisible(true);
	}
	public void obtenerPosicion()
	{
		// Obtenemos los valores teniendo en cuenta los límites del escenario
		posX=rnd.nextInt(186)+8;
		posY=rnd.nextInt(160)+32;
	}
	public void paint(Graphics g)
	{
		g.drawRect(posX, posY, size, size);
		g.drawString("Vidas:" + vidas, 10, 50);
		g.drawString("Puntos:" + puntos, 150, 50);
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public static void main(String[] args)
	{
		new GameExample();
	}
	
	int puntos = 0;
	public void mouseClicked(MouseEvent me)
	{
		// Obtenemos las coordenadas del lugar donde se ha pulsado con el ratón
		pulX = me.getX();
		pulY = me.getY();
		// Comprobamos si las coordenadas del ratón están entre las del cuadrado
		if((posX<=pulX)&&(pulX<=posX+size)&&(posY<=pulY)&&(pulY<=posY+size))
		{
			if (size > 1) {
				size--;
			}
			
			puntos = puntos+1;
			System.out.println("Acertaste");
			
			// Obtenemos una nueva posición del cuadrado
			obtenerPosicion();
			// Y lo dibujamos
			
			
			if (puntos > 9 && puntos < 11) {
				System.out.println("¡Racha de 10!");
			} else if (puntos > 19 && puntos < 21) {
				System.out.println("¡Racha de 20!");
			} else if (puntos > 29 && puntos < 31) {
				System.out.println("¡Racha de 30!");
			} else if (puntos > 39 && puntos < 41) {
				System.out.println("¡Racha de 40!");
			} else if (puntos > 49 && puntos < 51) {
				System.out.println("¡Racha de 50!");
				fin();
			}
			
			
		}
		else
		{
			vidas--;
			if(vidas==0)
			{
				System.out.println("Has acabado todas las vidas. FIN!\nPuntos: " +puntos);
				// Deshabilitamos el MouseListener pues se ha acabado el juego
				this.removeMouseListener(this);
			}
			else
			{
				System.out.println("Has perdido una vida. Te quedan "+vidas+ " vidas.");
			}
		}
		repaint();
	}
	private void fin() {
		this.removeMouseListener(this);
		System.out.println("¡Has logrado la puntuación perfecta! 50/50");
		
	}
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
}

