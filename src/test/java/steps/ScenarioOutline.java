package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {
	
	@Given("user is at the login screen")
	public void user_is_at_the_login_screen() {

		System.out.println("Given step for login screen");
	}

	@When("user enter the {string} in username field")
	public void user_enter_the_in_username_field(String usrname) {
	 System.out.println("Entered username is "+usrname);
	}

	@When("user enter the {string} in password field")
	public void user_enter_the_in_password_field(String pwd) {
		System.out.println("Entered password is "+pwd);
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	    System.out.println("When step for signin button");
	}

	@Then("user should get message")
	public void user_should_get_message() {
	   System.out.println("then step for message");
	}


}
