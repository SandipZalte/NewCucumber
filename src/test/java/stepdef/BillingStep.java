package stepdef;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class BillingStep {
	 double  BillingAmount;
	 double TaxAmount;
	 double FinalAmount;
	
	@Given("User on Billing Page")
	public void user_on_billing_page() {
		System.out.println("User on Billing Page");
	}

	@When("^User enter the billing amount \"([^\"]*)\"$")
	public void userEnterTheBillingAmount(String BillingAmount)   {
		this.BillingAmount=Double.parseDouble(BillingAmount);
	
	}

	@And("^User enter the Tax amount in \"([^\"]*)\"$")
	public void userEnterTheTaxAmountIn(String TaxAmount )  {
		this.TaxAmount=Double.parseDouble(TaxAmount);
	}

	@Then("^it return  the Final Amount\"([^\"]*)\"$")
	public void itReturnTheFinalAmount(String FinalAmount ) {
		this.FinalAmount=this.TaxAmount+this.BillingAmount;
		
		Assert.assertTrue(this.FinalAmount== this.BillingAmount+this.TaxAmount);
		
	}

	@And("^Click on Calculate button$")
	public void clcikOnCalculateButton(){
		System.out.println("Calculate button==");
	}

	

}