package unico;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opc;
		String asignatura;
		
		System.out.println("Días de la semana: ");
		System.out.println("1 - Lunes");
		System.out.println("2 - Martes");
		System.out.println("3 - Miércoles");
		System.out.println("4 - Jueves");
		System.out.println("5 - Viernes");
		System.out.print("Introduzca el día de la semana elegido: ");
		opc = Integer.parseInt(teclado.nextLine());
				
		
		
		switch(opc){
			case 1: asignatura = "Programación";break;
			case 2: asignatura = "FOL";break;
			case 3: asignatura = "LM";break;
			case 4: asignatura = "Programación";break;
			case 5: asignatura = "Programación";break;
			default: asignatura = "No hay clases";
		}
		
		System.out.println("Tienes: " + asignatura);

	}

}