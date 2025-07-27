package day10.datesExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.SeleniumUtil;

public class Example2 extends SeleniumUtil{

	public static void main(String[] args) throws InterruptedException {
		
		Example2 ref=new Example2();
		ref.openGoogleAndTakeScreenshot();
	}
	
	public void openGoogleAndTakeScreenshot() {
		driver=setUp("Chrome","https://www.google.com");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File screenshot=ts.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(screenshot, new File(".\\src\\test\\resources\\screenshots\\GooglePage.jpg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		getScreenshot(".\\src\\test\\resources\\screenshots\\GooglePage1.jpg");
	}

}
