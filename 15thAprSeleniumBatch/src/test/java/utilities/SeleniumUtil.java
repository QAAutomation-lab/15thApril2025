package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	protected FileInputStream fis;
	protected static String filePath;
	protected Properties properties;
	/**
	 * using this method we can load our property and also open desired browser
	 */
	{
		filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\AppData.properties";
	}
	
	public void loadPropertyFile() {
		properties = new Properties();
		try {
			fis = new FileInputStream(filePath);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public WebDriver setUp(String browserName,String url) {
		loadPropertyFile();
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		action=new Actions(driver);
		driver.get(url);
		return driver;
	}
	public String getValueFromPropertyFile(String key) {
		return properties.getProperty(key);
	}
	public void setSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void typeRequiredText(WebElement element, String input) {
		waitForElementToBePresent(element);
		element.clear();
		element.sendKeys(input);
	}

	public void performDragAndDrop(WebElement src,WebElement target) {
		action.dragAndDrop(src, target).build().perform();
	}
	public void performDragAndDropBy(WebElement src,int x, int y) {
		action.dragAndDropBy(src, x,y).build().perform();
	}
	
	public void performCopyPaste(WebElement src, WebElement target) {
		src.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		target.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
	
	public void clickOnElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}
	
	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForTitle(String title) {
		wait.until(ExpectedConditions.titleIs(title));
	}
	public void waitForTitleToHave(String title) {
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void waitForElementToBePresent(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public void waitForElementToBePresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String getTextFromElement(WebElement element) {
		waitForElementToBePresent(element);
		return element.getText();
	}

	/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication(String title) {
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication() {
		return driver.getTitle();
	}

	/**
	 * Method to get the current url of the application
	 */
	public String getCurrentUrlOfApplication() {
		return driver.getCurrentUrl();
	}

	public boolean isElementExist(WebElement element) {
		waitForElementToBePresent(element);
		return element.isDisplayed();
	}

	public boolean isCheckBoxSelected(WebElement element) {
		waitForElementToBePresent(element);
		return element.isSelected();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected void handleHtmlDropdownListWithVisibleText(WebElement element, String visibileText) {
		waitForElementToBePresent(element);
		Select select = new Select(element);
		select.selectByVisibleText(visibileText);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected void handleHtmlDropdownListWithIndex(WebElement element, int index) {
		waitForElementToBePresent(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getHtmlDropdownListSize(WebElement element) {
		waitForElementToBePresent(element);
		Select select = new Select(element);
		return select.getOptions();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element) {
		waitForElementToBePresent(element);
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) {
		waitForElementToBePresent(element);
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}
	public String getRequiredAttributeValue(WebElement element,String attribute) {
		waitForElementToBePresent(element);
		setSleep(2000);
		return element.getAttribute(attribute);
	}

	public void performMouseOverOperation(WebElement element) {
		action.moveToElement(element).perform();
	}
	
	public void getScreenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
