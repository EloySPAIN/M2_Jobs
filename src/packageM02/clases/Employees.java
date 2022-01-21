package packageM02.clases;

// ATRIBUTOS CLASE ABSTRACTA A HEREDAR
public abstract class Employees {
	protected String name;
	protected double salary;
	
	public Employees() {//POR DEFECTO
		this.name = "";
		this.salary = 0.0;
	}
	
	public Employees(String name) {
		this.name = name;
	}

	public Employees(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	
	public abstract String toString();
	public abstract double salaryPlus();
}
