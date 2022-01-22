package packageM02.clases;

public class Boss extends Employees implements Valida{

	private final double PLUS = 0.50;// ATRIBUTO DE LA CLASE MANAGER
	
	public Boss(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double salaryPlus() {
		double plus = this.salary + this.salary * PLUS;
		return plus;
	}

	@Override
	public String toString() {
		return "Nombre = " + super.getName() + " Salario base = " + super.getSalary() + " Salario más plus categoría = " + salaryPlus();
	}

	@Override
	public void validaSueldo() throws Throwable{// CLASE THROWABLE PARA LANZAR A EXCEPCION
			if(super.getSalary() >= 8000) {
				super.getSalary();
			} else {
				throw new Exception("El sueldo para un Jefe debe ser mayor a 8000");
			}
	}
}
