package github_javadoc;

import java.util.Scanner;

/**
 * Programa per comprovar si un numero es parell i fer sumas i restes
 * @author Font
 * @version 2.1
 */
public class Javadoc {
	/**
	 * Menú amb diverses operacions disponibles
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		int opcio =-1,numero1,numero2;
		Scanner s = new Scanner(System.in);
		
		while (opcio!=0){
			System.out.println("***** MENU *****");
			System.out.println("1. Comprovar si es parell");
			System.out.println("2. Sumar nombres");
			System.out.println("3. Restar nombres");
			System.out.println("0. Sortir");
			opcio=s.nextInt();
			
			switch(opcio){
				case 1:
					System.out.println("Entra el nombre que vulguis saber si és parell:");
					numero1=s.nextInt();
					es_Parell(numero1);
				break;
				case 2:
					System.out.println("Introdueix el 1r numero: ");
					numero1=s.nextInt();
					
					System.out.println("Introdueix el 2n numero: ");
					numero2=s.nextInt();
					System.out.println(suma(numero1,numero2));
					break;
				case 3:
					System.out.println("Introdueix el 1r numero: ");
					numero1=s.nextInt();
					
					System.out.println("Introdueix el 2n numero: ");
					numero2=s.nextInt();
					System.out.println(Restar(numero1,numero2));
				break;	
				case 0:
					System.out.println("Adeu jove");
			}
		}
	
}

	/**
	 * Donats 2 numeros et retornara la suma dels dos
	 * @param numero1
	 * @param numero2
	 * @return numero1+numero2
	 */
	public static int suma(int numero1, int numero2) {
		return numero1+numero2;
	}

	/**
	 * Donats 2 numeros et retornara la resta dels dos
	 * @param numero1
	 * @param numero2
	 * @return numero1-numero2
	 */
	public static int Restar(int numero1, int numero2) {
		return numero1-numero2;
	}

	/**
	 * Donat un valor et diu si és parell o no
	 * @param numero1
	 */
	public static void es_Parell(int numero1) {
		if (numero1%2==0) 
			System.out.println(numero1 + " és parell"); 
		else System.out.println(numero1 + " no és parell");;
	}
		
}
