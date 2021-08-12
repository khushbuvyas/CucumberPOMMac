package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarSearchPageActions {

	public CarSearchPageLocators searchPagelocator;

	public CarSearchPageActions() {

		this.searchPagelocator = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchPagelocator);
	}

	public void selectCarBrand(String carBrand) {

		Select select = new Select(searchPagelocator.anyMake);
		select.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carModel) {

		Select select = new Select(searchPagelocator.anyModel);
		select.selectByVisibleText(carModel);
	}

	public void selectCarLocation(String carLocation) {

		Select select = new Select(searchPagelocator.anyLocation);
		select.selectByVisibleText(carLocation);
	}

	public void selectCarPrice(String carPrice) {

		Select select = new Select(searchPagelocator.price);
		select.selectByVisibleText(carPrice);
	}
	
	public void clickonFindCar() {
		
		searchPagelocator.submitButton.click();
	}

}
