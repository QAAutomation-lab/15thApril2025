package day2.identifiyrequiredelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://www.saucedemo.com/");
		/**
		 * enter username
		 * 		1. 1st identify the username input field and perform required operation
		 */
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		/**
		 * enter password
		 * 		1. 1st identify the password input field and perform required operation
		 */
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		/**
		 * click on Login button
		 * 		1. 1st identify the login button and perform required operation
		 */
		driver.findElement(By.className("submit-button")).click();
		
		//validation
		String actualUrl=driver.getCurrentUrl();
		System.out.println("is login successful? "+actualUrl.contains("inventory.html"));
	}

}
/*
TC1:
	- open browser
	- enter application url https://www.saucedemo.com/
	- enter username as standard_user
	- enter password as secret_sauce
	- click on login button
	- validate homepage is having url as 'inventory.html' 
*/