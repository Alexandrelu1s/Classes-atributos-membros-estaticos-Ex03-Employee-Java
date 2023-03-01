package entities;

public class Employee {
	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Employee(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public Double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(Double percentage) {
		Double value = grossSalary * (percentage/100.0);
		this.grossSalary += value;
	}
	
	@Override
	public String toString() {
		return name + ", $ " + netSalary();
	}
}
