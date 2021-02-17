package ordenamientoSeleccion;

import java.util.Collections;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner(System.in);
		Persona a[] = new Persona[5];
		
		String nombre="";
		int edad=0;
		int dpi=0;
		
				
		
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println("Ingrese su nombre");
			nombre = leer.nextLine();
			System.out.println("Ingrese su edad ");
			edad = leer.nextInt();
			System.out.println("Ingrese su DPI");
			dpi = leer.nextInt();
			leer.nextLine();
			a[i] = new Persona(nombre,edad,dpi);
			

			
					}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].getDpi()+" "+a[i].getNombre()+" "+a[i].getEdad());
			
		}
		
		
		

	}

}
