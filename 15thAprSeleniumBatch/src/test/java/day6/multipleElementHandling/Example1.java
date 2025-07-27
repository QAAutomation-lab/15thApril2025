package day6.multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		//identify all elements created with input tag
		List<WebElement> objects=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		//identify all devices price
		//TODO:
		
		System.out.println("Device count: "+objects.size());
		for(int i=0;i<objects.size();i++) {
			WebElement element=objects.get(i);
			System.out.println("Device name: "+element.getText());
			//TODO: price device price
		}
	}
}
/*
 * Print device count
 * and there name
 */
