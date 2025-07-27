package day9.keyboardevent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// implicit wait, after this statement each statement which are created using
		// driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/ref=nav_logo");

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
		}

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(1000);
		}

	}

}
