/*
Desarrollar un programa que permita cargar 10 n�meros enteros y
luego nos informe cu�ntos valores fueron pares y cu�ntos impares.
 */
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		/*
		 * Encontr� este codigo en internet para hacer un salto de linea... mas abajo lo concateno
		 */
		String salto = System.getProperty("line.separator");
		int numero;
		int x=0;
		int par=0;
		int impar=0;
		while(x<10){
			System.out.print("Ingrese numero: ");
			numero=teclado.nextInt();
			if(numero%2==0){
				par=par+1;
			}else{
				impar=impar+1;
			}
			x=x+1;
		}
		System.out.print(par +" son pares." + salto);
		System.out.print(impar +" son impares.");
	}
}