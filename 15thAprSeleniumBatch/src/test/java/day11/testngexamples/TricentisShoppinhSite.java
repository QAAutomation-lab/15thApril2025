package day11.testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class TricentisShoppinhSite extends SeleniumUtil{

	WebDriver driver;
	@Test(enabled=false)
	public void loginIntoTricentis() {
		driver=setUp("chrome", "https://demowebshop.tricentis.com/");
		clickOnElement(driver.findElement(By.className("ico-login")));
		typeRequiredText(driver.findElement(By.id("Email")), "tester01@vomoto.com");
		typeRequiredText(driver.findElement(By.name("Password")), "Abc@12345");
		clickOnElement(driver.findElement(By.cssSelector(".login-button")));
		
		String actualProfileName=getTextFromElement(driver.findElement(By.className("account")));
		String expectedProfileName="tester01@vomoto.com1";
		System.out.println("Is login done? "+actualProfileName.equals(expectedProfileName));
	}
	
	@Test(enabled=true)
	public void loginIntoTricentisValidateWithAssert() {
		driver=setUp("chrome", "https://demowebshop.tricentis.com/");
		clickOnElement(driver.findElement(By.className("ico-login")));
		typeRequiredText(driver.findElement(By.id("Email")), "tester01@vomoto.com");
		typeRequiredText(driver.findElement(By.name("Password")), "Abc@12345");
		clickOnElement(driver.findElement(By.cssSelector(".login-button")));
		
		String actualProfileName=getTextFromElement(driver.findElement(By.className("account")));
		String expectedProfileName="tester01@vomoto.com";
		//System.out.println("Is login done? "+actualProfileName.equals(expectedProfileName));
				//or
//		Assert.assertEquals(actualProfileName, expectedProfileName);
		Assert.assertEquals(actualProfileName, expectedProfileName,"Either login failed/profile name changed");
	}
	@Test(enabled=true)
	public void loginPageObjectValidateWithAssert() {
		driver=setUp("chrome", "https://demowebshop.tricentis.com/");
		WebElement loginLink=driver.findElement(By.className("ico-login"));
		//Assert.assertTrue(isElementExist(username));
		Assert.assertTrue(isElementExist(loginLink),"Either login option not loaded or login option is missing in login page");
		clickOnElement(loginLink);
		
		WebElement emailIdInputField=driver.findElement(By.id("Email"));
		Assert.assertTrue(isElementExist(emailIdInputField),"Either emailIdInputField not loaded or emailIdInputField is missing in login page");
		
		WebElement rememberMe=driver.findElement(By.id("RememberMe"));
		Assert.assertFalse(isCheckBoxSelected(rememberMe));
	}
}
