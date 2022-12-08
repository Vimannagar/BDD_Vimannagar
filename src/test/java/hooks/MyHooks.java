package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	
	
	@Before(order = 1)
	public void beforeHook()
	{
		System.out.println("Before hook is executing ");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step is executing ");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("after step is executing ");
	}
	
	@After(order = 1)
	public void afterHook()
	{
		System.out.println("After hook is executing ");
	}
	
	@Before(order = 2)
	public void initBrowser()
	{
		System.out.println("Launching the browser");
	}
	
	
	
	@After(order = 2)
	public void tearDown()
	{
		System.out.println("Quit the browser");
	}

}
