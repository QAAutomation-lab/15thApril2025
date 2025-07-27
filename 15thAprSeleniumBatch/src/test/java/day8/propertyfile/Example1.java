package day8.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait, after this statement each statement which are created using driver instance will get 0-30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("appUrl"));
		driver.findElement(By.name("q")).sendKeys(prop.getProperty("textToBeSearched"));
		driver.findElement(By.cssSelector("input[name='btnK']")).click();
		String actualTitle=driver.getTitle();
		System.out.println("Is text searched? "+actualTitle.equals(prop.getProperty("expectedTitle")));
		
	}

}
