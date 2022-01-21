package packageM02.clases;

public class EmployeeMid extends Employee implements Valida{

	private final double REDUCE = 0.10;
	private double salaryFinal;
	
	public EmployeeMid(String name, double salary) {
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
			if(super.getSalary() >= 1800 && super.getSalary() <= 2500) {
				valida = true;
			}		
		return valida;
	}
	
	public String toString() {
		
		return "Nombre " + super.getName() + " Salario = " + super.getSalary() +  " Salario final con reducción por categogía es igual = " + getReduceSalary();
	}
	
}
