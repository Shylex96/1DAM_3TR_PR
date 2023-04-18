package es.studium.EjemploRecursividad;

import java.util.Scanner;

public class PrimerEjemplo {

	public static void main(String[] args) {

		int n;
		int resultado;

		Scanner in = new Scanner (System.in);
		System.out.println("Dame el número entero a calcular su sumatorio.");
		n = in.nextInt();
		in.close();
		resultado = sumatorio(n);
		System.out.println(resultado);
	}

	public static int sumatorio(int n) {
		int r;

		// CASO BASE
		if (n == 1) {
			r = 1;
		}
		// CASO RECURSIVO
		else { 
			r = n + sumatorio(n-1);
		}
		return r;
	}

}
