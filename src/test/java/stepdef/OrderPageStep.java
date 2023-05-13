package stepdef;

import io.cucumber.java.en.*;

public class OrderPageStep {
	@Given("a register user exists")
	public void a_register_user_exists() {
		System.out.println("Step 1");
	}

	@Given("User naviagte to login page")
	public void user_naviagte_to_login_page() {
		System.out.println("Step 2");
		}

	@When("User enter the  username")
	public void user_enter_the_username() {
		System.out.println("Step 3");
	}

	@When("User enter the password")
	public void user_enter_the_password() {
		System.out.println("Step 4");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Step 5");
	}

	@Then("user naviagte to the order page")
	public void user_naviagte_to_the_order_page() {
		System.out.println("Step 6");
	}

	@When("^User click on previous order details$")
	public void UserlickOnOrderDetails(){
		System.out.println("Step 7");
		}

	@When("^click on open order link$")
	public void clickOnOpenOrderDetails() {
		System.out.println("Step 8");
	}

	@Then("^User should check the open order link$")
	public void userShouldCheckTheOpenOrderLink(){
	
		System.out.println("Step 1");
		}

	@When("^click on canceled order link$")
	public void clickOnCanceledOrderLink(){
		System.out.println("Step 9");
		}

	@Then("^User should check the cancel order details$")
	public void userShouldCheckTheCancelOrderDetails() {
		System.out.println("Step 10");
		}

	@Then("^User should check the previous order link$")
	public void userShouldCheckThePreviousOrderLink() {
		System.out.println("Step 11");
		}


}
