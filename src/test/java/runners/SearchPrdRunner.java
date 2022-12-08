package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features = {"src\\test\\java\\application\\SearchProduct2.feature"},
	
	glue = {"steps"},
	
	tags = "@Smoke",
	
	plugin = {"pretty"}
		
		
		)



public class SearchPrdRunner {

}
