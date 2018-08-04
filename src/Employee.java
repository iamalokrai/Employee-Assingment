//Class emplyee created having its behaviours and properties
public class Employee {

	private int id;
	private String name;
	private double monthlyBasic;

	// Constructor initializing the monthlybasic as 1000
	public Employee() {
		monthlyBasic = 1000.0;
	}

	// Getter method for id
	public int getId() {
		return id;
	}

	// setter method for id
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public double getAnnualBasic() {

		return (12.0 * monthlyBasic);
	}

	public double getMonthlyGrossSalary() {

		double hra = monthlyBasic / 2;
		double medicalAllowance = 1250.0;
		double conveyanceAllowance = 800.0;

		return (monthlyBasic + hra + medicalAllowance + conveyanceAllowance);

	}

	public double getAnnualGrossSalary() {

		return (12.0 * getMonthlyGrossSalary());
	}

	public double getMonthlyDeduction() {

		double pf, esic = 0, professionalTax;
		if ((0.1 * monthlyBasic) > 6500) {
			pf = 6500.0;
		} else
			pf = 0.1 * monthlyBasic;

		if (monthlyBasic <= 5000)
			esic = 0.475 * monthlyBasic;

		if (getMonthlyGrossSalary() <= 10000)
			professionalTax = 50.0;
		else
			professionalTax = 100.0;

		return (pf + esic + professionalTax);
	}

	public double getMonthlyTakeHome() {

		return (getMonthlyGrossSalary() - getMonthlyDeduction());
	}

	public double getAnnualTakeHome() {

		return (12 * getMonthlyTakeHome());
	}

	// Overriding toString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", monthlyBasic=" + monthlyBasic + "]";
	}

}
