package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSignup {
	
	@Given("User is at signup page")
	public void user_is_at_signup_page() {
	  System.out.println("Given step");
		
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable userdetails) {
	  
	List<List<String>> userlist = userdetails.asLists();
	
	
			for(List<String> singleuserlist :userlist)
			{
				for(String value:singleuserlist)
				{
					System.out.println(value);
				}
			}
		
	}

	@Then("user should see values")
	public void user_should_see_values() {
	 System.out.println("Then step is executing");
	}

}
