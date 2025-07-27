package day7.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		//identify dropdown
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> options=driver.findElements(By.cssSelector("ul[aria-labelledby='menu1']>li>a"));
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		Thread.sleep(1000);
		options.get(2).click();
	}

}
