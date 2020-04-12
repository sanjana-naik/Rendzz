package pom;

import generic.Base_page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomensShoesSandalPage extends Base_page
{
	@FindBy(xpath="//a[.='Nike Benassi JDI Floral']")
	private WebElement sandal;
	
	public WomensShoesSandalPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOnSandal()
	{
		sandal.sendKeys(Keys.ENTER);
	}
	
}
