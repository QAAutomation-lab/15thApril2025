package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		//create instance of EdgeDriver
		//EdgeDriver edriver=new EdgeDriver();
				//or
		//Generic way: create an instance of EdgeDriver and upcast it to WebDriver interface
		WebDriver driver=new EdgeDriver();
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