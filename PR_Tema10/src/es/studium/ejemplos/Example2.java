package es.studium.ejemplos;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Example2 extends Frame implements WindowListener, KeyListener
{
	private static final long serialVersionUID = 1L;
	int posX, posY;
	int size = 20;
	
	public Example2()
	{
		posX = 100;
		posY = 100;
		addWindowListener(this);
		addKeyListener(this);
		setSize(220,220);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.drawOval(posX, posY, size, size);
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
	public void keyPressed(KeyEvent ke)
	{
		
		if (size > 1) {
			size--;
		}
		
		// Pulsamos cursor izquierda
		if(ke.getKeyCode()== 37 || ke.getKeyCode()== 65)
		{
			if(posX>=15)
			{
				posX-=5;
			}
		}
		// Pulsamos cursor arriba
		else if(ke.getKeyCode()== 38 || ke.getKeyCode()== 87)
		{
			if(posY>=35)
			{
				posY-=5;
			}
		}
		// Pulsamos cursor derecha
		else if(ke.getKeyCode()== 39 || ke.getKeyCode()== 68)
		{
			if(posX<=185)
			{
				posX+=5;
			}
		}
		// Pulsamos cursor abajo
		else if(ke.getKeyCode()== 40 || ke.getKeyCode()== 83)
		{
			if(posY<=185)
			{
				posY+=5;
			}
		}
		repaint();
	}
	public void keyReleased(KeyEvent ke) {}
	public void keyTyped(KeyEvent ke) {}
	public static void main(String[] args)
	{
		new Example2();
	}
}

