package day2.identifiyrequiredelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//delete existing text and enter username as admin
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		//delete existing text and enter password as admin
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("admin");
		//click on login button
		driver.findElement(By.className("buttonBlue")).click();
		//validate homepage is opened with Title as Dashboard
		String appTitle=driver.getTitle();
		System.out.println("Is login successful? "+appTitle.equals("Dashboard"));
	}

}
/*
TC1:
	- open browser
	- enter application url https://demo.vtiger.com/vtigercrm/index.php
	- delete existing text and enter username as admin
	- delete existing text and enter password as admin
	- click on login button
	- validate homepage is opened with Title as Dashboard
*/