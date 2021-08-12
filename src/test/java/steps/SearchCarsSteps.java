package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarSearchPageActions;
import utilities.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	UsedCarSearchPageActions usedCarSearchPageActions = new UsedCarSearchPageActions();
	
	@Given("I am on the home page {string} of carsguide website")
	public void i_am_on_the_home_page_of_carsguide_website(String websiteURL) {
	    
		SeleniumDriver.openPage(websiteURL);
		
	}
	
	@When("I move to buy+sell menu")
	public void i_move_to_buy_sell_menu(List<String> list) throws Throwable {
		String menu = list.get(1);
		System.out.println("Selected menu is: -"+menu);
		
		carsGuideHomePageActions.moveToBuySellMenu();
		
	}
	

	@And("click on {string} link")
	public void click_on_link(String searchCars) {
	    
		carsGuideHomePageActions.clickonSearchCars();
	
	}
	
	@And("click on {string} link to validate Used car search")
	public void click_on_link_used(String usedSearchCars)
	{
		carsGuideHomePageActions.clickonUsedCars();
	}

	@And("I select {string} from Any Make dropdwon")
	public void i_select_from_any_make_dropdwon(String carBrand) {
	   
		carSearchPageActions.selectCarBrand(carBrand);
		
	}

	@And("I select {string} from Any Model dropdwon")
	public void i_select_from_any_model_dropdwon(String carModel) {
	    
		carSearchPageActions.selectCarModel(carModel);

	}

	@And("I select {string} from Any Location dropdwon")
	public void i_select_from_any_location_dropdwon(String carLocation) {
	    
		carSearchPageActions.selectCarLocation(carLocation);

	}

	@And("I select {string} from Price dropdwon")
	public void i_select_from_price_dropdwon(String carPrice) {

		carSearchPageActions.selectCarPrice(carPrice);
	
	}

	@And("click on {string} button")
	public void click_on_button(String string) {
	    
		carSearchPageActions.clickonFindCar();
	
	}

	@Then("I should see the list of searched cars")
	public void i_should_see_the_list_of_searched_cars() {
	   
		System.out.println("Car list displaying");
	}

	@And("the title of the page should be {string}")
	public void the_title_of_the_page_should_be(String expected) {
	    
		String actual = SeleniumDriver.getDriver().getTitle();
		
		System.out.println(SeleniumDriver.getDriver().getTitle());
		Assert.assertEquals(actual, expected);
		
	}

}
