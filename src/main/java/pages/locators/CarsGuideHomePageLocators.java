package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT, using="buy + sell")
	public static WebElement buysellLink;
	
	@FindBy(how=How.LINK_TEXT, using="reviews")
	public static WebElement reviews;

	@FindBy(how=How.LINK_TEXT, using="news")
	public static WebElement news;
	
	@FindBy(how=How.LINK_TEXT, using="advice")
	public static WebElement advice;
	
	@FindBy(how=How.LINK_TEXT, using="pricing + specs")
	public static WebElement pricing;
	
	@FindBy(how=How.LINK_TEXT, using="Search Cars")
	public static WebElement searchCars;
	
	@FindBy(how=How.LINK_TEXT, using="Used")
	public static WebElement usedCars;
}
