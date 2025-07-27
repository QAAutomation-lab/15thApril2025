package day23.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList r1=new ArrayList();
			//or
		List l1=new ArrayList();// Recommended
		//add element in arraylist
		l1.add("Pune");//Auto Upcasting: String will be converted into Object class object
		l1.add(123);//Boxing(Integer class object), dn implicit upcasting for Object class object
		l1.add('a');//Boxing(Integer class object), dn implicit upcasting for Object class object
		l1.add("Pune");
		l1.add(null);
		System.out.println("ArrayList elements: "+l1);
		System.out.println("Element index 1: "+l1.get(1));
		System.out.println("Element count in ArrayList : "+l1.size());
		l1.add(2, "Mumbai");
		System.out.println("Updated, ArrayList elements: "+l1);
		l1.set(4, "Apple");
		System.out.println("Updated, ArrayList elements: "+l1);
		System.out.println("Removing index 5th element: "+l1.remove(5));
		System.out.println("Updated, ArrayList elements after removing 5th index element: "+l1);
		System.out.println("Removing 'Mumbai' from list: "+l1.remove("Mumbai"));
		System.out.println("Updated, ArrayList elements after removing 'Mumbai' list elements are: "+l1);
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("**************Print ArrayList Elements using for-each****************");
		for(Object obj:l1) {
			System.out.println(obj);
		}
		System.out.println("**************Print ArrayList Elements using Iterator****************");
		/*
		 * iterator(): its a method that will return Iterator interface reference using which we can iterate any collection without index
		 * 
		 * Iterator interface has below method
		 * 		hasNext(): this will check whether collection has next element or not, if yes returns true, else returns false
		 * 		next(): this will get the next element from the collection, if there is no next element dn it will return null pointer exception
		 * 		remove(): this will help to remove the element from the collection
		 * 
		 * NOTE: iterator object can be used only once, for 2nd iteration you have to create new object
		 */
		Iterator itr=l1.iterator();
//		System.out.println(itr.next());//Pune
//		System.out.println(itr.next());//123
//		System.out.println(itr.next());//a
//		System.out.println(itr.next());//Apple
		//System.out.println(itr.next());//NullPointerException
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After iteration is over, and you are still trying to use same instance: "+itr.hasNext());
		
		Iterator itr2=l1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
