package es.studium.imprimir;
import java.awt.*;
import java.awt.event.*;

public class Imprimir extends Frame implements WindowListener, ActionListener {

	private static final long serialVersionUID = 1L;
	Button btnImprime = new Button ("Imprimir");
	TextField txtMensaje = new TextField("",15);

	public Imprimir()
	{
		setLayout(new FlowLayout());
		setLocationRelativeTo(this);
		setSize(200,200);
		add(txtMensaje);
		add(btnImprime);
		addWindowListener(this);
		btnImprime.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		// Se obtiene el objeto PrintJob
		PrintJob pjob = this.getToolkit().getPrintJob(this, txtMensaje.getText(), null);
		// Se obtiene el objeto graphics sobre el que pintar
		Graphics pg = pjob.getGraphics();
		// Se fija la fuente de caracteres con la que escribir
		pg.setFont(new Font("SansSerif",Font.PLAIN,12));
		// Se escribe el mensaje del Cuadro de Texto indicando
		// posición con respecto a la parte superior izquierda
		pg.drawString(txtMensaje.getText(),100,100);
		// Se finaliza la página
		pg.dispose();
		// Se hace que la impresora termine el trabajo y suelte la página
		pjob.end();
	}

	public static void main(String[] args)
	{
		new Imprimir();
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
}