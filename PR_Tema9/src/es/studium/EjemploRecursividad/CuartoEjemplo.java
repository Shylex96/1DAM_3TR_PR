package es.studium.EjemploRecursividad;

import java.util.Scanner;

public class CuartoEjemplo {

	public static void main(String[] args) {

		double n;
		Scanner in = new Scanner (System.in);
		do 
		{
			System.out.println("Dame el valor de 'n'");
			n = in.nextInt();
		} while (n<1);
		in.close();
		sucesion(n-1);
	}


	public static void sucesion(double n) {
		if (n==0) {
			System.out.println("1.5");
		} else {
			sucesion(n-1);
			System.out.println((float)(n+3)/(float)2);
		}

	}

}
