package day2.jsonAndSerializationPojo;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Example3 {
  @Test
  public void getUserDetails() {
	  
	  		//Step1: form base url
			RestAssured.baseURI="https://coderbyte.com";
			//Step2: define what is known for you
			RequestSpecification req=RestAssured.given().header("Content-type","application/json")
							   .contentType(ContentType.JSON)
							   .accept(ContentType.JSON);
			//Step3: what you want -operation
			Response res=req.get("/api/challenges/json/rest-get-simple");
			
			//step4: validation
			int statusCode=res.getStatusCode();
			String responseBody=res.getBody().asString();
			JSONObject obj=(JSONObject)JSONValue.parse(responseBody);
			
			Object ref=obj.get("hobbies");
			System.out.println(ref);
			
//			System.out.println("Status Code: "+statusCode);
//			System.out.println("response body: "+responseBody);
//			//validation using RestAssured
//			res.then().statusCode(200);
//			//TestNG
//			//Assert.assertEquals(statusCode, 200);
  }
 
}
