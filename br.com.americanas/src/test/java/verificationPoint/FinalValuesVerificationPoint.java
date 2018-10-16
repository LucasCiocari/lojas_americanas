package verificationPoint;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FinalValuesVerificationPoint {

	private WebDriver driver;
	private String name = "Trilha de Teste de Software";
	private String address = "Rua Amadeu F. de Oliveira Freitas, 65";
	private String neighbourhood = "Morro Santana";
	private String city = "Porto Alegre - RS";
	private String cep = "CEP 91260-010";
	
	static ExtentTest test;
	static ExtentReports report;	
	
	public FinalValuesVerificationPoint(WebDriver driver)
	{
		this.driver = driver;
		report = new ExtentReports("ExtentReportResults.html");
		test = report.startTest("checkFinalValues");
	}
	
	public boolean checkFinalValues(ArrayList<String> before, ArrayList<String> after)
	{
		Double valueBefore = Double.parseDouble(before.get(0).split(" ")[1].replace(",", "."));
		Double freightBefore = Double.parseDouble(before.get(1).split(" ")[2].replace(",", "."));
		Double valueAfter = Double.parseDouble(after.get(0).replace(",", "."));
		Double freightAfter = Double.parseDouble(after.get(1).replace(",", "."));
		
		Double totalBefore = valueBefore + freightBefore;
		Double totalAfter = Double.parseDouble(after.get(2).replace(",", "."));
		
		
		
		assertEquals(valueBefore, valueAfter);
		assertEquals(freightBefore, freightAfter);
		
		assertEquals(totalBefore, totalAfter);
		assertEquals(name, after.get(3));
		assertEquals(address, after.get(4));
		assertEquals(neighbourhood, after.get(5));
		assertEquals(city, after.get(6));
		assertEquals(cep, after.get(7));
		
		if(cep.contains(after.get(7)))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		if(city.contains(after.get(6)))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		if(neighbourhood.contains(after.get(5)))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		
		if(address.contains(after.get(4)))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		
		if(name.contains(after.get(3)))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		
		if(valueBefore.equals(valueAfter))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		if(freightBefore.equals(freightAfter))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		if(totalBefore.equals(totalAfter))
		{
			test.log(LogStatus.PASS, "Valor está correto.");
		}
		else
		{
			test.log(LogStatus.FAIL, "Valor está incorreto.");
		}
		
		report.endTest(test);
		report.flush();		
		return true;
	}
}
