package day11.testngexamples;

import org.testng.annotations.Test;

public class Example8 {
 
  @Test(priority=3,enabled=false)
  public void updateLead() {
	  System.out.println("Lead updated");
  }
  @Test(priority=4,dependsOnMethods = "createLead")
  public void deleteLead() {
	  System.out.println("Lead deleted");
  }
  @Test(priority=5, timeOut = 2000)
  public void logout() throws InterruptedException {
	  System.out.println("logout from Vtiger");
	  Thread.sleep(3000);
  }
  @Test(priority=1,invocationCount = 3, description = "Trying to execute this method 3 times")
  public void login() {
	  System.out.println("Login into Vtiger");
  }
  @Test(priority=2,expectedExceptions = ArithmeticException.class)
  public void createLead() {
	  System.out.println("Lead Created");
	  int res=10/0;
  }
}
/*
any method without TestNg Annotation won't be executed as well as they won;t reflect in execution count

priority: to control the execution flow based on the need
enabled: based on its value true/false method will be consider for execution
*/