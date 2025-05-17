package saucedemopages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
	WebElement backpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement cartBackpack;
	
	@FindBy(xpath ="//*[@id=\"item_0_title_link\"]/div")
	WebElement bikelight;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement cartBikelight;
	
	@FindBy(xpath ="//*[@id=\"item_5_title_link\"]/div")
	WebElement fleeceJacket;
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement cartFleecejacket;
	
	@FindBy(xpath ="//*[@id=\"item_2_title_link\"]/div")
	WebElement onesie;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	WebElement cartOnesie;
	
	@FindBy(className = "shopping_cart_link")
	WebElement cart;
	
	@FindBy(id = "checkout")
	WebElement checkout;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	}
	
	public void acceptAlert() {
		try {
		    wait.until(ExpectedConditions.alertIsPresent());

		    Alert alert = driver.switchTo().alert();
		    alert.accept();
		} catch (NoAlertPresentException e) {
		    System.out.println("No alert found – skipping alert handling");
		}
		
	}
	
	public void addBackpack() {
		wait.until(ExpectedConditions.visibilityOf(backpack));
		action.moveToElement(backpack).perform();
		cartBackpack.click();
	}
	
	public void addBikelight() {
		wait.until(ExpectedConditions.visibilityOf(bikelight));
		action.moveToElement(bikelight).perform();
		wait.until(ExpectedConditions.visibilityOf(cartBikelight));
		action.moveToElement(cartBikelight).perform();
		cartBikelight.click();
	}
	
	public void addFleecejacket() {
		wait.until(ExpectedConditions.visibilityOf(fleeceJacket));
		action.moveToElement(fleeceJacket).perform();
		wait.until(ExpectedConditions.visibilityOf(cartFleecejacket));
		action.moveToElement(cartFleecejacket).perform();
		cartFleecejacket.click();
	}
	
	public void addOnesie() {
		wait.until(ExpectedConditions.visibilityOf(onesie));
		action.moveToElement(onesie).perform();
		wait.until(ExpectedConditions.visibilityOf(cartOnesie));
		action.moveToElement(cartOnesie).perform();
		cartOnesie.click();
	}
	
	public void clickCartButton() {
		action.scrollToElement(cart).perform();
		cart.click();
	}
	public void clickCheckout() {
		action.scrollToElement(checkout).perform();
		checkout.click();
		
	}
	
		
	

}
