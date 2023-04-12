package es.studium.FicherosBinarios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FicheroBinarioLectura {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("datos.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream entradaBinario = new DataInputStream(bis);
			Double dato;
			dato = entradaBinario.readDouble();
			System.out.println(dato);
			entradaBinario.close();
			bis.close();
			fis.close();

		}  catch (FileNotFoundException fnfe) {

			System.out.println("Error en el fichero " +fnfe);

		}
		catch (IOException ioe) {

			System.out.println("Error en el fichero " +ioe);



		}

	}
}
