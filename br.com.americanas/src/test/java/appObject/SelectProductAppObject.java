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
	
	public WebElement getCEPField() {
		return this.driver.findElement(By.id("input-freight-product"));
	}
	
	public WebElement getOKButton() {
		return this.driver.findElement(By.id("bt-freight-product"));
	}
	
	public WebElement getBuyButton() {
		return this.driver.findElement(By.id("btn-buy"));
	}
}
