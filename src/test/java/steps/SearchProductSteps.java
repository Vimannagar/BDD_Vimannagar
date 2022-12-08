package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {
	
	

@Given("user should have logged in")
public void user_should_have_logged_in() {
  System.out.println("Step 1 for Given");
}

@When("user enters the text {string} in search field")
public void user_enters_the_text_in_search_field(String text) {
	  System.out.println("Step 2 for When "+ text);
}

@When("Click on search button")
public void click_on_search_button() {
	  System.out.println("Step 3 for when");
}

@Then("user gets result")
public void user_gets_result() {
	  System.out.println("Step 4 for Then");
}


}
