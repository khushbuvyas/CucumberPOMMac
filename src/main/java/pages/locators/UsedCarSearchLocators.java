package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarSearchLocators {

    @FindBy(how= How.ID, using="makes")
    public static WebElement anyMake;

    @FindBy(how=How.ID, using="models")
    public static WebElement anyModel;

    @FindBy(how=How.ID, using="locations")
    public static WebElement anyLocation;

    @FindBy(how=How.ID, using="priceTo")
    public static WebElement price;

    @FindBy(how=How.ID, using="search-submit")
    public static WebElement submitButton;
}
