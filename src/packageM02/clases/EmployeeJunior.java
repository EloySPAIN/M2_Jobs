package packageM02.clases;

import packageM02.Interfaces.Valida;

public class EmployeeJunior extends Employee implements Valida{

	private final double IRPF = 0.02;
	private final double REDUCE = 0.15;//REDUCCION DEL 15 POR CONCEPTO CATEGORÍA

	public EmployeeJunior(String name, double salary, int pagas) {
		super(name, salary, pagas);//SE DEBEN DE SETTEAR LOS ATRIBUTOS SUELDO ACTUALIZANDO SEGÚN CADA CONDICIÓN
		this.setPlusSalaryByCategory(salary,REDUCE);
		this.setSalaryTotal(IRPF);
		this.setRawYearSalary();
		this.setSalaryYear();
		this.setSalaryPlusPlantilla();
	}

	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 900 && super.getSalary() <= 1600) {
				super.getSalary();
			}else {
				throw new Exception("El sueldo mínimo de un Junior está en més de 900 pero menys de 1600€ ");
			}
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario bruto mensual = " + this.plusSalaryByCategory + 
				"\nEl salario neto mensual es igual a = " + this.salaryTotal + "\nEl salario bruto anual es igual a = " + this.rawYearSalary + 
				"\nEl salario neto anual a percibir es = " + this.salaryYear + "\nEl salario neto + el PLUS_PLANTILLA = " + this.salaryPlusPlantilla;
	}
}
