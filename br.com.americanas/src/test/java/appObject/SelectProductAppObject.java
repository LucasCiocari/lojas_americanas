package appObject;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProductAppObject {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public SelectProductAppObject(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
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
	
	public WebElement getOKCEPButton() {
		return this.driver.findElement(By.id("bt-freight-product"));
	}
	
	public WebElement getBuyButton1() {
		return this.driver.findElement(By.id("btn-buy"));
	}

	public WebElement getContinueButton()
	{
		return this.driver.findElement(By.id("buy-button"));
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
		wait.until(presenceOfElementLocated(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/payment-summary/section/div/table/tbody/tr[1]/td[2]")));
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/payment-summary/section/div/table/tbody/tr[1]/td[2]"));
	}
	
	public WebElement getFinalFreight()
	{
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/payment-summary/section/div/table/tbody/tr[3]/td[2]"));
	}
	public WebElement getFinalTotalValue()
	{
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/payment-summary/section/div/table/tfoot/tr[2]/td[2]/strong"));
	}
	public WebElement getFinalName()
	{
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/div/section/div/div/dl/dt"));
	}
	
	public WebElement getFinalAdress()
	{
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/div/section/div/div/dl/dd[1]"));
	}
	public WebElement getFinalNeighbourhood()
	{
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/div/section/div/div/dl/dd[2]"));
	}
	public WebElement getFinalCity()
	{
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/div/section/div/div/dl/dd[3]"));
	}
	public WebElement getFinalCEP()
	{
		return this.driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/section/div/section/div[1]/div/section/div/div/dl/dd[4]"));
	}
	public WebElement getValueBeforeBuy()
	{
		return this.driver.findElement(By.className("sales-price"));
	}
	public WebElement getFreightBeforeBuy() {
		wait.until(presenceOfElementLocated(By.className("freight-option-default")));

		return this.driver.findElement(By.className("freight-option-default"));
	}

}
