package day2.jsonAndSerializationPojo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Example2 {
  @Test
  public void getUserDetails() {
	  
	  		//Step1: form base url
			RestAssured.baseURI="https://reqres.in";
			//Step2: define what is known for you
			RequestSpecification req=RestAssured.given().header("Content-type","application/json")
							   .contentType(ContentType.JSON)
							   .accept(ContentType.JSON);
			//Step3: what you want -operation
			Response res=req.get("/api/users?page=2");
			
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
	  JSONObject obj=new JSONObject();
		obj.put("name", "Shailesh");
		obj.put("job", "QA Delivery Head");
	  
	  		//Step1: form base url
			RestAssured.baseURI="https://reqres.in";
			//Step2: define what is known for you
			Response res=RestAssured.given()
							   .header("Content-type","application/json")
							   .contentType(ContentType.JSON)
							   .accept(ContentType.JSON)
							   .body(obj.toJSONString()).put("/api/users/2");
			
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
			RestAssured.baseURI="https://reqres.in";
			//Step2: define what is known for you
			Response res=RestAssured.given().header("Content-type","application/json")
							   .contentType(ContentType.JSON)
							   .accept(ContentType.JSON).delete("/api/users/2");
			
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
