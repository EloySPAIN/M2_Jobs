package packageM02.clases;

public class EmployeeSenior extends Employee implements Valida{

	private final double REDUCE = 0.05;
	private double salaryFinal;
	
	public EmployeeSenior(String name, double salary) {// ATRIBUTOS HEREDADOS
		super(name, salary);
	}

	public double getReduceSalary() {

		this.salaryFinal = this.salary - this.salary * REDUCE;
		return salaryFinal;
	}

	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 2700 && super.getSalary() <= 4000) {
				super.getSalary();
			} else {
				throw new Exception("El sueldo mínimo de un Senior está en més de 2700 pero menys de 4000€ ");
			}
	}
	
	public String toString() {
		
		return "Nombre " + super.getName() + " Salario = " + super.getSalary() +  " Salario final con reducción por categogía es igual = " + getReduceSalary();
	}
}
