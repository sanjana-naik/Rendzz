package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineshoppingPage extends Base_page
{
	@FindBy(xpath="(//a[contains(.,'Living')])[1]")
	private WebElement homeliving;
	
	@FindBy(xpath="//a[.='Floor Lamps']")
	private WebElement floorlamps;
	
	public OnlineshoppingPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void mouseOverOnHomeLiving(WebDriver driver)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(homeliving).perform();
	}
	
	public void clickOnFloorlamp()
	{
		floorlamps.click();
	}
	
	
	
}
