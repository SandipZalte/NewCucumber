package stepdef;


import io.cucumber.java.en.*;

public class loginStep {
	@Given("User navigate the loginpage")
	public void user_navigate_the_loginpage() {
		System.out.println(">>User navigate the loginpage");
	 
	}
	@When("user  enter {string} and {int}")
	public void user_enter_and(String Username, Integer password) {
	    System.out.println(">>sandip@gmail.com");
	    System.out.println(">>123456");

	}


	@When("user enter <Email> and <Password>")
	public void user_enter_email_and_password() {
		System.out.println(">>user enter <Email> and <Password>");

	}

	@Then("naviagte to homepage")
	public void naviagte_to_homepage() {
		System.out.println(">>naviagte to homepage");

	}
	@Then("^warning msg should be display$")
	public void warningMsgShouldBeDisplay() {
		System.out.println(">>warning msg should be display");
	}
	
	

}
