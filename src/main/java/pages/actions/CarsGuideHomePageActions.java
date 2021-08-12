package pages.actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {

	public CarsGuideHomePageLocators homePagelocator = null;

	public CarsGuideHomePageActions() {

		this.homePagelocator = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePagelocator);
	}

	public void moveToBuySellMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		
		action.moveToElement(homePagelocator.buysellLink).perform();
	}

	public void clickonSearchCars() {
		
		//moveToBuySellMenu
		homePagelocator.searchCars.click();

	}

	public void clickonUsedCars() {

		//moveToBuySellMenu
		homePagelocator.usedCars.click();
	}
}
