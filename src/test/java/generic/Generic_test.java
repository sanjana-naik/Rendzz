package generic;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Generic_test implements Auto_const
{
	public WebDriver driver;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports reports;
	public static ExtentTest test;	
	
	public Logger log=Logger.getLogger(Generic_test.class);
	
	@BeforeSuite
	public void setUp()
	{
		htmlreporter=new ExtentHtmlReporter("./Ereports/report.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlreporter);
	}
	
	
	@BeforeMethod
	public void openApp()
	{
		log.info("browser is launched");
		driver=BrowserFactory.getBrowser("firefox");
		driver.get(new FileManager().getPPUrl());
	}	
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		System.out.println(res.getStatus());
		if(ITestResult.FAILURE==res.getStatus())
		{
			String testName=res.getName();
			//Screenshot.capture(driver, testName);
			test.fail("testcase failed", MediaEntityBuilder.
					createScreenCaptureFromPath(Screenshot.capture(driver, testName)).build());
		}
		BrowserFactory.closeBrow();
	}
	
	@AfterSuite
	public void tearDown()
	{
		reports.flush();
	}
}
