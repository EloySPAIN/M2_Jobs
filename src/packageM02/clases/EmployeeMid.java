package packageM02.clases;

public class EmployeeMid extends Employee implements Valida{

	private final double REDUCE = 0.10;
	private double salaryFinal;
	private final double IRPF = 0.15;
	
	public EmployeeMid(String name, double salary, int pagas) {
		super(name, salary, pagas);
	}
	
	public double getReduceSalary() {
		this.salaryFinal = this.salary - this.salary * REDUCE;

		return salaryFinal;
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
			if(super.getSalary() >= 1800 && super.getSalary() <= 2500) {
				super.getSalary();
			} else {
				throw new Exception("El sueldo mínimo de un Mid está en més de 1800 pero menys de 2500€ ");
			}
	}
	
	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario base = " + super.getSalary() + "\nSalario bruto mensual = " + salaryPlus() + 
				"\nEl salario neto mensual es igual a = " + calculaSueldoNeto() + "\nEl salario bruto anual es igual a = " + calculaSalarioBrutoAlAny() + 
				"\nEl salario neto anual a percibir es = " + calculaSueldoNetoAlAny() + "\nEl salario neto + el PLUS_PLANTILLA = " + plantillaBonus();
	}
	
}
