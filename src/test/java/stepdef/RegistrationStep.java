package stepdef;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegistrationStep {

	@Given("user open the registration page")
	public void user_open_the_registration_page() {
		System.out.println("user open the registration page");

	}

	@When("user enter the all below details")
	public void user_enter_the_all_below_details(DataTable datatable) {
		List<List<String>>userlist = datatable.asLists(String.class);
		for(List<String >e: userlist)
		{
			System.out.println(e);
		

		}
		System.out.println(userlist);
	}

	@Then("Regstration successful msg Show")
	public void regstration_successful_msg_show() {
		System.out.println("Regstration successful msg Show");
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
		System.out.println("I want to write a step with name1");

	}

	@Given("^user open the registration page colm$")
	public void userOpenTheRegistrationPageColm() {
		System.out.println("user open the registration page colm");
	}

	@When("user enter the all below details column")
	public void user_enter_the_all_below_details_column(DataTable dataTable) {
		List<Map<String,String>>usermaplist=dataTable.asMaps(String.class,String.class);
		System.out.println(usermaplist);
		System.out.println(usermaplist.get(0).get("City"));
		System.out.println(usermaplist.get(2).get("Userid"));
		
		System.out.println("----2nd way----");
for(Map<String,String>p:usermaplist) {
	
	System.out.println(p.get("Name"));
	System.out.println(p.get("LastName"));
	System.out.println(p.get("Userid"));
	System.out.println(p.get("Password"));
	System.out.println(p.get("MobileNumber"));
	System.out.println(p.get("City"));
	System.out.println();
	
	
}
		

	}

}
