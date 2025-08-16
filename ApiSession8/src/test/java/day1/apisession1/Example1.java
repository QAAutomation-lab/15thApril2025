package day1.apisession1;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void testJSONObject() {
		JSONObject obj=new JSONObject();
		//add required objects
		obj.put("Name", "Advik");
		obj.put("Email", "abc@gmail.com");
		obj.put("Company", "Google");
		System.out.println("JSON Object elements: "+obj);
		System.out.println("values based on JSON key: "+obj.get("Name"));
	}
	
	@Test
	public void convertMapIntoJSONOString() {
		Map obj=new HashMap();
		//add required objects
		obj.put("Name", "Advik");
		obj.put("Email", "abc@gmail.com");
		obj.put("Company", "Google");
		System.out.println("Map Object elements: "+obj);
		System.out.println("values based on Map key: "+obj.get("Name"));
		
		//convert Map into JSONString
		String jString=JSONValue.toJSONString(obj);
		System.out.println("JSON String: "+jString);
	}
	
	@Test
	public void convertJSONOStringIntoJSONObject() {
		String jString="{\"Company\":\"Google\",\"Email\":\"abc@gmail.com\",\"Name\":\"Advik\"}";
		System.out.println("JSONString: "+jString);
		//Convert JSONString into Object
		Object obj=JSONValue.parse(jString);
		//convert Object into JSONObject
		JSONObject jObj=(JSONObject)obj;
		System.out.println("JSONObject elements: "+jObj);
		System.out.println("Compant name: "+jObj.get("Company"));
	}
}
