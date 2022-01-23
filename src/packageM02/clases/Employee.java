package packageM02.clases;

public class Employee extends Employees{

	private final double PLUS = 0.15;
	
	public Employee(String name, double salary, int pagas) {
		super(name, salary, pagas);
	}
	
	@Override
	public double salaryPlus() {
		double plus = this.salary + this.salary * PLUS;
		return plus;
	}
	
	// NO SE IMPLEMENTAN LOS MÉTODOS YA QUE LO SOBREESCRIBIRAN LAS HIJAS
	@Override
	public double calculaSueldoNeto() {
		return PLUS;
		}
	
	@Override
	public double calculaSalarioBrutoAlAny() {
		return PLUS;
	}

	@Override
	public double calculaSueldoNetoAlAny() {
		return PLUS;
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + " Salario base = " + super.getSalary() + " Salario bruto mensual = " + salaryPlus();
	}

}
