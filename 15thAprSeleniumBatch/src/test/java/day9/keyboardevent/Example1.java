package day9.keyboardevent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/apr15/login.do");
		//type username and copy it 
		driver.findElement(By.id("username"))
								.sendKeys("admin01",
								 Keys.chord(Keys.CONTROL,"a"),
								 Keys.chord(Keys.CONTROL,"c"));
		
		//paste username in password field and press enter button
		driver.findElement(By.name("pwd"))
								.sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
	}

}
