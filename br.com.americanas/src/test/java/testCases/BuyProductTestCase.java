package testCases;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.LoginTask;
import tasks.SelectProductTask;
import verificationPoint.FinalValuesVerificationPoint;




public class BuyProductTestCase {
	
	private WebDriver driver;
	private LoginTask login;
	private SelectProductTask selectProduct;
	private FinalValuesVerificationPoint verificationPoint;
	@Before
	public void SetupTest() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("https://www.americanas.com.br");
		this.login = new LoginTask(driver);
		this.selectProduct = new SelectProductTask(driver);	
		this.verificationPoint = new FinalValuesVerificationPoint(driver);
	}
	
	@Test
	public void testMain(){
		
		String currentHandle = this.driver.getWindowHandle();		
		this.selectProduct.MakeASearchFor("pneu");
		this.selectProduct.clickOnFirstProduct();
		this.selectProduct.sendThisPackageTo("91260010");		
		ArrayList<String> resultsBeforeBuy = this.selectProduct.getValuesBeforeBuy();		
		
		this.selectProduct.addToCart();	
		this.driver.get("https://sacola.americanas.com.br/#/basket");			
		this.selectProduct.goToLogin();
				this.login.clickFBButton();		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);		}		
		this.login.loginWithFacebook("testess2b20182@gmail.com", "s2b2018/2");		
		driver.switchTo().window(currentHandle);
		ArrayList<String> results = this.selectProduct.finalValues();	
		
		this.verificationPoint.checkFinalValues(resultsBeforeBuy, results);
	}
	
	
	@After
	public void tearDown() {
	//	driver.quit();
	}

}
