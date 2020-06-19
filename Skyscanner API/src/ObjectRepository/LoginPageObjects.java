package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	WebDriver driver;
	public LoginPageObjects (WebDriver driver) {
		this.driver = driver;
	}

	By login = By.xpath("//*[@id=\"__next\"]/section/div[1]/div/div[2]/div/button[1]");
	By email = By.name("email");
	By pswd = By.name("password");
	By submit = By.xpath("//*[@id=\"__next\"]/section/div[4]/div/div[2]/div/div[1]/div/div[3]/form/button");
	By subscritpion = By.xpath("//*[@id=\"__next\"]/section/main/div/div[1]/section/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/span");
	
	public WebElement LoginButton () {
		return driver.findElement(login);
	}
	
	public WebElement EmailField () {
		return driver.findElement(email);
	}
	
	public WebElement PasswordField () {
		return driver.findElement(pswd);
	}
	
	public WebElement SubmitButton () {
		return driver.findElement(submit);
	}	
	
	public WebElement Subscription () {
		return driver.findElement(subscritpion);
	}	
}
