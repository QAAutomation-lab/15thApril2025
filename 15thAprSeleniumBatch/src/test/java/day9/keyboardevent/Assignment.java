package day9.keyboardevent;

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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		List<WebElement> cred=driver.findElements(By.cssSelector(".orangehrm-demo-credentials>p"));
		String username=cred.get(0).getText().replace("Username : ", "");	
//		String[] username=cred.get(0).getText().split(" ");
		
		String password=cred.get(1).getText().replace("Password : ", "");
		
		System.out.println(username +" : "+password);
	}
}
/*
Perform mouse hover in 
	1.flipkart
	2.https://www.espncricinfo.com/

login into application by fetching username and password from application 
	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
*/