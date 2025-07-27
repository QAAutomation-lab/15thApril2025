package day12.finalkeyword;

public class BlockExample4 {
	final static int num1;
	final int num2;
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("num1: "+num1);
		BlockExample4 ref1=new BlockExample4();
		System.out.println("num2: "+ref1.num2);
		System.out.println("Program ends");
	}
	
	static{
		System.out.println("*********** I am SIB-1 *************");
		num1=10;
	}
	{
		System.out.println("*********** I am NSIB-1 *************");
	}
	BlockExample4(){
		System.out.println("I am zero-param cons...");
		num2=20;
	}
}
/*
Block:
	contains set of statements, these block doesn't have any name and return type
	type:
		1. SIB: these block gets executed before main()
				a class can have multiple SIB, in this all SIB will be executed in sequential order
				using these block you can initialize a variable as well as you can call methods also
		2. NSIB:
				these block gets executed for each instance creation before constructor
				a class can have multiple NSIB, in this all NSIB will be executed in sequential order for each instance creation
				using these block you can initialize a variable as well as you can call methods also
		static {
			//statements - static block/SIB(Static initialization block)
		}
		
		
		{
			//statements - non-static block/NSIB/IIB(Instance Initialization block)
		}



*/