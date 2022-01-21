package packageM02.clases;

public class Manager extends Employees implements Valida{

	private final double PLUS = 0.10;// ATRIBUTO DE LA CLASE MANAGER
	
	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double salaryPlus() {
		double plus = this.salary + this.salary * PLUS;
		return plus;
	}
	
	@Override
	public boolean validaSueldo() {
		boolean valida = false;
			if(super.getSalary() >= 3000 && super.getSalary() <= 5000) {
				valida = true;
			}		
		return valida;
	}
	
	@Override
	public String toString() {
		
		return "Nombre = " + super.getName() + "Salario base = " + super.getSalary() + "Salario más plus categoría = " + salaryPlus();
	}

}
