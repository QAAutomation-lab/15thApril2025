package day1.apisession1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class Example4 {

	
	@Test
	public void jsonReaders() throws IOException, ParseException {
		//read JSON content
		FileReader read=new FileReader(".\\src\\test\\resources\\jsonFiles\\file.json");
		//create instance of JSONParser
		JSONParser jp=new JSONParser();
		//using JOSNParser call parse() to get the content from JSON file in the Object form
		Object obj=jp.parse(read);
		//convert Object into JSONArray
		JSONArray array=(JSONArray)obj;
		int i=1;
		for(Object ref:array) {
			System.out.println(ref);
			//convert Object into JSONObject
			JSONObject j1=(JSONObject)ref;
			//get object value based on key in the form Object
			Object ref1=j1.get("emp"+i);
			//convert Object into JSONObject
			JSONObject j2=(JSONObject)ref1;
			System.out.println("company: "+j2.get("Company"));
			System.out.println("email: "+j2.get("Email"));
			System.out.println("name: "+j2.get("Name"));
			System.out.println("**********************************");
			i++;
		}
	}
}
