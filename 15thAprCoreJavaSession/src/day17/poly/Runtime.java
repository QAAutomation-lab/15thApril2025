package day17.poly;
class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void walking() {
		System.out.println("Carnivores walking");
	}
}
public class Runtime {
	public static void main(String args[]) {
		Animal A = new Animal();
		A.eat();// Animals Eat
		Animal h = new herbivores(); // runtime poly- inheritance+upcasting+overring
		h.eat();// 
		Animal o = new omnivores(); // runtime poly- inheritance+upcasting+overring 
		o.eat();// 
		Animal c = new carnivores(); // not a runtime poly- inheritance+upcasting+ no overring
		c.eat();//
	}
}
/**
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */