/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 * rbr - 270924
 */
public class Principal {

	/**
	 * Método principal de la aplicación
	 * rbr - 270924
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		boolean cierraMenu = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			//Muestro el menú por consola
			System.out.println("----------------------------------");
			System.out.println("               MENÚ               ");
			System.out.println("----------------------------------");
			System.out.println("0. Cerrar calculadora");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("----------------------------------");
			System.out.println("Seleccione la opción que desee: ");
			//Recojo por consola la opción que desea realizar el usuario
			byte opcion = sc.nextByte();
			
			//Entro en la opción correspondiente según la elección del usuario
			switch(opcion) {
			case 0:
				System.out.println("Calculadora cerrada correctamente...");
				cierraMenu = true;
				break;
			case 1:
				System.out.println("Has seleccionado la opción para sumar valores...");
				Sumar();
				break;
			case 2:
				System.out.println("Has seleccionado la opción para restar valores...");
				Restar();
				break;
			case 3:
				System.out.println("Has seleccionado la opción para multiplicar valores...");
				Multiplicar();
				break;
			case 4:
				System.out.println("Has seleccionado la opción para dividir valores...");
				Dividir();
				break;
			default:
				System.out.println("Has seleccionado una opción no válida. Inténtelo de nuevo...");
				break;
			}
			
		}while (!cierraMenu);

	}
	
	/**
	 * Método que sumará dos valores introducidos por consola por el usuario
	 * rbr - 270924
	 */
	public static void Sumar() {
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario los números y los guardo en sus correspondientes variables
		System.out.println("Introduzca el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int num2 = sc.nextInt();
		
		//Calculo el resultado de la suma
		int total = num1 + num2;
		
		//Muestro el total por consola
		System.out.println("La suma de " + num1 + " mas " + num2 + " es: " + total);
	}
	
	/**
	 * Método que restará dos valores introducidos por consola por el usuario
	 * rbr - 270924
	 */
	public static void Restar() {
			
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario los números y los guardo en sus correspondientes variables
		System.out.println("Introduzca el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int num2 = sc.nextInt();
		
		//Calculo el resultado de la resta
		int total = num1 - num2;
		
		//Muestro el total por consola
		System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + total);
	}
	
	/**
	 * Método que multiplicará dos valores introducidos por consola por el usuario
	 * rbr - 270924
	 */
	public static void Multiplicar() {
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario los números y los guardo en sus correspondientes variables
		System.out.println("Introduzca el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int num2 = sc.nextInt();
		
		//Calculo el resultado de la multiplicación
		int total = num1 * num2;
		
		//Muestro el total por consola
		System.out.println("La multiplicación de " + num1 + " por " + num2 + " es: " + total);
	}
	
	/**
	 * Método que dividirá dos valores introducidos por consola por el usuario
	 * rbr - 270924
	 */
	public static void Dividir() {
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario los números y los guardo en sus correspondientes variables
		System.out.println("Introduzca el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int num2 = sc.nextInt();
		
		//Calculo el resultado de la división
		int total = num1 / num2;
		
		//Muestro el total por consola
		System.out.println("La división de " + num1 + " entre " + num2 + " es: " + total);
	}

}
