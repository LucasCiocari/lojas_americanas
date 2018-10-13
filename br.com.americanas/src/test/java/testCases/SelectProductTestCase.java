package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.SelectProductTask;

public class SelectProductTestCase {
	
	private WebDriver driver;
	private SelectProductTask selectProduct;
	
	@Before
	public void SetupTest() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.americanas.com.br/");
		this.selectProduct = new SelectProductTask(driver);
	
	}
	
	@Test
	public void testMain() {
		this.selectProduct.MakeASearchFor("Fone JBL");
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.selectProduct.clickOnFirstProduct();
		this.selectProduct.sendThisPackageTo("91260010");
		this.selectProduct.addToCart();
		
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
