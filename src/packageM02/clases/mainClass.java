package packageM02.clases;

import java.util.Scanner;
import packageM02.clases.Employees;

public class mainClass {

	public static void startProgram() {
		Scanner ask = new Scanner(System.in);
		
		System.out.println("Marque 1 para iniciar el cálculo de sueldo empleado:");
		int opcion = ask.nextInt();
		
		if(opcion == 1) {
			do {
				System.out.println("Indique Nombre: ");
				String name = ask.next();
				despliegaOpcion(name);
				System.out.println("Marque 1 para iniciar el cálculo de sueldo empleado:");
				opcion = ask.nextInt();
			}while(opcion == 1);
		}else {
			System.out.println("Hasta luego");
		}
		
		ask.close();
	}
	
	public static void despliegaOpcion(String name) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique opción : \n1.- Marque 1 para calcular sueldo empleado: \n2.- Marque 2 para calcular sueldo Manager: \n3.- Marque 3 para calcular sueldo Jefe: \n4.- Marque 3 para calcular sueldo voluntario:");
		int respuesta = ask.nextInt();
		switch(respuesta) {
			case 1:
				System.out.println("Indique Salario: ");
				double salary = ask.nextDouble();
				Employee employee = new Employee(name, salary);
				System.out.println(employee.toString());
				break;
			case 2:
				System.out.println("Indique Salario: ");
				double salary1 = ask.nextDouble();
				Manager manager = new Manager(name, salary1);
				System.out.println(manager.toString());
				break;
			case 3:
				System.out.println("Indique Salario: ");
				double salary2 = ask.nextDouble();
				Boss boss = new Boss(name, salary2);
				System.out.println(boss.toString());
				break;
			case 4:
				Voluntary voluntary = new Voluntary(name);
				System.out.println(voluntary.toString());
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
		}
}
}


