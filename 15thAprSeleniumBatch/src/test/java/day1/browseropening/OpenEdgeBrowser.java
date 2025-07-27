package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenEdgeBrowser {

	public static void main(String[] args) {
		//create instance of FirefoxDriver
		//FirefoxDriver fdriver=new FirefoxDriver();
				//or
		//Generic way: create an instance of FirefoxDriver and upcast it to WebDriver interface
		WebDriver driver=new FirefoxDriver();
	}
}
/*
Browser opened by selenium won't be having
	- history
	- download history
	- plugins
	- cookies/cache
every time selenium will launch a new browser as it won't work on existing browser
*/