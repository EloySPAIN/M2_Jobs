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
				employeeVerified(name);
				break;
			case 2:
				System.out.println("Indique Salario: ");
				double salary1 = ask.nextDouble();
				Manager manager = new Manager(name, salary1);
				try {
					if(manager.validaSueldo()) {
						System.out.println(manager.toString());
					}else {
						System.out.println("El sueldo mínimo de un Manager está en més de 3000 però menys de 5000€ ");
					}
				}catch(Exception ex) {
					System.out.println("El sueldo no es apropiado");
				}
				break;
			case 3:
				System.out.println("Indique Salario: ");
				double salary2 = ask.nextDouble();
				Boss boss = new Boss(name, salary2);
				try {
					if(boss.validaSueldo()) {
						System.out.println(boss.toString());
					}else {
						System.out.println("El sueldo mínimo de un Jefe está en més de 8000€ ");
					}
				}catch(Exception ex) {
					System.out.println("El sueldo no es apropiado");
				}
				break;
			case 4:
				Voluntary voluntary = new Voluntary(name);
				try {
					if(voluntary.validaSueldo()) {
						System.out.println(voluntary.toString());
					}else {
						System.out.println("Los voluntarios no perciben sueldo");
					}
				}catch(Exception ex) {
					System.out.println("El sueldo no es apropiado");
				}
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
		}
}
	
	public static void employeeVerified(String name) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique Tipo de empleado : \n1.Junior :\n2.Senior : \n3.Mid : ");
		int respuesta = ask.nextInt();
		switch(respuesta) {
			case 1:
				System.out.println("Indique Salario: ");
				double salary = ask.nextDouble();
				EmployeeJunior junior = new EmployeeJunior(name, salary);
				try {
					if(junior.validaSueldo()) {
						System.out.println(junior.toString());
					}else {
						System.out.println("El sueldo mínimo de un Junior está en més de 900 pero menys de 1600€ ");
					}
				}catch(Exception ex) {
					System.out.println("El sueldo no es apropiado");
				}
				break;
			case 2:
				System.out.println("Indique Salario: ");
				double salary1 = ask.nextDouble();
				EmployeeSenior senior = new EmployeeSenior(name, salary1);
				try {
					if(senior.validaSueldo()) {
						System.out.println(senior.toString());
					}else {
						System.out.println("El sueldo mínimo de un Senior está en més de 2700 pero menys de 4000€ ");
					}
				}catch(Exception ex) {
					System.out.println("El sueldo no es apropiado");
				}
				break;
			case 3:
				System.out.println("Indique Salario: ");
				double salary2 = ask.nextDouble();
				EmployeeMid mid = new EmployeeMid(name, salary2);
				try {
					if(mid.validaSueldo()) {
						System.out.println(mid.toString());
					}else {
						System.out.println("El sueldo mínimo de un Mid está en més de 1800 pero menys de 2500€ ");
					}
				}catch(Exception ex) {
					System.out.println("El sueldo no es apropiado");
				}
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
	}
}
}


