import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<String>estudiantes = new ArrayList<String>();
		
		System.out.println("Introduzca los datos:");
		System.out.println("Nombre:");
		String nombre=sc.nextLine();
		estudiantes.add(nombre);
		System.out.println("Apellidos:");
		String apellidos=sc.nextLine();
		estudiantes.add(apellidos);
		System.out.println("Fecha de nacimeinto:");
		String fecha=sc.nextLine();
		estudiantes.add(fecha);
		System.out.println("DNI:");
		String dni=sc.nextLine();
		estudiantes.add(dni);
		System.out.println("Estudios previos:");
		String estudios=sc.nextLine();
		estudiantes.add(estudios);
		System.out.println("Teléfono:");
		String telefono=sc.nextLine();
		estudiantes.add(telefono);
		
	}

}
