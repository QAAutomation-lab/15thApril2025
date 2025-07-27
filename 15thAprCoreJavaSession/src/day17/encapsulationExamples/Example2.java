package day17.encapsulationExamples;
class Demo1{
	private int empId=10;
	private double salary=45000.56;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Demo1 ref=new Demo1();
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
