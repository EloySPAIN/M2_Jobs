package packageM02.clases;

import java.util.Scanner;
import packageM02.clases.Employees;

public class mainClass {

	public static void startProgram() throws Throwable {
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
	
	public static void despliegaOpcion(String name) throws Throwable {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique opción : \n1.- Marque 1 para calcular sueldo empleado: \n2.- Marque 2 para calcular sueldo Manager: \n3.- Marque 3 para calcular sueldo Jefe: \n4.- Marque 4 para calcular sueldo voluntario:");
		int respuesta = ask.nextInt();
		switch(respuesta) {
			case 1:
				employeeVerified(name);
				break;
			case 2:
				System.out.println("Indique Salario: ");
				double salary1 = ask.nextDouble();
				try {
					Manager manager = new Manager(name, salary1);
					manager.validaSueldo();
					System.out.println(manager.toString());
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case 3:
				System.out.println("Indique Salario: ");
				double salary2 = ask.nextDouble();
				try {
					Boss boss = new Boss(name, salary2);
					boss.validaSueldo();
					System.out.println(boss.toString());
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case 4:
				try {
					Voluntary voluntary = new Voluntary(name);
					voluntary.validaSueldo();
					System.out.println(voluntary.toString());
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
		}
}
	
	public static void employeeVerified(String name) throws Throwable {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique Tipo de empleado : \n1.Junior :\n2.Senior : \n3.Mid : ");
		int respuesta = ask.nextInt();
		switch(respuesta) {
			case 1:
				System.out.println("Indique Salario: ");
				double salary = ask.nextDouble();
				try {
					EmployeeJunior junior = new EmployeeJunior(name, salary);
					junior.validaSueldo();
					System.out.println(junior.toString());
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case 2:
				System.out.println("Indique Salario: ");
				double salary1 = ask.nextDouble();
				try {
					EmployeeSenior senior = new EmployeeSenior(name, salary1);
					senior.validaSueldo();
					System.out.println(senior.toString());
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case 3:
				System.out.println("Indique Salario: ");
				double salary2 = ask.nextDouble();
				try {
					EmployeeMid mid = new EmployeeMid(name, salary2);
					mid.validaSueldo();
					System.out.println(mid.toString());
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
	}
}
}


