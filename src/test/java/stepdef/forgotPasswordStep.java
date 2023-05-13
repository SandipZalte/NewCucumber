package stepdef;

import io.cucumber.java.en.*;

public class forgotPasswordStep {
	@Given("User naviagte  to the forgot password page")
	public void user_naviagte_to_the_forgot_password_page() {
	   System.out.println("User naviagte  to the forgot password page");
	}

	@When("^User enter the  \"([^\"]*)\" id$")
	public void userEnterTheId(String email){
		System.out.println();
	}

	@Then("^succes warning message  should Displayed$")
	public void succesWarningMessageShouldDisplayed(){
		System.out.println("succes warning message  should Displayed");
	}

	@And("^click on continue button$")
	public void clickOnContinueButton()  {
		System.out.println("click on continue button");
	}



	@Then("^Warning msg should Displayed$")
	public void warningMsgShouldDisplayed() {
		System.out.println("warningMsgShouldDisplayed");
	}

	@When("^User enter the invalid  <Email>id$")
	public void userEnterTheInvalidEmailId(){
		System.out.println("userEnterTheInvalidEmailId-->");
	}



}
