package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {
//	@Before(order = 0)
//	public void Setupppp(Scenario sc) { // we can return Scenrio method by passingg Argument
//		System.out.println("-->Launch the Browser");
//
//	//	System.out.println("getId : " + sc.getId());
//		System.out.println("getName :" + sc.getName());
//		//System.out.println("getStatus : " + sc.getStatus());
//		//System.out.println("getLine : " + sc.getLine());
//
//	}

	@Before()
	public void Setup() {
		System.out.println("-->Launch the Browser1");

	}
//	@Before("@smoke")
//	public void Setup1() {
//		System.out.println("-->Launch the Browser1");
//
//	}

//	@After(order = 2)
//	public void Logout() {
//		System.out.println("-->Logout the url");
//
//	}

	@After()
	public void TearDown() {
		System.out.println("-->Close the Browser");

	}
	
//	@After(order = 1)
//	public void TearDown121() {
//		System.out.println("-->Close the Browser");
//
//	}
	@AfterStep
	public void RefreshPage() {
		System.out.println("--RefreshPage");
	}
	@BeforeStep
	public void TakeScreenshot() {
		System.out.println("---TakeScreenshot");
		
	}

}
