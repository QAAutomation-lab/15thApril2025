package day17.encapsulationExamples;
class vehicle{
	void running() {
		System.out.println("I am driving vehicle");
	}
}
class bus extends vehicle{
	void speed() {
		System.out.println("Bus speed is 120km/hr");
	}
}
public class NonPrimitiveCasting1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
//		bus b1=new bus();
		vehicle v1=new bus();//upcasting ->implicit/auto->compile-->vehicle v1=(vehicle)new bus();
		v1.running();
		
		bus b1=(bus)v1;//downcasting --> explicit, only upcasted object can be downcasted
		b1.running();
		b1.speed();
		//bus b2=new vehicle();//downcasting ---> directly its not possible
		System.out.println("Program Ends");
	}
}
