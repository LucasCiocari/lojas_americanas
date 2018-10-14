package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectProductAppObject {

	private WebDriver driver;
	
	public SelectProductAppObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getSearchBar() {
		return this.driver.findElement(By.id("h_search-input"));
	}
	
	public WebElement getSearchButton() {
		return this.driver.findElement(By.id("h_search-btn"));
	}
	
	public WebElement getFirstProduct() {
		return this.driver.findElement(By.className("card-product-details"));
	}
	
	public WebElement getCEPField1() {
		return this.driver.findElement(By.id("input-freight-product"));
	}
	
	public WebElement getOKButton() {
		return this.driver.findElement(By.id("bt-freight-product"));
	}
	
	public WebElement getBuyButton1() {
		return this.driver.findElement(By.id("btn-buy"));
	}

	public WebElement getContinueButton()
	{
		return this.driver.findElement(By.id("btn-continue"));
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
		//wait.until(presenceOfElementLocated(By.id("buy-button")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.driver.findElement(By.id("buy-button"));
	}
	
	public WebElement getFinalValue()
	{
		return this.driver.findElement(By.className("col-xs-2 text-right ng-binding"));
	}
}
