package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.RegisterTask;

public class RegisterTestCase {

	private WebDriver driver;
	private RegisterTask register;
	
	@Before
	public void SetupTest() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://cliente.americanas.com.br/simple-login/cadastro/"
				+ "pf?next=https%3A%2F%2Fwww.americanas.com.br%2F");
		this.register = new RegisterTask(driver);
	
	}
	

/*	@Test
	public void enterRegisterWebsite() {
		this.register.openLoginAndRegistrationMenu();
		this.register.startNewRegistration();
	}*/
	
	@Test
	public void testMain() {
		this.register.FillForm("testess2b20182@gmail.com", "s2b2018/2", "29174364928", 
				"Trilha de Teste de Software", "05061907", "66049569543");
		this.register.sendRegisterForm();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
}