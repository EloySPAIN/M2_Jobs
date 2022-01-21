package packageM02.clases;

public class Voluntary extends Employees implements Valida{

	public Voluntary(String name) {
		super(name);
	}

	@Override
	public double salaryPlus() {
		System.out.println("Los voluntarios no perciben sueldo alguno");
		return 0;
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + salaryPlus();
	}

	@Override
	public boolean validaSueldo() {
		boolean valida = false;
			if(super.getSalary() == 0) {
				valida = true;
			}		
		return valida;
	}
}
