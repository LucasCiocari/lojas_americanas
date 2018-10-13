package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyProductAppObject {
	WebDriver driver;
	
	public BuyProductAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCartDropdown()
	{ 
		return this.driver.findElement(By.id("h_minicart")); 
	}
	
	public WebElement getShowCartButton()
	{
		return this.driver.findElement(By.className("crt-basquet"));
	}
	
	public WebElement getCEPField()
	{
		return this.driver.findElement(By.id("cep"));
	}
	
	public WebElement getBuyButton()
	{
		return this.driver.findElement(By.id("buy-button"));
	}
	
	public WebElement getBilletOptionButton()
	{
		return this.driver.findElement(By.xpath("/html/body/section/div"
								+ "/section/payment-options-menu/section/div"
								+ "/div/nav/ul/li[4]/a/span[2]"));
	}

	public WebElement getPayButton()
	{
		return this.driver.findElement(By.id("bank-slip-submit"));
	}
	
	public WebElement getProductValue()
	{
		return this.driver.findElement(By.id("purchase-products-summary"));
	}

	public WebElement getFreightValue()
	{
		return this.driver.findElement(By.id("purchase-freight-summary"));
	}
	
	public WebElement getTotalValue()
	{
		return this.driver.findElement(By.id("summary-total-amount"));
	}
	
	public WebElement getEmailValue()
	{
		return this.driver.findElement(By.id("purchase-email-customer"));
	}
	
	public WebElement getPaymentType()
	{
		return this.driver.findElement(By.className("--noTextTransformation ng-binding"));
	}
}
