/*
 * tester app to test Employee class
 */
public class EmployeeTester {

	public static void main(String[] args) {
		// create Employee object
		Employee emp1 = new Employee("Don", "SO321321");
		System.out.println(emp1.getName() + " has an employee number of " + emp1.getNumber());
		
		
		Employee emp2 = new Employee("Bob", "WE565656");
		System.out.println(emp2.getName() + " has an employee number of " + emp2.getNumber());

		// Output number of employees
		System.out.println("Number of employees is " + emp1.getNumberOfEmployees());
		
		
		
		// passing object as a parameter
		displayEmployeeInfo(emp2);
		
		
		
	}  // end main

	
	// method used to show example of passing object to method
	public static void displayEmployeeInfo( Employee e ){
		System.out.println(e.getName() + " has an employee number of " + e.getNumber());
	}
	
}
