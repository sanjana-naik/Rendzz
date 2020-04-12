package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NikeBenassiJDIFloralPage extends Base_page
{
	@FindBy(xpath="//label[.='US 7']")
	private WebElement size;
	
	@FindBy(xpath="//button[.=' Add to Bag']")
	private WebElement addtobag;
	
	@FindBy(xpath="//button[.='Checkout']")
	private WebElement checkout;
	
	public NikeBenassiJDIFloralPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOnSize()
	{
		size.click();
	}
	
	public void clickOnAddToBag()
	{
		addtobag.click();
	}
	
	public void clickOnCheckout()
	{
		checkout.click();
	}

}
