package saucedemotests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import saucedemopages.LoginPage;
import saucedemopages.ProductPage;

public class ProductTest extends BaseTest{
	
	
	@BeforeMethod
	public void loginBeforePayment() {
		LoginPage lp = new LoginPage(driver);
		lp.loginDetails("standard_user", "secret_sauce");
		lp.clickButton();
		
		
	}
	@Test
public void addProducts() {
		ProductPage pp = new ProductPage(driver);
		pp.addBackpack();
		pp.addBikelight();
		pp.addFleecejacket();
		pp.addOnesie();
		pp.clickCartButton();
		pp.clickCheckout();
		
	} 
	

}
