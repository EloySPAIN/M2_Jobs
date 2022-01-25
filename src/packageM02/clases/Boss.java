package packageM02.clases;

import packageM02.Interfaces.Valida;

public class Boss extends Employee implements Valida{

	private final double PLUS_BOSS = 0.50;// ATRIBUTO DE LA CLASE MANAGER
	private final double IRPF = 0.32;// IRPF COMO CONSTANTE PARA IMPLEMENTAR EN CADA CLASE
	
	public Boss(String name, double salary, int pagas) {
		super(name, salary, pagas);//SE DEBEN DE SETTEAR LOS ATRIBUTOS SUELDO ACTUALIZANDO SEGÚN CADA CONDICIÓN
		this.setPlusSalaryByCategory(PLUS_BOSS);
		this.setSalaryTotal(IRPF);
		this.setRawYearSalary();
		this.setSalaryYear();
		this.setSalaryPlusPlantilla();
	}

	//EXCEPCION A DISPARAR EN CASO DE NO CUMPLIRSE LOS PARÁMETROS DEL SUELDO
	@Override
	public void validaSueldo() throws Throwable{// CLASE THROWABLE PARA LANZAR A EXCEPCION
			if(this.plusSalaryByCategory >= 8000) {
				super.getPlusSalaryByCategory();
			} else {
				throw new Exception("El sueldo para un Jefe debe ser mayor a 8000");
			}
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario bruto mensual = " + this.plusSalaryByCategory + 
				"\nEl salario neto mensual es igual a = " + this.salaryTotal + "\nEl salario bruto anual es igual a = " + this.rawYearSalary + 
				"\nEl salario neto anual a percibir es = " + this.salaryYear + "\nEl salario neto + el PLUS_PLANTILLA = " + this.salaryPlusPlantilla;
	}	
}
