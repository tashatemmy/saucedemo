package saucedemotests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	public void callWebsite() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", Map.of(
		    "credentials_enable_service", false,
		    "profile.password_manager_enabled", false
		));
		options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void quitBrowser() {
		if (driver != null) {
            driver.quit();
        }
		
	}

}
