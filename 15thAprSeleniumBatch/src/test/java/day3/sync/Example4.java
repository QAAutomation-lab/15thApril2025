package day3.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Example4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/apr15/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		//explicit wait - FluentWait, this will work only on specified element
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))//total time
				                        .pollingEvery(Duration.ofSeconds(5))// retry time,5 , 10 ,15 , 20
				                        .ignoring(NoSuchElementException.class);//exception to be ignored
		
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Expected home page title: "+expectedHomePageTitle);
		System.out.println("Actual home page title: "+actualHomePageTitle);
		System.out.println("id home page opened? "+expectedHomePageTitle.equals(actualHomePageTitle));
		//wait for logout link to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
		driver.findElement(By.id("logoutLink")).click();
	}

}
/*
- open browser
	- enter application url https://online.actitime.com/apr15/login.do
	- enter username as admin01
	- enter password as admin01
	- click on login button
	- validate homepage with title
	- and logout

*/