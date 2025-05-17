package saucedemotests;

import org.testng.annotations.Test;
import saucedemopages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void testLoginFunction() {
		LoginPage lp = new LoginPage(driver);
		lp.loginDetails("standard_user", "secret_sauce");
		lp.clickButton();
	}

}
