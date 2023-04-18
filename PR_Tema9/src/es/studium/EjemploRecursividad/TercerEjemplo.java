package es.studium.EjemploRecursividad;

import java.util.Scanner;

public class TercerEjemplo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Dame el número de elementos de la Sucesión de Fibonacci.");
		int n = in.nextInt();
		in.close();
		for (int i = 1; i <= n; i++) {
			System.out.println(fibonacci(i));
		}	
	}

	public static int fibonacci(int n) {
		int resultado;
		
        if (n == 0) {
        	
        	resultado = 0;
        	
        } else if (n==1){
        	
        	resultado = 1;
        	
        } else {
        	
        	resultado = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return resultado;
	}

}


