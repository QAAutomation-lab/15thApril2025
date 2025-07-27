package day11.testngexamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsBeforeMethodtAfterMethod {
  @Test
  public void createLead() {
	  System.out.println("Running TC1 to create lead");
  }
  @Test
  public void deleteLead() {
	  System.out.println("Running TC2 to delete lead");
  }
  @BeforeMethod
  public void login() {
	  System.out.println("Login into app");
  }

  @AfterMethod
  public void logout() {
	  System.out.println("Logout from the app");
  }

}
