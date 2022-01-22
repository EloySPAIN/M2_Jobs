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
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 3000 && super.getSalary() <= 5000) {
				super.getSalary();
			}else {
				throw new Exception("El sueldo m�nimo de un Manager est� en m�s de 3000 per� menys de 5000� ");
			}
	}
	
	@Override
	public String toString() {
		
		return "Nombre = " + super.getName() + "Salario base = " + super.getSalary() + "Salario m�s plus categor�a = " + salaryPlus();
	}

}
