package day14.overridingexamples;

class Animal6 {
	String color = "white of red";
}
class Dog6 extends Animal6 {
	String color = "black";
	void printColor() {
		System.out.println("Dog color is : "+color);// prints color of Dog class	
//		Animal6 ref=new Animal6();
//		System.out.println("Animal color is: "+ref.color);
				//or
		System.out.println("Animal color is: "+super.color);// prints color of Animal class
	}
}
class SuperKeyWord1 {
	public static void main(String args[]) {
		Dog6 d = new Dog6();
		d.printColor();		
	}
}
/*
super keyword: is an instance of immediate parent class
	which will help us to access parent class non-static member from child class when they have 
	common name.


*/