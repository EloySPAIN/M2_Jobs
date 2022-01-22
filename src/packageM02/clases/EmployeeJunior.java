package packageM02.clases;

public class EmployeeJunior extends Employee implements Valida{

	private final double REDUCE = 0.15;
	private double salaryFinal;
	
	public EmployeeJunior(String name, double salary) {
		super(name, salary);
	}

	public double getReduceSalary() {

		this.salaryFinal = this.salary - this.salary * REDUCE;
		return salaryFinal;
	}

	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 900 && super.getSalary() <= 1600) {
				super.getSalary();
			}else {
				throw new Exception("El sueldo mínimo de un Junior está en més de 900 pero menys de 1600€ ");
			}
	}
	
	public String toString() {
		
		return "Nombre " + super.getName() + " Salario = " + super.getSalary() +  " Salario final con reducción por categogía es igual = " + getReduceSalary();
	}
}
