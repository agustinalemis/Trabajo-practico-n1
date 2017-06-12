/*
 Confeccionar una clase que represente un empleado. Definir como
atributos su nombre y su sueldo. Confeccionar los métodos para la
carga, otro para imprimir sus datos y por último uno que imprima un
mensaje si debe pagar impuestos (si el sueldo supera a 3000).
 */
import java.util.Scanner;
public class Ejercicio6 {
	 String salto = System.getProperty("line.separator");
	 String nombre;
	 int sueldo;
	 public void introducir() {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre=teclado.next();
		System.out.print("Ingrese sueldo: ");
		sueldo=teclado.nextInt();
	 }
	 public void imprimir() {
		 System.out.print("Nombre: "+nombre+salto);
		 System.out.print("Sueldo: "+sueldo+salto);
	 }

	 public void pagaImpuestos() {
		 if (sueldo>=3000) {
			 	System.out.print(nombre+" debe pagar impuestos.");
		 } else {
			 	System.out.print(nombre+" no debe pagar impuestos.");
		 }
	 }

	 public static void main(String[] ar) {
		 Ejercicio6 empleado;
		 empleado=new Ejercicio6();
		 empleado.introducir();
		 empleado.imprimir();
		 empleado.pagaImpuestos();
	 }
}