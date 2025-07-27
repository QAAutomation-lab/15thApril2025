package day11.testngexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationsBeforeTestAfterTest {
  @Test
  public void createLead() {
	  System.out.println("Running TC1 to create lead");
  }
  @Test
  public void deleteLead() {
	  System.out.println("Running TC2 to delete lead");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Login into app");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Logout from the app");
  }

}
