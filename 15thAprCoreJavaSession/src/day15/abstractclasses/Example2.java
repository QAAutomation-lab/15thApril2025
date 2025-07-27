package day15.abstractclasses;
interface Sample{
	/*
	 * Interface is 100% abstract 
	 * 		+ 
	 * this will help you to achieve multiple inheritance using interface which was not possible using classes
	 * this will also know as incomplete hence its object/instance can;t be created
	 * 
	 * when child class inherits interface that time we should user 'implements' keyword instead of 'extends'
	 * 
	 * when this interface is getting inherited by any child class dn there will be a contract between interface and child class
	 * that contract is, child class has to	override all the abstract method of interface otherwise child class becomes abstract class	
	 * 
	 * this can have
	 * 		variable ---> by default : public static final
	 * 		method   ---> by default : public abstract
	 * can't have
	 * 		constructor
	 * 		static method
	 * 		non-static method 
	 */
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
