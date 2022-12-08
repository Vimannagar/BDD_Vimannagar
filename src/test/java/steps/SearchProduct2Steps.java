package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct2Steps {
	
	@Given("user should be available at login page")
	public void user_should_be_available_at_login_page() {
	    System.out.println("Step 1");
	}

	@When("user enters the valid username")
	public void user_enters_the_valid_username() {
		System.out.println("Step 2");
	}

	@When("user enters the valid password")
	public void user_enters_the_valid_password() {
		System.out.println("Step 3");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("Step 4");
	}

	@Then("user should get logged into app")
	public void user_should_get_logged_into_app() {
		System.out.println("Step 5");
	}

	@Given("user should have logged into App")
	public void user_should_have_logged_into_app() {
		System.out.println("Step 6");
	}

	@When("user enters the text")
	public void user_enters_the_text() {
		System.out.println("Step 7");
	}

	@When("Click on search icon")
	public void click_on_search_icon() {
		System.out.println("Step 8");
	}

	@Then("user should gets result")
	public void user_should_gets_result() {
		System.out.println("Step 9");
	}

}
