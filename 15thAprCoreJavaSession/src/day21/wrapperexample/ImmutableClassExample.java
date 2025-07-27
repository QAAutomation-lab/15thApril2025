package day21.wrapperexample;
final class Demo{
	final String name;
	final int empID;
	Demo(String name, int empID){
		this.name=name;
		this.empID=empID;
	}
	public String getName() {
		return name;
	}
	public int getEmpID() {
		return empID;
	}
}
public class ImmutableClassExample {

	public static void main(String[] args) {
		Demo d1=new Demo("Pune",101);
		System.out.println(d1.getEmpID());
		System.out.println(d1.getName());
		
//		d1.empID=201;
//		d1.name="Mumbai";

		Demo d2=new Demo("Mumbai",102);
		System.out.println(d2.getEmpID());
		System.out.println(d2.getName());
	}

}
