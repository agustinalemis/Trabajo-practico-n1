/*
Escribir un programa que muestre la tabla de multiplicar del 5
(del 5 al 50).

 */
public class Ejercicio4 {
	public static void main(String[]ar) {
		String salto = System.getProperty("line.separator");
		int f=1;
		int res=0;
		while(f<=10){
				res=5*f;
				System.out.print("5 por "+f+" = "+res+salto);
				f=f+1;
		}
	}
}