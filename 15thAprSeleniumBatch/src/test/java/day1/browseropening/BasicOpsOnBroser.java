package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOpsOnBroser {

	public static void main(String[] args) {
		//Generic way: create an instance of ChromeDriver and upcast it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//enter required application url
		driver.get("https://www.google.com");
		//validations
		String expectedTitle="Google";
		String expectedUrl="google.com";
		
		String actualTitle=driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		
		System.out.println("is title validate worked? "+actualTitle.equals(expectedTitle));
		System.out.println("is URL validate worked? "+actualUrl.contains(expectedUrl));
		//get page source 
		String pageSrcCode=driver.getPageSource();
		System.out.println("Char count in page source: "+pageSrcCode.length());
		
		//close current browser instance
		driver.close();
	}
}
/*
TC:
	-Open browser
	-Enter google url
	-validate
		* Title is Google or not
		* URL contains google.com or not
	- close the browser
*/