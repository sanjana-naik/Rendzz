package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NikeJustDoItPage extends Base_page
{
	@FindBy(xpath="//a[.='WOMEN']")
	private WebElement mouseover;
	
	@FindBy(xpath="(//a[.='Sandals & Flip Flops'])[2]")
	private WebElement sandflip;
	
	public NikeJustDoItPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void mouseOverOnWomen(WebDriver driver)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(mouseover).perform();
	}
	
	public void clickOnSandalFlipflop()
	{
		sandflip.click();
	}
	
	
	
}
