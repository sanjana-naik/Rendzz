package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyHomesakeBeigeHandcraftedLampPage extends Base_page
{
	@FindBy(xpath="//div[.='ADD TO BAG']")
	private WebElement lamp;
	
	@FindBy(xpath="//a[.='GO TO BAG']")
	private WebElement bag;
	
	public BuyHomesakeBeigeHandcraftedLampPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void addToBag()
	{
		lamp.click();
	}
	
	public void goToBag()
	{
		bag.click();
	}
}
