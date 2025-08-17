package day2.jsonAndSerializationPojo;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Example1 {

	@Test
	public void testUserCreation() {
		//API Payload as String
		String payload="{\"name\": \"morpheus\",\"job\": \"leader\"}";
		/**  GIVEN */
		//Step1: form base url
		RestAssured.baseURI="https://reqres.in/";
		//Step2: define what is known for you
		RequestSpecification req=RestAssured.given()
							.header("Content-type","application/json")
						   .contentType(ContentType.JSON)
						   .accept(ContentType.JSON);
		/** When */
		//Step3: what you want -operation
		Response res=req.body(payload).post("api/users");
		/** Then */
		//step4: validation
		int statusCode=res.getStatusCode();
		String responseBody=res.getBody().asString();
		System.out.println("Status Code: "+statusCode);
		System.out.println("response body: "+responseBody);
		//validation using RestAssured
		res.then().statusCode(200);
		//TestNG
		//Assert.assertEquals(statusCode, 201);
	}
	
	@Test
	public void testUserCreation2() {
		//API Payload as String
		//String payload="{\"name\": \"morpheus\",\"job\": \"leader\"}";
		
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		//Step1: form base url
		RestAssured.baseURI="https://reqres.in/";
		//Step2: define what is known for you
		RequestSpecification req=RestAssured.given().header("Content-type","application/json")
						   .contentType(ContentType.JSON)
						   .accept(ContentType.JSON);
		//Step3: what you want -operation
		Response res=req.body(obj.toJSONString()).post("api/users");
		
		//step4: validation
		int statusCode=res.getStatusCode();
		String responseBody=res.getBody().asString();
		System.out.println("Status Code: "+statusCode);
		System.out.println("response body: "+responseBody);
		//validation using RestAssured
		res.then().statusCode(201);
		//TestNG
		//Assert.assertEquals(statusCode, 201);
	}
	
	@Test
	public void testUserCreation3() {
		//API Payload as String
		//String payload="{\"name\": \"morpheus\",\"job\": \"leader\"}";
			//or
//		JSONObject obj=new JSONObject();
//		obj.put("name", "morpheus");
//		obj.put("job", "leader");
			//or
		byte[] data=null;
		try {
			data=Files.readAllBytes(Paths.get(".\\src\\test\\resources\\testData\\Test.json"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String payload=new String(data);
		
		//Step1: form base url
		RestAssured.baseURI="https://reqres.in/";
		//Step2: define what is known for you
		RequestSpecification req=RestAssured.given().header("Content-type","application/json")
						   .contentType(ContentType.JSON)
						   .accept(ContentType.JSON);
		//Step3: what you want -operation
		Response res=req.body(payload).post("api/users");
		
		//step4: validation
		int statusCode=res.getStatusCode();
		String responseBody=res.getBody().asString();
		System.out.println("Status Code: "+statusCode);
		System.out.println("response body: "+responseBody);
		//validation using RestAssured
		res.then().statusCode(201);
		//TestNG
		//Assert.assertEquals(statusCode, 201);
	}
}
