package day10.switching;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Example4 extends SeleniumUtil	{

	@Test
	public void testWindowHandle() {
		WebDriver driver=setUp("chrome", "https://etrain.info/in");
		//get current window id
		String homeWinId=driver.getWindowHandle();//T1
		
		clickOnElement(driver.findElement(By.className("icon-twitter")));
		//all windows id opened by current driver instance
		Set<String> allWinIds=driver.getWindowHandles();//T1,T2
		allWinIds.remove(homeWinId);
		
		Iterator<String> itr=allWinIds.iterator();
		String childWinId=itr.next();
		
		//switch control from Home to child
		driver.switchTo().window(childWinId);
		String expectedTitle="Tripozo (@Tripozo) / X";
		String actualTitle=getCurrentTitleOfApplication(expectedTitle);
		Assert.assertEquals(actualTitle,expectedTitle);
		//to close child window
		//driver.close();
		
		//switch backto home page
		driver.switchTo().window(homeWinId);
		System.out.println(getCurrentUrlOfApplication());
		//close all windows opened by current instance
		driver.quit();
	}
}
