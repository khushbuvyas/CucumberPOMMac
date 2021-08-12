package steps;



import cucumber.api.Scenario;
import io.cucumber.java.Before;
import utilities.SeleniumDriver;

public class BeforeActions {
	
	@Before
	public static void setUp(Scenario scenario) {
				
		SeleniumDriver.setupDriver();
		
	}
	
}
