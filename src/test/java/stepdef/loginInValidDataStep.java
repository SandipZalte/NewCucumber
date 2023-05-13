package stepdef;

import io.cucumber.java.en.*;

public class loginInValidDataStep {
	@When("User enter the {string} in Userid field")
public void user_enter_the_in_userid_field(String userid) {

System.out.println("<<please enter the Userid--> + UserName");
}

@When("User enter the th \"{int} \"in Password field")
public void user_enter_the_th_in_password_field(Integer Password) {
	System.out.println("<<please enter the Password--> + Password");
}

@Given("^User open the appliaction interface$")
public void userOpenTheAppliactionInterface()  {
	System.out.println("<<User open the appliaction interface");
}

@When("^User click on loginbutton$")
public void userClickOnLoginbutton()  {
	System.out.println("<<User click on loginbutton");
}

@Then("^user navigate to the login page$")
public void userNavigateToTheLoginPage()  {
	System.out.println("user navigate to the login page");
}

@When("Click on Login Button")
public void click_on_login_button()
{System.out.println("Click on Login Button");
}

@Then("^Warning Msg should be Displyed As Your UserId and Passowrd is Wrong$")
public void warningMsgShouldBeDisplyedAsYourUserIdAndPassowrdIsWrong() {
	System.out.println("Warning Msg should be Displyed As Your UserId and Passowrd is Wrong");
}

@And("^User enter  the \"([^\"]*)\" in pin field$")
public void userEnterTheInPinField(String Pin){
	System.out.println("User enter  the in pin field-->"+ Pin);
}
}
