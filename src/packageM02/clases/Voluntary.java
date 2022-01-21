package packageM02.clases;

public class Voluntary extends Employees{

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

}
