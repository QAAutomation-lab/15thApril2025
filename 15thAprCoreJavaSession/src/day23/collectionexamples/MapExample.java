package day23.collectionexamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map m1=new HashMap();
		m1.put("key1", "admin");//upcasting
		m1.put("key2", "admin");//upcasting
		m1.put(null, "admin123");//upcasting
		System.out.println("Map elements are: \n"+m1);
		System.out.println("Map element count: \n"+m1.size());
		m1.put("key2", "manager");
		m1.put(458, "manager");
		m1.put(null, 1234);//boxing dn upcasting
		System.out.println("Map elements are: \n"+m1);
		System.out.println("Map element count: \n"+m1.size());
		System.out.println("Get the key value: \n"+m1.get("key2"));
		System.out.println("key set of map: \n"+m1.keySet());
		System.out.println("values of map: \n"+m1.values());		
	}
}
/**
 * to add any element in Map we need use put(key,value) , key and Value both should be Object
 * toString() is overrided here as well
 * to get only keys from map use getKeys()
 * to get only values from Map use values()
 * if you want get a particular Key value dn use get(key)
 */ 
