package day2.identifiyrequiredelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://www.saucedemo.com/");
		/**
		 * enter username
		 * 		1. 1st identify the username input field 
		 * 		2. once you identified username input field perform required operation
		 */
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		/**
		 * enter password
		 * 		1. 1st identify the password input field 
		 * 		2. once you identified password input field perform required operation
		 */
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		/**
		 * click on Login button
		 * 		1. 1st identify the login button
		 * 		2. once you identified login button perform required operation
		 */
		WebElement loginButton=driver.findElement(By.className("submit-button"));
		loginButton.click();
		
		//validation
		String actualUrl=driver.getCurrentUrl();
		System.out.println("is login successful? "+actualUrl.contains("inventory.html"));
	}

}
/*
 * findElement(By): 
 * 		- this method is used to identify required element from application and its return type is WebElement
 * 		- this method is having By class as argument
 * 		- By class is a predefined class having several static methods these method as known as locators
 * 
 * 		WebElement element=driver.findElement(By. _ _ _);
 * 												id(""));
 * 												name(""));
 * 												linkText(""));
 * 												partialLinkText(""));
 * 												className(""));
 * 												tagName(""));
 * 												cssSelector(""));
 * 												xpath(""));
 *  Once the element is identified, perform any of the below operation based on need
 *  	- if you want to type some text into a field
 *  			element.sendkeys("");
 * 		- if you want to click on any link/button/image ...
 * 				element.click();
 * 		- if you want to delete existing text from any text field
 * 				element.clear();	
 */




/*
TC1:
	- open browser
	- enter application url https://www.saucedemo.com/
	- enter username as standard_user
	- enter password as secret_sauce
	- click on login button
	- validate homepage is having url as 'inventory.html' 
*/