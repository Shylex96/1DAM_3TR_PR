package es.studium.exercise13;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise13 {

	public static void main(String[] args) {
		
		try {

			FileInputStream fis = new FileInputStream("uno.bin");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream entradaBinario = new DataInputStream(bis);
			int entero;
			entero = entradaBinario.readInt();
			System.out.println(entero);
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
