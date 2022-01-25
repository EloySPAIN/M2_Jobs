package packageM02.clases;

import packageM02.Interfaces.Valida;

public class EmployeeMid extends Employee implements Valida{

	private final double REDUCE = 0.10;
	private final double IRPF = 0.15;
	
	public EmployeeMid(String name, double salary, int pagas) {
		super(name, salary, pagas);//SE DEBEN DE SETTEAR LOS ATRIBUTOS SUELDO ACTUALIZANDO SEGÚN CADA CONDICIÓN
		this.setPlusSalaryByCategory(salary,REDUCE);
		this.setSalaryTotal(IRPF);
		this.setRawYearSalary();
		this.setSalaryYear();
		this.setSalaryPlusPlantilla();
	}

	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 1800 && super.getSalary() <= 2500) {
				super.getSalary();
			} else {
				throw new Exception("El sueldo mínimo de un Mid está en més de 1800 pero menys de 2500€ ");
			}
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario bruto mensual = " + this.plusSalaryByCategory + 
				"\nEl salario neto mensual es igual a = " + this.salaryTotal + "\nEl salario bruto anual es igual a = " + this.rawYearSalary + 
				"\nEl salario neto anual a percibir es = " + this.salaryYear + "\nEl salario neto + el PLUS_PLANTILLA = " + this.salaryPlusPlantilla;
	}
}
