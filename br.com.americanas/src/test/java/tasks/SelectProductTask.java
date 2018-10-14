package tasks;

import org.openqa.selenium.WebDriver;

import appObject.SelectProductAppObject;

public class SelectProductTask {
	
	private SelectProductAppObject selectProductAppObject;

	public SelectProductTask(WebDriver driver) {
		this.selectProductAppObject = new SelectProductAppObject(driver);
	}

	public void MakeASearchFor(String product) {
		this.selectProductAppObject.getSearchBar().sendKeys(product);
		this.selectProductAppObject.getSearchButton().click();

	}
	
	public void clickOnFirstProduct()
	{
		this.selectProductAppObject.getFirstProduct().click();
	}
	
	public void sendThisPackageTo(String CEP) {
		this.selectProductAppObject.getCEPField1().sendKeys(CEP);
	}
	
	public void addToCart()
	{
		this.selectProductAppObject.getBuyButton1().click();
		this.selectProductAppObject.getContinueButton().click();
	}
	
	public void goToCart() {
		this.selectProductAppObject.getCartDropdown().click();
		this.selectProductAppObject.getShowCartButton().click();
	}
	
	public void goToLogin() {
		this.selectProductAppObject.getBuyButton().click();
	}
	
	public String finalValues() {
		return this.selectProductAppObject.getFinalValue().getText();
		
	}
	
}
