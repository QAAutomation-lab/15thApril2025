package day4.browserOpsAndValidations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//username field - visible | editable/functional | default text
		WebElement username=driver.findElement(By.id("username"));
		System.out.println("is username input field visible? "+username.isDisplayed());
		System.out.println("is username input field editable? "+username.isEnabled());
		System.out.println("Default text on username input field- "+username.getAttribute("value"));
		//signin button - visible | clickable/functional | name
		WebElement signInButton=driver.findElement(By.className("buttonBlue"));
		System.out.println("is signInButton visible? "+signInButton.isDisplayed());
		System.out.println("is signInButton clickable? "+signInButton.isEnabled());
		System.out.println("Button name- "+signInButton.getText());
	}

}
/*
Validations:
	text field:
				- visible or not
				- editable or not
				- default text
	radio/checkbox:
				- visible or not
				- clickable or not
				- by default selected or not
				- after selection, its selected or not
	button:
				- visible or not
				- clickable or not
				- its name

*/