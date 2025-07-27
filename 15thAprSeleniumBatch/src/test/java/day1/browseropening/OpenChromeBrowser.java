package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		//create instance of ChromeDriver
		//ChromeDriver cdriver=new ChromeDriver();
				//or
		//Generic way: create an instance of ChromeDriver and upcast it to WebDriver interface
		WebDriver driver=new ChromeDriver();
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