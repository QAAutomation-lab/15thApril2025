package day11.testngexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void test() {
	  System.out.println("I am suite class test");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am after suite");
  }

}
