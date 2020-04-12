package generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_page 
{
	public WebDriver driver;
	public Base_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyElement(int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("title displayed", true);
		}
		catch(Exception e)
		{
			Reporter.log("title not displayed", true);
			Assert.fail();
		}
	}
	public void clickableElement(int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{	
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
		catch(Exception e)
		{
			System.out.println("fail to locate element");
		}
	}
	public void verifyTitle(int time,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title displayed", true);
		}
		catch(Exception e)
		{
			Reporter.log("title not displayed", true);
			Assert.fail();
		}
	}
}
