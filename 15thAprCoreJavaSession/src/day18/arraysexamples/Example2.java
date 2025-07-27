package day18.arraysexamples;

public class Example2 {

	public static void main(String[] args) {
		int num[]= {10,20,30};
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
