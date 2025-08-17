package day2.jsonAndSerializationPojo;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Example4 {

	@Test
	public void testPlaceOrder_POST() {
		//API Payload as String
		String payload="{\r\n"
				+ "  \"id\": 10,\r\n"
				+ "  \"petId\": 101,\r\n"
				+ "  \"quantity\": 1,\r\n"
				+ "  \"shipDate\": \"2025-08-17T02:33:01.484Z\",\r\n"
				+ "  \"status\": \"placed\",\r\n"
				+ "  \"complete\": true\r\n"
				+ "}";
		/**  GIVEN */
		//Step1: form base url
		RestAssured.baseURI="https://petstore.swagger.io/v2/";
		//Step2: define what is known for you
		RequestSpecification req=RestAssured.given()
							.header("Content-type","application/json")
						   .contentType(ContentType.JSON)
						   .accept(ContentType.JSON);
		/** When */
		//Step3: what you want -operation
		Response res=req.body(payload).post("store/order");
		/** Then */
		//step4: validation
		int statusCode=res.getStatusCode();
		String responseBody=res.getBody().asString();
		System.out.println("Status Code: "+statusCode);
		System.out.println("response body: "+responseBody);
		//validation using RestAssured
		res.then().statusCode(200);
		//TestNG
		//Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void testUserCreation2() {
		//API Payload as String
//		String payload="{\r\n"
//				+ "  \"id\": 10,\r\n"
//				+ "  \"petId\": 101,\r\n"
//				+ "  \"quantity\": 1,\r\n"
//				+ "  \"shipDate\": \"2025-08-17T02:33:01.484Z\",\r\n"
//				+ "  \"status\": \"placed\",\r\n"
//				+ "  \"complete\": true\r\n"
//				+ "}";
		
		JSONObject obj=new JSONObject();
		obj.put("id", 10);
		obj.put("petId", 102);
		obj.put("quantity", 2);
		obj.put("shipDate", "2025-08-17T02:33:01.484Z");
		obj.put("status", "places");
		obj.put("complete", "true");
		//Step1: form base url
				RestAssured.baseURI="https://petstore.swagger.io/v2/";
				//Step2: define what is known for you
				RequestSpecification req=RestAssured.given()
									.header("Content-type","application/json")
								   .contentType(ContentType.JSON)
								   .accept(ContentType.JSON);
				/** When */
				//Step3: what you want -operation
				Response res=req.body(obj.toJSONString()).post("store/order");
		
		//step4: validation
		int statusCode=res.getStatusCode();
		String responseBody=res.getBody().asString();
		System.out.println("Status Code: "+statusCode);
		System.out.println("response body: "+responseBody);
		//validation using RestAssured
		res.then().statusCode(200);
		//TestNG
		//Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void testUserCreation3() {
		//API Payload as String
	//		String payload="{\r\n"
	//		+ "  \"id\": 10,\r\n"
	//		+ "  \"petId\": 101,\r\n"
	//		+ "  \"quantity\": 1,\r\n"
	//		+ "  \"shipDate\": \"2025-08-17T02:33:01.484Z\",\r\n"
	//		+ "  \"status\": \"placed\",\r\n"
	//		+ "  \"complete\": true\r\n"
	//		+ "}";
	
	//JSONObject obj=new JSONObject();
	//obj.put("id", 10);
	//obj.put("petId", 102);
	//obj.put("quantity", 2);
	//obj.put("shipDate", "2025-08-17T02:33:01.484Z");
	//obj.put("status", "places");
	//obj.put("complete", "true");
			//or
		byte[] data=null;
		try {
			data=Files.readAllBytes(Paths.get(".\\src\\test\\resources\\jsonFiles\\PetOrder.json"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String payload=new String(data);
		
		//Step1: form base url
		RestAssured.baseURI="https://petstore.swagger.io/v2/";
//		//Step2: define what is known for you
//		RequestSpecification req=RestAssured.given()
//							.header("Content-type","application/json")
//						   .contentType(ContentType.JSON)
//						   .accept(ContentType.JSON);
//		/** When */
//		//Step3: what you want -operation
//		Response res=req.body(payload).post("store/order");
		
				/** When */
				//Step3: what you want -operation
				Response res=RestAssured.given()
						.header("Content-type","application/json")
						   .contentType(ContentType.JSON)
						   .accept(ContentType.JSON).body(payload).post("store/order");
		
		//step4: validation
		int statusCode=res.getStatusCode();
		String responseBody=res.getBody().asString();
		System.out.println("Status Code: "+statusCode);
		System.out.println("response body: "+responseBody);
		//validation using RestAssured
		res.then().statusCode(200);
		//TestNG
		//Assert.assertEquals(statusCode, 200);
	}
}
