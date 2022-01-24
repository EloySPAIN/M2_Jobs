package packageM02.clases;

import packageM02.Interfaces.Valida;

public class Manager extends Employee implements Valida{

	private final double PLUS = 0.10;// ATRIBUTO DE LA CLASE MANAGER
	private final double IRPF = 0.26;
	
	public Manager(String name, double salary, int pagas) {
		this.setPlusSalaryByCategory(PLUS);
		this.setSalaryTotal(IRPF);
		this.setRawYearSalary();
		this.setSalaryYear();
		this.setSalaryPlusPlantilla();
	}

	@Override
	public void validaSueldo() throws Throwable {
			if(this.plusSalaryByCategory >= 3000 && this.plusSalaryByCategory <= 5000) {
				super.getPlusSalaryByCategory();
			}else {
				throw new Exception("El sueldo mínimo de un Manager está en més de 3000 però menys de 5000€ ");
			}
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario bruto mensual = " + this.plusSalaryByCategory + 
				"\nEl salario neto mensual es igual a = " + this.salaryTotal + "\nEl salario bruto anual es igual a = " + this.rawYearSalary + 
				"\nEl salario neto anual a percibir es = " + this.salaryYear + "\nEl salario neto + el PLUS_PLANTILLA = " + this.salaryPlusPlantilla;
	}	
}
