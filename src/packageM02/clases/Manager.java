package packageM02.clases;

public class Manager extends Employees implements Valida{

	private final double PLUS = 0.10;// ATRIBUTO DE LA CLASE MANAGER
	private final double IRPF = 0.26;
	
	public Manager(String name, double salary, int pagas) {
		super(name, salary, pagas);
	}

	@Override
	public double salaryPlus() {
		double plus = this.salary + this.salary * PLUS;
		return plus;
	}
	
	@Override
	public double calculaSueldoNeto() {
		this.salaryTotal = salaryPlus() - salaryPlus() * IRPF;
		return this.salaryTotal;
	}
	
	@Override
	public double calculaSalarioBrutoAlAny() {//MÉTODO QUE ESTABLECE EL SALARIO BRUTO MENSUAL SIN APLICAR EL IRPF
		this.rawYearSalary = salaryPlus() * this.pagas;
		return this.rawYearSalary;
	}
	
	@Override
	public double calculaSueldoNetoAlAny() {// MÉTODO QUE ESTABLECE EL SUELDO NETO AL AÑO CALCULANDO EL NETO MENSUAL * NUMERO DE PAGAS
		this.salaryYear = this.salaryTotal * pagas;
		return this.salaryYear;
	}
	
	@Override
	public double plantillaBonus() {
		this.salaryPlusPlantilla = this.salaryYear + this.salaryYear * PLUS_PLANTILLA;
		return this.salaryPlusPlantilla;
	}
	
	@Override
	public void validaSueldo() throws Throwable {
			if(super.getSalary() >= 3000 && super.getSalary() <= 5000) {
				super.getSalary();
			}else {
				throw new Exception("El sueldo mínimo de un Manager está en més de 3000 però menys de 5000€ ");
			}
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario base = " + super.getSalary() + "\nSalario bruto mensual = " + salaryPlus() + 
				"\nEl salario neto mensual es igual a = " + calculaSueldoNeto() + "\nEl salario bruto anual es igual a = " + calculaSalarioBrutoAlAny() + 
				"\nEl salario neto anual a percibir es = " + calculaSueldoNetoAlAny() + "\nEl salario neto + el PLUS_PLANTILLA = " + plantillaBonus();
	}

}
