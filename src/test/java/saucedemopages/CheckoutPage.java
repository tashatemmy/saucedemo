package saucedemopages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	
	@FindBy(id = "first-name")
	WebElement firstName;
	
	@FindBy(id = "last-name")
	WebElement lastName;
	
	@FindBy(id = "postal-code")
	WebElement postalCode;
	
	@FindBy(id = "continue")
	WebElement continueButton;
	
	@FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
	WebElement backpackLink;
	
	@FindBy(id = "finish")
	WebElement finishButton;
	
	@FindBy(id ="back-to-products")
	WebElement backHome;
	
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	public void inputCheckoutDetails(String firstname, String lastname, String zipcode) {
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		postalCode.sendKeys(zipcode);
		action.moveToElement(continueButton).perform();
		continueButton.click();
		wait.until(ExpectedConditions.visibilityOf(backpackLink));
		action.moveToElement(backpackLink).perform();;
		action.scrollToElement(finishButton);
		finishButton.click();
		wait.until(ExpectedConditions.visibilityOf(backHome)).click();
		
	}
	
	
	

}
