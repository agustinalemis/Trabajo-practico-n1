/*
Realizar un programa que acumule (sume) valores ingresados por
teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha
finalizado la carga). Imprimir el valor acumulado e informar si dicho
valor es cero, mayor a cero o menor a cero.
 */
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[]ar) {
		String salto = System.getProperty("line.separator");
		Scanner teclado=new Scanner(System.in);
		int valor=0;
		int f=0;
		System.out.print("Ingrese numeros para acumular y conozca si la suma de ellos es cero, positiva o negativa"+salto);
		System.out.print("Si desea finalizar ingrese el numero 9999..."+salto);
		while(f!=9999){
			System.out.print("Valor: ");
			f=teclado.nextInt();
			if(f!=9999){
				valor=valor+f;
			}
		}
		System.out.print("La suma total de los valores es: "+valor);
	}
}