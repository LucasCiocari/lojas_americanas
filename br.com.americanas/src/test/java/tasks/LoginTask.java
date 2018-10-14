package tasks;

import org.openqa.selenium.WebDriver;

import appObject.LoginAppObject;

public class LoginTask {
private LoginAppObject loginAppObject;
	
	public LoginTask(WebDriver driver) {
		this.loginAppObject = new LoginAppObject(driver);
	}
	
	public void fillLoginFields(String email, String password) {
		this.loginAppObject.getEmailField().sendKeys(email);
		this.loginAppObject.getPasswordField().sendKeys(password);

	}
	
	public void pressLoginButton()
	{
		this.loginAppObject.getLoginButton().click();
	}
	
	public void loginWithFacebook(String email, String password)
	{
		this.loginAppObject.getEmailFieldOfFacebookLogin().sendKeys(email);;
		this.loginAppObject.getPasswordFieldOfFacebookLogin().sendKeys(password);;
		this.loginAppObject.getLoginButtonOfFacebookLogin().click();
	}
	
	public void clickFBButton()
	{
		this.loginAppObject.getFacebookLoginButton().click();		
	}
	

}
