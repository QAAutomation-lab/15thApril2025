package day17.encapsulationExamples;
class Demo2{
	private int empId=10;
	private double salary=45000.56;
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Demo2 ref=new Demo2();
		//private members are not accessible from outside the class
//		System.out.println("Private empId from Demo class: "+ref.empId);
//		System.out.println("Private salary from Demo class: "+ref.salary);
		
		System.out.println("Private empId from Demo class: "+ref.getEmpId());
		System.out.println("Private salary from Demo class: "+ref.getSalary());
		System.out.println("Program Ends");
	}

}
