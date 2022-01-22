package packageM02.clases;

public class EmployeeMid extends Employee implements Valida{

	private final double REDUCE = 0.10;
	private double salaryFinal;
	
	public EmployeeMid(String name, double salary) {
		super(name, salary);
	}
	
	public double getReduceSalary() {
		this.salaryFinal = this.salary - this.salary * REDUCE;

		return salaryFinal;
	}

	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 1800 && super.getSalary() <= 2500) {
				super.getSalary();
			} else {
				throw new Exception("El sueldo mínimo de un Mid está en més de 1800 pero menys de 2500€ ");
			}
	}
	
	public String toString() {
		
		return "Nombre " + super.getName() + " Salario = " + super.getSalary() +  " Salario final con reducción por categogía es igual = " + getReduceSalary();
	}
	
}
