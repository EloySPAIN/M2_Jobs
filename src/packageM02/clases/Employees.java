package packageM02.clases;

// ATRIBUTOS CLASE ABSTRACTA A HEREDAR
public abstract class Employees {
	protected String name;
	protected int pagas;
	protected double salary;
	protected double salaryTotal;//NETO MENSUAL
	protected double salaryYear;//NETO ANUAL
	protected double rawYearSalary;//BRUTO ANUAL
	protected double salaryPlusPlantilla;
	
	public Employees() {//POR DEFECTO
		this.name = "";
		this.salary = 0.0;
		this.salaryTotal = 0.0;
		this.salaryYear = 0.0;
		this.rawYearSalary = 0.0;
		this.salaryPlusPlantilla = 0.0;
	}
	
	public Employees(String name) {
		this.name = name;
	}

	public Employees(String name, double salary, int pagas) {
		super();
		this.name = name;
		this.salary = salary;
		this.pagas = pagas;
	}

	
	public int getPagas() {
		return pagas;
	}

	public void setPagas(int pagas) {
		this.pagas = pagas;
	}

	public double getSalaryTotal() {
		return salaryTotal;
	}

	public void setSalaryTotal(double salaryTotal) {
		this.salaryTotal = salaryTotal;
	}

	public double getSalaryYear() {
		return salaryYear;
	}

	public void setSalaryYear(double salaryYear) {
		this.salaryYear = salaryYear;
	}

	public double getRawYearSalary() {
		return rawYearSalary;
	}

	public void setRawYearSalary(double rawYearSalary) {
		this.rawYearSalary = rawYearSalary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalaryPlusPlantilla() {
		return salaryPlusPlantilla;
	}

	public void setSalaryPlusPlantilla(double salaryPlusPlantilla) {
		this.salaryPlusPlantilla = salaryPlusPlantilla;
	}

	public abstract double calculaSalarioBrutoAlAny();
	public abstract double calculaSueldoNeto();
	public abstract double calculaSueldoNetoAlAny();
	public abstract String toString();
	public abstract double salaryPlus();
}
