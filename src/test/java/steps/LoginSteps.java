package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User should be at login page")
	public void preCondition()
	{
		System.out.println("Given step");
	}
	
	@When("Enter the username to the text field")
	public void enterUsername()
	{
		System.out.println("When step for enter username");
	}

	
	@When("Enter the password into the text field")
	public void enterPassword()
	{
		System.out.println("When step for enter password");
	}
	
	@Then("user should be able to login")
	public void login()
	{
		System.out.println("Login into the system");
	}
	
	
}
