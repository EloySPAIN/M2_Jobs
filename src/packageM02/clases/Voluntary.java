package packageM02.clases;

public class Voluntary extends Employees implements Valida{

	private boolean response = false; //ATRIBUTO QUE VERIFICA SI RECIBE O NO AYUDA DEL GOBIERNO
	private final double HELP = 300;
	
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
		return "Nombre = " + super.getName() + "\nSalario base = " + super.getSalary() + "\nLos voluntarios no perciben sueldo, solo una ayuda gubernamental por = " + calculaSueldoNeto() + "\nLa ayuda asciende anualmente  a = " + calculaSueldoNetoAlAny();
	}

	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() == 0) {
				super.getSalary();
			} else {
				throw new Exception("Los voluntarios no perciben sueldo");
			}
	}

	public boolean getResponse(int respuesta) {
		if(respuesta == 1) {
			this.response = true;
		}	
		return this.response;
	}
	
	@Override
	public double plantillaBonus() {
		return 0.0;
	}

	@Override
	public double calculaSalarioBrutoAlAny() {
		if(this.response) {
			return HELP;
		} 
		return 0.0;
	}

	@Override
	public double calculaSueldoNeto() {
		if(this.response) {
			return HELP;
		} 
		return 0.0;
	}

	@Override
	public double calculaSueldoNetoAlAny() {
		double ayuda = HELP * 12;
		if(this.response) {
			return ayuda;
		} 
		return 0.0;
	}
}
