package day7.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		//identify dropdown
		WebElement dropdown=driver.findElement(By.id("multiselect1"));
		//create an instance of Select class and pass required dropdown instance to its constructor
		Select select=new Select(dropdown);
		
		System.out.println("is this dropdown allow to select multiple option? "+select.isMultiple());
		
		//to select any option used any one method
		select.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByValue("audix");
		
		
		//selected option count
		List<WebElement> options=select.getAllSelectedOptions();
		System.out.println("Selected Option count: "+options.size());
		
		//print option one by one
		for(int i=0;i<options.size();i++) {
			WebElement element=options.get(i);
			System.out.println("option "+i+": "+element.getText());
		}
		
		//unselect option
		//to select any option used any one method
				select.deselectByVisibleText("Volvo");
				Thread.sleep(1000);
				select.deselectByIndex(2);
				Thread.sleep(1000);
				select.deselectByValue("audix");
					//or
				//select.deselectAll();
	}

}
