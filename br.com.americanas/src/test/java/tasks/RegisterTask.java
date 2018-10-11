package tasks;

import org.openqa.selenium.WebDriver;

import appObject.RegisterAppObject;

public class RegisterTask {

	private RegisterAppObject registerAppObject;
	
	public RegisterTask(WebDriver driver) {
		this.registerAppObject = new RegisterAppObject(driver);
	}
	
	public void FillForm(String email, String password, String cpf, String name,
			String birthday, String cellphone) {
		this.registerAppObject.getEmailField().sendKeys(email);
		this.registerAppObject.getPasswordField().sendKeys(password);
		this.registerAppObject.getCPFField().sendKeys(cpf);
		this.registerAppObject.getFullNameField().sendKeys(name);
		this.registerAppObject.getBirthdayField().sendKeys(birthday);
		this.registerAppObject.getMaleRadioBtn().click();
		this.registerAppObject.getCellphoneNumberField().sendKeys(cellphone);
		this.registerAppObject.getSubscriptionCheckbox().click();
	}
	
	public void sendRegisterForm()
	{
		this.registerAppObject.getSubmitButton().click();
	}
	
/*	public void startNewRegistration() {
		this.registerAppObject.getRegisterNewAccountButton().click();
	}
	
	public void openLoginAndRegistrationMenu() {
		this.registerAppObject.getUserIcon().click();
	}*/
	
}