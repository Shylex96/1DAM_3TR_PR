package es.studium.exercise16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Exercise16 {

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


			FileOutputStream fos = new FileOutputStream("tabla2.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream salidaBinaria = new ObjectOutputStream(bos);
			salidaBinaria.writeObject(tabla);
			salidaBinaria.close();
			bos.close();
			fos.close();
			System.out.println("Información guardada con éxito");
			

		} catch (IOException ioe){
			System.out.println("Error " +ioe);
		}
	}
}

