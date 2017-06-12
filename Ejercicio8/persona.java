/*
 Realizar una clase Persona que tenga como atributos el nombre y la
edad. Definir como responsabilidades un método que cargue los datos
personales y otro que los imprima.
Plantear una segunda clase Empleado que herede de la clase Persona.
Añadir un atributo sueldo y los métodos de cargar el sueldo e
imprimir su sueldo.
Crear un objeto de la clase Empleado y llamar a sus métodos.
 */
import java.util.Scanner;
public class persona {
	String salto = System.getProperty("line.separator");
	String nombre;
	int edad;
	public void responsabilidades(){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		nombre=teclado.next();
		System.out.print("Ingrese su edad: ");
		edad=teclado.nextInt();
	}
	public void imprimirDatos(){
		System.out.print("Nombre: "+nombre+salto);
		System.out.print("Edad: "+edad+salto);
	}
	public static void main(String[] ar) {
		persona persona1;
		empleado empleado1;
		persona1=new persona();
		empleado1=new empleado();
		persona1.responsabilidades();
		empleado1.cargarElSueldo();
		persona1.imprimirDatos();
		empleado1.imprimirSuSueldo();
	}
}
