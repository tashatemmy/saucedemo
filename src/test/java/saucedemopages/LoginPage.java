package saucedemopages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	
	@FindBy(id = "user-name")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login-button")
	WebElement button;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void loginDetails(String name, String passWord) {
		username.sendKeys(name);
		password.sendKeys(passWord);
		
	}
	public void clickButton() {
		button.click();
	}
	
	
	

}
