package day3.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");//nosuchelementexception with implicit wait
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("dashboard"));
		String homePageUrl=driver.getCurrentUrl();
		System.out.println("Dashboard page opened or not? "+homePageUrl.contains("dashboard"));
		
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
/*
TC1:
	- open browser
	- enter application url https://opensource-demo.orangehrmlive.com/web/index.php/auth/logi
	- enter username as Admin
	- enter password as admin123
	- click on login button
	- validate homepage with URL
	- logout from the application

TC2:
	- open browser
	- enter application url https://www.saucedemo.com/
	- enter username as standard_user
	- enter password as secret_sauce
	- click on login button
	- validate homepage with URL
	- logout from the application
	
TC3:
	- open browser
	- enter application url https://demo.vtiger.com/vtigercrm/index.php
	- enter username as admin
	- enter password as admin
	- click on login button
	- validate homepage with URL
	- logout from the application
*/