package packageM02.clases;

import packageM02.Interfaces.Valida;

public class EmployeeSenior extends Employee implements Valida{

	private final double REDUCE = 0.05;
	private final double IRPF = 0.24;
	
	public EmployeeSenior(String name, double salary, int pagas) {// ATRIBUTOS HEREDADOS
		super(name, salary, pagas);
		this.setPlusSalaryByCategory(salary,REDUCE);
		this.setSalaryTotal(IRPF);
		this.setRawYearSalary();
		this.setSalaryYear();
		this.setSalaryPlusPlantilla();
	}
	
	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 2700 && super.getSalary() <= 4000) {
				super.getSalary();
			} else {
				throw new Exception("El sueldo mínimo de un Senior está en més de 2700 pero menys de 4000€ ");
			}
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario bruto mensual = " + this.plusSalaryByCategory + 
				"\nEl salario neto mensual es igual a = " + this.salaryTotal + "\nEl salario bruto anual es igual a = " + this.rawYearSalary + 
				"\nEl salario neto anual a percibir es = " + this.salaryYear + "\nEl salario neto + el PLUS_PLANTILLA = " + this.salaryPlusPlantilla;
	}
}
