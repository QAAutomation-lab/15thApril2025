package day6.multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//identify all elements created with input tag
		List<WebElement> objects=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:nth-child(1)>*:nth-child(1)>span"));
		System.out.println("Suggestion count: "+objects.size());
		for(int i=0;i<objects.size();i++) {
			//to avoid 'StaleElementReferenceException', re-identify suggestion list
			objects=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:nth-child(1)>*:nth-child(1)>span"));
			WebElement element=objects.get(i);
			System.out.println("Suggestion name: "+element.getText());
		}
	}

}
/*
TC1: https://demo.automationtesting.in/Register.html
print all menu count and names

TC2: https://demowebshop.tricentis.com/
login and get product count and names

TC3: https://www.google.com/
open https://www.google.com/
type selenium
print suggestion count and suggestions

TC4:
Open gsmarena.com
Validate home page
Get mobile phone name count from phone finder
Print mobile phone name 

TC5:
Open gsmarena.com
Validate home page
Click on Samsung phone link present in phone finder
Get device count and print on console
Print all the device names on the console

*/