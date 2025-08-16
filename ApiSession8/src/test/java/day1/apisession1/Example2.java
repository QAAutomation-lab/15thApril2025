package day1.apisession1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example2 {

	@Test
	public void sampleJsonArray() {
		JSONArray jArray=new JSONArray();
		jArray.add("Apple");
		jArray.add("Orange");
		jArray.add("Banana");
		jArray.add("Mango");
		System.out.println("JSONArray elements: "+jArray);
	}
	
	@Test
	public void sampleJsonArray2() {
		JSONObject obj1=new JSONObject();
		//add required objects
		obj1.put("Name", "Advik");
		obj1.put("Email", "abc@gmail.com");
		obj1.put("Company", "Google");
		JSONObject obj2=new JSONObject();
		//add required objects
		obj2.put("Name", "KK");
		obj2.put("Email", "xyz@gmail.com");
		obj2.put("Company", "Apple");
		System.out.println("JSONObject1: "+obj1);
		System.out.println("JSONObject2: "+obj2);
		System.out.println("***************************************************");
		//Adding existing JSONObject into another JSONObject as value
		JSONObject obj3=new JSONObject();
		//add required objects
		obj3.put("emp", obj1);
		//Adding existing JSONObject into another JSONObject as value
		JSONObject obj4=new JSONObject();
		//add required objects
		obj4.put("emp", obj2);
		System.out.println("JSONObject3: "+obj3 );
		System.out.println("JSONObject4: "+obj4 );
		System.out.println("***************************************************");
		JSONArray jArray=new JSONArray();
		jArray.add(obj3);
		jArray.add(obj4);
		System.out.println("JOSN Array: "+jArray);
	}
}
