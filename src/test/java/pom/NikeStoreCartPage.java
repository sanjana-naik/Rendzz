package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NikeStoreCartPage extends Base_page
{
	@FindBy(xpath="(//button[.='Remove'])[2]")
	private WebElement remove;
	
	@FindBy(xpath="//p[.='There are no items in your bag.']")
	private WebElement emptybag;
	
	public NikeStoreCartPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOnRemove()
	{
		remove.click();
	}
	
	public void emptyBag()
	{
		if(emptybag.isDisplayed())
			System.out.println("Bag is empty");
		else
			System.out.println("bagg is full");
	}
	
}
