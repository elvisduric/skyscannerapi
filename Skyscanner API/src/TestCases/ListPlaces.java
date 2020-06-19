package TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import ObjectRepository.ListPlacesObjects;

public class ListPlaces extends WebdriverDefinition {
	
	@Test
	public void ListPlacesForm () {
		
		getdriver().get("https://rapidapi.com/skyscanner/api/skyscanner-flight-search/endpoints");
		ListPlacesObjects lpform = new ListPlacesObjects(driver);
		lpform.fieldQuery().sendKeys("Munich");
		lpform.fieldCountry().sendKeys("DE");
		lpform.fieldCurrency().sendKeys("EUR");
		lpform.fieldLocale().sendKeys("de-DE");
		lpform.fieldLocale().sendKeys(Keys.ENTER);
		
		String actualString = lpform.Result().getText();
		assertTrue(actualString.contains("Success"));
		
	}

}