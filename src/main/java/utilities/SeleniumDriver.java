package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;*/

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	
	// SingleTon Design Pattern
	
	/*public static ExtentReports report = ExtentReportManager.getInstance();
	public static ExtentTest test;*/
	
	private static SeleniumDriver seleniumdriver;
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	
	private SeleniumDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);	
		
	}
	
	public static void openPage(String url) {
		
		driver.get(url);
	}

	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static void setupDriver() {
		
		if(seleniumdriver==null) {
			
			seleniumdriver = new SeleniumDriver();
		}
	}
	
	
	public static void tearDown() {
		
		if(driver!=null) {
			
			driver.close();
			driver.quit();
		}
		
		seleniumdriver = null;
	}
}
