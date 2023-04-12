package es.studium.exercise14;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		try {

		
			Scanner in = new Scanner (System.in);
			
			final int MAX = 10;
			int tabla[] = new int[MAX];
			
			System.out.println("Escriba 10 números enteros.\n");
			
			for (int i = 0; i < MAX; i++ ) {
				System.out.println("Escriba el número " + (i+1) +": ");
				tabla[i] = in.nextInt();
			}
				
			in.close();
			
			FileOutputStream fos = new FileOutputStream("tabla1.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream salidaBinaria = new DataOutputStream(bos);
			
			//System.out.println("Los números escritos son: " + tabla);
			
			for (int i = 0; i < MAX; i++){
				salidaBinaria.writeInt(tabla[i]);
			}
			salidaBinaria.close();
			bos.close();
			fos.close();
			System.out.println("Información guardada correctamente.");

		} catch (IOException ioe) {

			System.out.println("Error en el fichero " +ioe);

		}

	}

}
