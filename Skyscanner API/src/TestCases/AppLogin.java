package TestCases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import ObjectRepository.LoginPageObjects;

public class AppLogin extends WebdriverDefinition {
	
	@Test
	public void Login() {
	
		getdriver().get("https://rapidapi.com/skyscanner/api/skyscanner-flight-search/details/");
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.LoginButton().click();
		lp.EmailField().sendKeys("duric_elvis@live.com");
		lp.PasswordField().sendKeys("TestPswd1");
		lp.SubmitButton().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actualString = lp.Subscription().getText();
		assertTrue(actualString.contains("Subscribed"));
		
	}
}