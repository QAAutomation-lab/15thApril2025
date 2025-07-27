package day11.testngexamples;

import org.testng.annotations.Test;

public class Example2 {
  @Test
  public void login() {
	  System.out.println("Login into Vtiger");
  }
  @Test
  public void createLead() {
	  System.out.println("Lead Created");
  }
  @Test
  public void updateLead() {
	  System.out.println("Lead updated");
  }
  @Test
  public void deleteLead() {
	  System.out.println("Lead deleted");
	  logout();
  }
  public void logout() {
	  System.out.println("logout from Vtiger");
  }
}
/*
any method without TestNg Annotation won't be executed as well as they won;t reflect in execution count

*/