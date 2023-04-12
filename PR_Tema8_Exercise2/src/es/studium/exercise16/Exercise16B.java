package es.studium.exercise16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exercise16B {

	public static void main(String[] args) {
		final int TAM = 10;
		int[] tabla = new int [TAM];

		try {
			FileInputStream fis = new FileInputStream("tabla2.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream entradaBinaria = new ObjectInputStream(bis);
			
			tabla = (int[]) entradaBinaria.readObject();
			entradaBinaria.close();
			bis.close();
			fis.close();

			for (int numero: tabla) 
			{	
				System.out.println(numero);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("El fichero no se encuentra " +fnfe.getMessage());

		} catch (IOException ioe) {
			System.out.println("Error de fichero " +ioe.getMessage());

		} catch (ClassNotFoundException e) {
			System.out.println("Error de casting " +e.getMessage());
		}
	}
}


