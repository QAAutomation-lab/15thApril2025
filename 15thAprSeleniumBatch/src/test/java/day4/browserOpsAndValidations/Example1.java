package day4.browserOpsAndValidations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		
		//to set browser window size based on the need
		driver.manage().window().setSize(new Dimension(500, 300));
		
		//to minimize browser window
		driver.manage().window().minimize();
		
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//maximize window
		driver.manage().window().maximize();
		driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		System.out.println("Forgot page URL: "+driver.getCurrentUrl());
		
		//come back to previous page
		driver.navigate().back();
		System.out.println("Login page URL: "+driver.getCurrentUrl());
		
		//need to goto next page
		driver.navigate().forward();
		
		//reload the page
		driver.navigate().refresh();
		
		//move to diff URL
		driver.navigate().to("https://www.google.com");
	}

}
