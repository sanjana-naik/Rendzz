package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloorLampsBuyPage extends Base_page
{
	@FindBy(xpath="(//div[@class='product-imageSliderContainer'])[13]")
	private WebElement product;
	
	public FloorLampsBuyPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOnLamp()
	{
		product.click();
	}
}
