package appObject;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAppObject {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginAppObject(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
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
	
	public WebElement getFacebookLoginButton()
	{
		return this.driver.findElement(By.className("facebookLogin"));
	}
	
	public WebElement getEmailFieldOfFacebookLogin()
	{
		return this.driver.findElement(By.name("email"));
	}
	
	public WebElement getPasswordFieldOfFacebookLogin()
	{
		return this.driver.findElement(By.id("pass"));
	}
	
	public WebElement getLoginButtonOfFacebookLogin()
	{
		wait.until(presenceOfElementLocated(By.id("loginbutton")));
		return this.driver.findElement(By.id("loginbutton"));
	}
}
