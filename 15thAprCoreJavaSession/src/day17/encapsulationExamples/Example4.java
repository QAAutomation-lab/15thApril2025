package day17.encapsulationExamples;
class Demo3{
	private int empId=10;
	private double salary=45000.56;
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Demo3 ref=new Demo3();
		//private members are not accessible from outside the class
//		System.out.println("Private empId from Demo class: "+ref.empId);
//		System.out.println("Private salary from Demo class: "+ref.salary);
		ref.setEmpId(501);
		ref.setSalary(950000);
		System.out.println("Program Ends");
	}

}
