package packageM02.clases;

public class Employee extends Employees{

	private final double PLUS = 0.15;
	
	public Employee(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double salaryPlus() {
		double plus = this.salary + this.salary * PLUS;
		return plus;
	}

	@Override
	public String toString() {
		
		return "Nombre = " + super.getName() + "Salario base = " + super.getSalary() + "Salario más plus categoría = " + salaryPlus();
	}

}
