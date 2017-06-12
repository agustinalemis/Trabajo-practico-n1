import java.util.Scanner;
public class empleado {
	String salto = System.getProperty("line.separator");
	int sueldo;
	public void cargarElSueldo(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese su sueldo: ");
		sueldo=teclado.nextInt();
	}
	public void imprimirSuSueldo(){
		System.out.print("Su sueldo: "+sueldo+salto);
	}
}
