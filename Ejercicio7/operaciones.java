/*
 Implementar la clase operaciones. Se deben cargar dos valores
enteros, calcular su suma, resta, multiplicación y división, cada una
en un método, imprimir dichos resultados.
 */
import java.util.Scanner;
public class operaciones {
	String salto = System.getProperty("line.separator");
	int a=0;
	int b=0;
	int suma;
	int resta;
	int multi;
	int divi;
	public void	cargarValores(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese el primer valor: ");
		a=teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		b=teclado.nextInt();
	}
	public void	sum(){
		suma=a+b;
		System.out.print("La suma es: "+suma+salto);
	}
	public void	res(){
		resta=a-b;
		System.out.print("La resta es: "+resta+salto);
	}
	public void mul(){
		multi=a*b;
		System.out.print("La multiplicacion es: "+multi+salto);
	}
	public void div(){
		divi=a/b;
		System.out.print("La division es: "+divi+salto);
	}
	
	public static void main(String[] ar) {
		operaciones resultados1;
		resultados1= new operaciones();
		resultados1.cargarValores();
		resultados1.sum();
		resultados1.res();
		resultados1.mul();
		resultados1.div();
	}
}
