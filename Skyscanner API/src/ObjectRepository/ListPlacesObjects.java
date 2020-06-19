package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPlacesObjects {
	
	WebDriver driver;
	public ListPlacesObjects (WebDriver driver) {
		this.driver = driver;
	}
	By ListPlaces = By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div/span[2]");
	By Query = By.id("5a9c9efae4b04378c0c9992e");
	By Country = By.id("5a9c9f34e4b0a62b51d062ed");
	By Currency = By.id("5a9c9f63e4b0a62b51d062ee");
	By Locale = By.id("5a9c9f8de4b00687d35733f0");
	By Submit = By.className("EndpointsPlaygroundstyled__TestText-sc-170f7ua-22 cRrQmM");
	By Result = By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/span[2]");
	
	public WebElement GETListPlaces () {
		return driver.findElement(ListPlaces);
	}
	
	public WebElement fieldQuery () {
		return driver.findElement(Query);
	}
	
	public WebElement fieldCountry () {
		return driver.findElement(Country);
	}
	
	public WebElement fieldCurrency () {
		return driver.findElement(Currency);
	}
	
	public WebElement fieldLocale () {
		return driver.findElement(Locale);
	}
	
	public WebElement Submit () {
		return driver.findElement(Submit);
	}
	
	public WebElement Result () {
		return driver.findElement(Result);
	}
	
}
