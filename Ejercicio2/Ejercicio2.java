/*
Se ingresa por teclado un número positivo, mostrar un mensaje
indicando si el número tiene uno, dos dígitos o más.
 */
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] ar){
	Scanner teclado= new Scanner(System.in);
	int numero;
	System.out.print("Ingrese un numero para verificar la cantidad de digitos que tiene: ");
	numero=teclado.nextInt();
	if(numero<10){
		System.out.print(numero + " tiene un digito.");
		}
	else if (numero<100){
		System.out.print(numero + " tiene dos digitos.");
		}
	else{
		System.out.print(numero + " tiene mas de dos digitos.");
		}
	}
}