package packageM02.clases;

public class EmployeeJunior extends Employee implements Valida{

	private final double REDUCE = 0.15;
	private double salaryFinal;
	
	public EmployeeJunior(String name, double salary) {
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
			if(super.getSalary() >= 900 && super.getSalary() <= 1600) {
				valida = true;
			}		
		return valida;
	}
	
	public String toString() {
		
		return "Nombre " + super.getName() + " Salario = " + super.getSalary() +  " Salario final con reducción por categogía es igual = " + getReduceSalary();
	}
}
