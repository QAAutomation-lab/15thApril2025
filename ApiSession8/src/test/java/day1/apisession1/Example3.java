package day1.apisession1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class Example3 {

	@Test
	public void sampleJsonArray() {
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
		//write JSON content into file
		
		try {
			FileWriter fw=new FileWriter(".\\src\\test\\resources\\jsonFiles\\UserDetails.json");
			fw.write(jString);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON file ready to use....");
	}
	
	@Test
	public void jsonReaders() throws IOException, ParseException {
		//read JSON content
		FileReader read=new FileReader(".\\src\\test\\resources\\jsonFiles\\UserDetails.json");
		//create instance of JSONParser
		JSONParser jp=new JSONParser();
		//using JOSNParser call parse() to get the content from JSON file in the Object form
		Object obj=jp.parse(read);
		//convert Object into JSONObject
		JSONObject jObj=(JSONObject)obj;
		System.out.println("company: "+jObj.get("Company"));
		System.out.println("email: "+jObj.get("Email"));
		System.out.println("name: "+jObj.get("Name"));
	}
}
