package tasks;

import java.util.ArrayList;

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
		this.selectProductAppObject.getOKCEPButton().click();
	}
	
	public ArrayList<String> getValuesBeforeBuy()
	{
		ArrayList<String> minhalista = new ArrayList<String>();
		minhalista.add(this.selectProductAppObject.getValueBeforeBuy().getText());
		minhalista.add(this.selectProductAppObject.getFreightBeforeBuy().getText());
		return minhalista;
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
	
	public ArrayList<String> finalValues() {
		ArrayList<String> minhalista = new ArrayList<String>();
		minhalista.add(this.selectProductAppObject.getFinalValue().getText());
		minhalista.add(this.selectProductAppObject.getFinalFreight().getText());
		minhalista.add(this.selectProductAppObject.getFinalTotalValue().getText());
		minhalista.add(this.selectProductAppObject.getFinalName().getText());
		minhalista.add(this.selectProductAppObject.getFinalAdress().getText());
		minhalista.add(this.selectProductAppObject.getFinalNeighbourhood().getText());
		minhalista.add(this.selectProductAppObject.getFinalCity().getText());
		minhalista.add(this.selectProductAppObject.getFinalCEP().getText());
		return minhalista;
		
	}
	
}
