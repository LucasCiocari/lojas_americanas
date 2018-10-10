package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAppObject {

	private WebDriver driver;
	//private WebDriverWait wait;

	public RegisterAppObject(WebDriver driver) {
		this.driver = driver;
		//wait = new WebDriverWait(driver, 10);
	}
	
	public WebElement getEmailField() {
		return this.driver.findElement(By.id("email-input"));
	}
	
	
	public WebElement getPasswordField() {
		return this.driver.findElement(By.id("password-input"));
	}
	
	
	public WebElement getCPFField() {
		return this.driver.findElement(By.id("cpf-input"));
	}
	
	
	public WebElement getFullNameField() {
		return this.driver.findElement(By.id("name-input"));
	}
	
	
	public WebElement getBirthdayField() {
		return this.driver.findElement(By.id("birthday-input"));
	}
	
	
	public WebElement getMaleRadioBtn() {
		return this.driver.findElement(By.xpath("//*[@id=\"gender\"]/div[1]/label"));
	}
	
	public WebElement getFemaleRadioBtn() {
		return this.driver.findElement(By.xpath("//*[@id=\"gender\"]/div[2]/label"));
	}
	
	public WebElement getCellphoneNumberField() {
		return this.driver.findElement(By.id("phone-input"));
	}
	
	public WebElement getSubscriptionCheckbox() {
		return this.driver.findElement(By.className("checkbox-check"));
	}
	
	public WebElement getSubmitButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/button"));
	}
	
	
	
	
	
	
	
	public WebElement getRegisterNewAccountButton()
	{
		By class_name = By.xpath("//*[@id=\"h_user\"]/span[2]/div/a[2]");
		return this.driver.findElement(class_name);
	}
	
	public WebElement getUserIcon() {
		return this.driver.findElement(By.id("h_usr-link"));
	}
	
	
}

