/*
Desarrollar un programa que pida el ingreso del precio de un
artículo y la cantidad que lleva el cliente. Mostrar lo que debe
abonar el comprador.
 */
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[]ar){
		Scanner teclado=new Scanner(System.in);
		int cantidad;
		int precio;
		float abonar;
		System.out.println("Ingrese cantidad: ");
		cantidad=teclado.nextInt();
		System.out.print("Ingrese precio: ");
		precio=teclado.nextInt();
		abonar=precio*cantidad;
		System.out.print("Se debe abonar: $" + abonar);
	}
	
}
