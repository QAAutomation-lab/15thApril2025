package day6.multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		//identify all elements created with input tag
		List<WebElement> objects=driver.findElements(By.tagName("input"));
		System.out.println("Input object count: "+objects.size());
		for(int i=0;i<objects.size();i++) {
			WebElement element=objects.get(i);
			System.out.println("Object types are: "+element.getAttribute("type"));
		}
	}
}
