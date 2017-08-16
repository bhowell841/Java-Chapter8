/*
 * Employee class to show example of static fields
 */
public class Employee {

	// declare static field to keep track of the number of employees
	private static int numberOfEmployees = 0;
	
	// declare instance variables
	String empName;
	String empNumber;
	
	// constructor
	public Employee( String name, String numb){
		empName = name;
		empNumber = numb;
		numberOfEmployees++;
	}  // end constructor
	
	
	public void setName( String name ){
		empName = name;
	}
	
	public String getName(){
		return empName;
	}
	
	public void setEmpNumber( String numb ){
		empNumber = numb;
	}
	
	public String getNumber(){
		return empNumber;
	}
	
	public int getNumberOfEmployees(){
		return numberOfEmployees;
	}
	
}
