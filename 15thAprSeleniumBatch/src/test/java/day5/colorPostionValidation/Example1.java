package day5.colorPostionValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/apr15/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		String expectedErrorMsg="Username or Password is invalid. Please try again.";
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), expectedErrorMsg));
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		System.out.println("Error msg: "+errorMsg.getText());
		System.out.println("Error msg color code: "+errorMsg.getCssValue("color"));
		System.out.println("Error msg font size: "+errorMsg.getCssValue("font-size"));
		System.out.println("Error msg font family: "+errorMsg.getCssValue("font-family"));
		
		//position validation
		Point errorLocation=errorMsg.getLocation();
		int error_x=errorLocation.getX();
		int error_y=errorLocation.getY();
		System.out.println("Error msg x: "+error_x);
		System.out.println("Error msg y: "+error_y);
		Point usernameLocation=driver.findElement(By.id("username")).getLocation();
		int user_x=usernameLocation.getX();
		int user_y=usernameLocation.getY();
		System.out.println("Username x: "+user_x);
		System.out.println("Username y: "+user_y);
		
		System.out.println("is error msg displayed above username input field? "+(error_y<user_y));
	}
}
/*
Open any browser
enter application url
click on login button
validate
	- error message text
	- error message color
	- error message text font
	- error message is getting displayed above username input field
*/