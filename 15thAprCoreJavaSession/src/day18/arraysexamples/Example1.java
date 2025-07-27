package day18.arraysexamples;

public class Example1 {

	public static void main(String[] args) {
	//	int num1=10,num2=20,num3=30,num4=40;

//		int[] num;//array declaration
	//	num=new int[3];//array initialization
			//or declaration + initialization
		
		int[] num=new int[3];	
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		num[0]=10;
		num[1]=20;
		num[2]=30;
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
		System.out.println("Elements in array: "+num.length);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("***********Array Element with for-each loop**************");
		/*
		    for(LHS :  RHS){
		    
		    }	
		    RHS: will be an array name
		    LHS: a variable of type same as array type defined in RHS
		 */
		for(int x : num) {
			System.out.println(x);
		}
	}

}
