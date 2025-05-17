package saucedemotests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import saucedemopages.CheckoutPage;
import saucedemopages.LoginPage;
import saucedemopages.ProductPage;

public class ChekoutTest extends BaseTest{
	@BeforeMethod
	public void loginandAddProduct() {
		LoginPage lp = new LoginPage(driver);
		lp.loginDetails("standard_user", "secret_sauce");
		lp.clickButton();
		
		ProductPage pp = new ProductPage(driver);
		pp.addBackpack();
		pp.addBikelight();
		pp.addFleecejacket();
		pp.addOnesie();
		pp.clickCartButton();
		pp.clickCheckout();
		
	}
	@Test
	public void proceedToCheckout() {
		CheckoutPage cp = new CheckoutPage(driver);
		cp.inputCheckoutDetails("Temi", "Odey", "17015");
		driver.close();
		
	}

}
