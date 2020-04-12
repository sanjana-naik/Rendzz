package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBagPage extends Base_page
{
	@FindBy(xpath="//button[.='Remove']")
	private WebElement remove;
	
	@FindBy(xpath="(//div[.='Remove'])[2]")
	private WebElement removeit;
	
	@FindBy(xpath="//div[.='Hey, it feels so light!']")
	private WebElement bag;
	
	public ShoppingBagPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOnRemove()
	{
		remove.click();
	}
	
	public void clickOnRemPopup()
	{
		removeit.click();
	}
	
	public void isCartEmpty()
	{
		if(bag.isDisplayed())
			System.out.println("BBag is empty!!!!!!!!!!!!!!!!!!");
		else
			System.out.println("Noteven empty!!!!!!!");
	}
}
