package day2.jsonAndSerializationPojo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Example5 {
  @Test
  public void getPetSatus() {
	  
	  		//Step1: form base url
			RestAssured.baseURI="https://petstore.swagger.io/v2/";
			//Step2: define what is known for you
			RequestSpecification req=RestAssured.given().header("Content-type","application/json")
							   .contentType(ContentType.JSON)
							   .accept(ContentType.JSON);
			//Step3: what you want -operation
			Response res=req.get("store/inventory");
			
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
  public void updateUserDetails() {
	  String payload="{\n"
	  		+ "  \"id\": 101,\n"
	  		+ "  \"username\": \"Shailesh\",\n"
	  		+ "  \"firstName\": \"Tester\",\n"
	  		+ "  \"lastName\": \"K\",\n"
	  		+ "  \"email\": \"abc@gmail.com\",\n"
	  		+ "  \"password\": \"abc@12334\",\n"
	  		+ "  \"phone\": \"98765356\",\n"
	  		+ "  \"userStatus\": 0\n"
	  		+ "}";
	  
	  		//Step1: form base url
			RestAssured.baseURI="https://petstore.swagger.io/v2/";
			//Step2: define what is known for you
			Response res=RestAssured.given()
							   .header("Content-type","application/json")
							   .contentType(ContentType.JSON)
							   .accept(ContentType.JSON)
							   .body(payload).put("user/Tester");
			
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
  public void deleteOps() {
	 
	  		//Step1: form base url
			RestAssured.baseURI="https://petstore.swagger.io/v2/";
			//Step2: define what is known for you
			Response res=RestAssured.given().header("Content-type","application/json")
							   .contentType(ContentType.JSON)
							   .accept(ContentType.JSON).delete("store/order/200");
			
			//step4: validation
			int statusCode=res.getStatusCode();
			String responseBody=res.getBody().asString();
			System.out.println("Status Code: "+statusCode);
			System.out.println("response body: "+responseBody);
			//validation using RestAssured
			res.then().statusCode(204);
			//TestNG
			//Assert.assertEquals(statusCode, 204);
  }
}
