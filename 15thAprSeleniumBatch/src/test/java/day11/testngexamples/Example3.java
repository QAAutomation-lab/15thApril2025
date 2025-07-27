package day11.testngexamples;

import org.testng.annotations.Test;

public class Example3 {
 
  @Test(priority=3)
  public void updateLead() {
	  System.out.println("Lead updated");
  }
  @Test(priority=4)
  public void deleteLead() {
	  System.out.println("Lead deleted");
  }
  @Test(priority=5)
  public void logout() {
	  System.out.println("logout from Vtiger");
  }
  @Test(priority=1)
  public void login() {
	  System.out.println("Login into Vtiger");
  }
  @Test(priority=2)
  public void createLead() {
	  System.out.println("Lead Created");
  }
}
/*
any method without TestNg Annotation won't be executed as well as they won;t reflect in execution count

priority: to control the execution flow based on the need
*/