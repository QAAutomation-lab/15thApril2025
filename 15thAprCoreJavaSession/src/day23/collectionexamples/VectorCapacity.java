package day23.collectionexamples;

import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println("Default capacity of vector: "+v1.capacity());//10
		System.out.println("Vector element count: "+v1.size());//0
		v1.setSize(3);
		System.out.println("vector elements are: "+v1);//null,null,null
		System.out.println("Default capacity of vector: "+v1.capacity());//10
		System.out.println("Vector element count: "+v1.size());//3
		v1.add("Mumbai");
		System.out.println("vector elements are: "+v1);//null,null,null,Mumbai
		System.out.println("Default capacity of vector: "+v1.capacity());//10
		System.out.println("Vector element count: "+v1.size());//4
	}
}


