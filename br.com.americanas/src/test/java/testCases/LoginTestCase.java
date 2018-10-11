package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.LoginTask;

public class LoginTestCase {

	private WebDriver driver;
	private LoginTask login;
	
	@Before
	public void SetupTest() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://cliente.americanas.com.br/simple-login/"
				+ "?next=https%3A%2F%2Fwww.americanas.com.br%2F");
		this.login = new LoginTask(driver);
	
	}
	
	@Test
	public void testMain() {
		this.login.fillLoginFields("testess2b20182@gmail.com", "s2b2018/2");
		this.login.pressLoginButton();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
