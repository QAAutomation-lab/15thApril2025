package day12.finalkeyword;

public class BlockExample2 {

	{
		System.out.println("*********** I am NSIB-1 *************");
	}
	int age;
	public static void main(String[] args) {
		System.out.println("Program starts");
		BlockExample2 ref1=new BlockExample2();
		System.out.println("NSGV age: "+ref1.age);
		System.out.println("Program ends");
	}
	
	{
		System.out.println("*********** I am NSIB-2 *************");
	}
	{
		System.out.println("*********** I am NSIB-3 *************");
		age=25;
	}
	
	BlockExample2(){
		System.out.println("I am zero-param cons...");
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