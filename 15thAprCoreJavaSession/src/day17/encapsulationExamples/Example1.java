package day17.encapsulationExamples;
class Demo{
	private int empId=10;
	private double salary=45000.56;
	/*
	 * getter: its a method that will help to access private data member from outside the class
	 * 		access modifier: public
	 * 		return type: based on required private variable
	 * 		name: ideally should start with 'get'
	 * 		argument: NA
	 * 		return value: required private variable
	 */
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	
	/*
	 * setter: its a method that will help to modify private data member from outside the class
	 * 		access modifier: public
	 * 		return type: void
	 * 		name: ideally should start with 'set'
	 * 		argument: based on required private variable
	 * 		return value: NA
	 */
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Demo ref=new Demo();
		//private members are not accessible from outside the class
//		System.out.println("Private empId from Demo class: "+ref.empId);
//		System.out.println("Private salary from Demo class: "+ref.salary);
		
		System.out.println("Private empId from Demo class: "+ref.getEmpId());
		System.out.println("Private salary from Demo class: "+ref.getSalary());
		ref.setEmpId(501);
		ref.setSalary(950000);
		System.out.println("updated, Private empId from Demo class: "+ref.getEmpId());
		System.out.println("updated, Private salary from Demo class: "+ref.getSalary());
		System.out.println("Program Ends");
	}

}
