package day9.keyboardevent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Create an instance of Actions class
		Actions act=new Actions(driver);
		
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		// act.moveToElement(menuList.get(0)).perform();
		 
		for(int i=0;i<menuList.size();i++) {
			act.moveToElement(menuList.get(i)).perform();
			Thread.sleep(1000);
		}
	}

}
