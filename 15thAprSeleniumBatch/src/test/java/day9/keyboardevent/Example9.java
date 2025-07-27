package day9.keyboardevent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class Example9 extends SeleniumUtil{

	public static void main(String[] args) throws InterruptedException {
		
		Example9 ref=new Example9();
		ref.performDragAndDropInApp();
	}
	
	public void performDragAndDropInApp() {
		driver=setUp("Chrome","https://jqueryui.com/draggable/");
		//switching inside the frame
		driver.switchTo().frame(0);
		performDragAndDropBy(driver.findElement(By.id("draggable")), 200, 100);
	}

}
