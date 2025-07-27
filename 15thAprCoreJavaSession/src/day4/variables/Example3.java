package day4.variables;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//declaring variables
		byte var1;
		short var2;
		int var3;
		long var4;
		float var5;
		double var6;
		char var7;
		boolean var8;
		//initialization of variables
		var1=10;//20 | -5 | 100 | -85
		var2=20;//25 | -5 | 100 | -85
		var3=30;//20 | -5 | 100 | -85
		var4=40l;//20 | -5l | 100l | -85
		var5=50.5f;//20 | -5 | 100.5f | -85
		var6=60.56;//20 | -5.6d | 100 | -85.36f
		var7='A';//'d' | '+' | 'S'
		var8=true;//false
//		System.out.println("var1");
//		System.out.println(var1);
				//or
		System.out.println("var1= "+var1);
		
		System.out.println("var2= "+var2);
		System.out.println("var3= "+var3);
		System.out.println("var4= "+var4);
		System.out.println("var5= "+var5);
		System.out.println("var6= "+var6);
		System.out.println("var7= "+var7);
		System.out.println("var8= "+var8);
		//TODO: print remaining variables
		System.out.println("Program ends");
	}
}
/* Output:
 * var1= 10
 * 
 * + :
 * 		Addition when its RGH and LHS both are number
 * 		10+20=30
 * + :
 * 		Concatenation when its RHS/LHS is of String type("")
 * 		"Hello"+10=Hello10
 * 		"25"+10=2510
 * 		"Hi"+10+20="Hi10"+20=Hi1020
 * 		10+20+"Hi"=30Hi
 * 		"Hello"+(10+20)=Hello30
 * 
 */
