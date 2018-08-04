//Employee test class to implement all the methods
public class EmployeeTest {

	// Main method
	public static void main(String[] args) {

		// New object created
		Employee firstEmployee = new Employee();
		System.out.println(firstEmployee);

		// using setter method
		firstEmployee.setId(15526);
		firstEmployee.setMonthlyBasic(17000.0);
		firstEmployee.setName("Alok");

		// Getting the details using getter methods
		System.out.println("Name: " + firstEmployee.getName());
		System.out.println("id: " + firstEmployee.getId());
		System.out.println("Basic Pay: " + firstEmployee.getMonthlyBasic());

		System.out.println("Annual Basic: " + firstEmployee.getAnnualBasic());
		System.out.println("Monthly Gross salary: " + firstEmployee.getMonthlyGrossSalary());
		System.out.println("Annual Gross salary: " + firstEmployee.getAnnualGrossSalary());
		System.out.println("Monthly deduction: " + firstEmployee.getMonthlyDeduction());
		System.out.println("Monthly take home: " + firstEmployee.getMonthlyTakeHome());
		System.out.println("Annual take home: " + firstEmployee.getAnnualTakeHome());

	}

}
