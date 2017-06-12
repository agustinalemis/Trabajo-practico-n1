/*
Desarrollar un programa que permita cargar 10 números enteros y
luego nos informe cuántos valores fueron pares y cuántos impares.
 */
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[]ar) {
		Scanner teclado=new Scanner(System.in);
		/*
		 * Encontré este codigo en internet para hacer un salto de linea... mas abajo lo concateno
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