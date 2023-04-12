package es.studium.exercise12;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("uno.bin");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream salidaBinaria = new DataOutputStream(bos);
			Scanner in = new Scanner (System.in);
			System.out.println("Escribe un número entero");
			int entero = in.nextInt();
			in.close();
			
			salidaBinaria.writeInt(entero);
			salidaBinaria.close();
			bos.close();
			fos.close();
			System.out.println("Información guardada correctamente.");

		} catch (IOException ioe) {

			System.out.println("Error en el fichero " +ioe);

		}

	}

}
