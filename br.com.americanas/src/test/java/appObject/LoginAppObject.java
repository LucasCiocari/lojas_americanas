package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	private WebDriver driver;
	
	public LoginAppObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getEmailField() {
		return this.driver.findElement(By.id("email-input"));
	}
	
	public WebElement getPasswordField() {
		return this.driver.findElement(By.id("password-input"));
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.id("login-button"));
	}
}
