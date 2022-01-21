package packageM02.clases;

public class EmployeeSenior extends Employee implements Valida{

	private final double REDUCE = 0.05;
	private double salaryFinal;
	
	public EmployeeSenior(String name, double salary) {// ATRIBUTOS HEREDADOS
		super(name, salary);
	}

	public double getReduceSalary() {
		if(validaSueldo()) {
			this.salaryFinal = this.salary - this.salary * REDUCE;
		} 
		return salaryFinal;
	}

	@Override
	public boolean validaSueldo() {
		boolean valida = false;
			if(super.getSalary() >= 2700 && super.getSalary() <= 4000) {
				valida = true;
			}		
		return valida;
	}
	
	public String toString() {
		
		return "Nombre " + super.getName() + " Salario = " + super.getSalary() +  " Salario final con reducción por categogía es igual = " + getReduceSalary();
	}
}
