package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.UsedCarSearchLocators;
import utilities.SeleniumDriver;

public class UsedCarSearchPageActions {

    public UsedCarSearchLocators usedCarSearchLocators;

    public UsedCarSearchPageActions(){

        this.usedCarSearchLocators = new UsedCarSearchLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),usedCarSearchLocators);
    }

    public void selectCarBrand(String carBrand) {

        Select select = new Select(usedCarSearchLocators.anyMake);
        select.selectByVisibleText(carBrand);
    }

    public void selectCarModel(String carModel) {

        Select select = new Select(usedCarSearchLocators.anyModel);
        select.selectByVisibleText(carModel);
    }

    public void selectCarLocation(String carLocation) {

        Select select = new Select(usedCarSearchLocators.anyLocation);
        select.selectByVisibleText(carLocation);
    }

    public void selectCarPrice(String carPrice) {

        Select select = new Select(usedCarSearchLocators.price);
        select.selectByVisibleText(carPrice);
    }

    public void clickonFindCar() {

        usedCarSearchLocators.submitButton.click();
    }
}
