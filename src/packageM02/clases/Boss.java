package packageM02.clases;

public class Boss extends Employees implements Valida{

	private final double PLUS = 0.50;// ATRIBUTO DE LA CLASE MANAGER
	private final double IRPF = 0.32;// IRPF COMO CONSTANTE PARA IMPLEMENTAR EN CADA CLASE
	
	public Boss(String name, double salary, int pagas) {
		super(name, salary, pagas);
	}

	@Override
	public double salaryPlus() {// SALARIO BRUTO (CALCULADO SEGUN EL PLUS CATEGORIA APLICADO AL SALARIO BASE)
		double plus = this.salary + this.salary * PLUS;
		return plus;
	}
	
	//MÉTODO QUE CALCULA EL SUELDO NETO MENSUAL, RESTANDO EL IRPF SEGÚN CATEGORÍA
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
	public String toString() {
		return "Nombre = " + super.getName() + "\nSalario base = " + super.getSalary() + "\nSalario bruto mensual = " + salaryPlus() + 
				"\nEl salario neto mensual es igual a = " + calculaSueldoNeto() + "\nEl salario bruto anual es igual a = " + calculaSalarioBrutoAlAny() + 
				"\nEl salario neto anual a percibir es = " + calculaSueldoNetoAlAny() + "\nEl salario neto + el PLUS_PLANTILLA = " + plantillaBonus();
	}

	//EXCEPCION A DISPARAR EN CASO DE NO CUMPLIRSE LOS PARÁMETROS DEL SUELDO
	@Override
	public void validaSueldo() throws Throwable{// CLASE THROWABLE PARA LANZAR A EXCEPCION
			if(super.getSalary() >= 8000) {
				super.getSalary();
			} else {
				throw new Exception("El sueldo para un Jefe debe ser mayor a 8000");
			}
	}

	//MÉTODO PLUS PLANTILLA, DERIVA DE LA INTERFACE
	@Override
	public double plantillaBonus() {
		this.salaryPlusPlantilla = this.salaryYear + this.salaryYear * PLUS_PLANTILLA;
		return this.salaryPlusPlantilla;
	}
}
