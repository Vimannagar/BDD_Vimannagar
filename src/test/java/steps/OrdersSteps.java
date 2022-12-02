package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {

	@Given("user should be at the login page")
	public void user_should_be_at_the_login_page() {
	 System.out.println("Background given step 1");
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		 System.out.println("Background when step 2");
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		 System.out.println("Background when step 3");
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		 System.out.println("Background when step 4");
	}

	@Then("user should get logged in")
	public void user_should_get_logged_in() {
		 System.out.println("Background then step 5");
	}

	@When("user click on previous order link")
	public void user_click_on_previous_order_link() {
		 System.out.println("Scenario 1 when step");
	}

	@Then("user should see the previously ordered product")
	public void user_should_see_the_previously_ordered_product() {
		 System.out.println("Scenario 1 then step");
	}
	
	
	@When("user click on current order link")
	public void clickOnCurrentOrderLink() {
		 System.out.println("Scenario 2 when step");
	}

	@Then("user should see the status of ordered product")
	public void verifyCurrentOrderStatus() {
		 System.out.println("Scenario 2 then step");
	}

	
}
