package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features = {"src\\test\\java\\application\\loginpage.feature"},
	
	glue = {"steps"},
	
	plugin = {"pretty"}
	
	
		
		
		)


public class LoginTestRunner {

}
