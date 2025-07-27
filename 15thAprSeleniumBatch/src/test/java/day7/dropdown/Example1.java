package day7.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		//identify dropdown
		WebElement dropdown=driver.findElement(By.id("Skills"));
		//create an instance of Select class and pass required dropdown instance to its constructor
		Select select=new Select(dropdown);
		
		System.out.println("is this dropdown allow to select multiple option? "+select.isMultiple());
		//already selected or default selected element
		WebElement alreadySelectedElement=select.getFirstSelectedOption();
		System.out.println("Default selection: "+alreadySelectedElement.getText());
		
		//to select any option used any one method
		select.selectByVisibleText("APIs");
		System.out.println("Selected option based on text: "+select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.selectByIndex(2);
		System.out.println("Selected option based on index: "+select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.selectByValue("AutoCAD");
		System.out.println("Selected option based on value: "+select.getFirstSelectedOption().getText());
		
		//need option count
		List<WebElement> options=select.getOptions();
		System.out.println("Option count: "+options.size());
		
		//print option one by one
		for(int i=0;i<options.size();i++) {
			WebElement element=options.get(i);
			System.out.println("option "+i+": "+element.getText());
		}
	}

}
