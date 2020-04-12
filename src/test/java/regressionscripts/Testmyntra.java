package regressionscripts;

import generic.Generic_test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.BuyHomesakeBeigeHandcraftedLampPage;
import pom.FloorLampsBuyPage;
import pom.OnlineshoppingPage;
import pom.ShoppingBagPage;

public class Testmyntra extends Generic_test
{
	@Test
	public void login() throws InterruptedException
	{
		OnlineshoppingPage ons=new OnlineshoppingPage(driver);
		ons.mouseOverOnHomeLiving(driver);
		Thread.sleep(2000);
		ons.clickOnFloorlamp();
		
		FloorLampsBuyPage flb=new FloorLampsBuyPage(driver);
		flb.clickOnLamp();
		String parent = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String win:allwin)
		{
			driver.switchTo().window(win);
		}
		
		Thread.sleep(2000);
		BuyHomesakeBeigeHandcraftedLampPage bhs=new BuyHomesakeBeigeHandcraftedLampPage(driver);
		bhs.addToBag();
		bhs.goToBag();
		
		Thread.sleep(2000);
		ShoppingBagPage sb=new ShoppingBagPage(driver);
		sb.clickOnRemove();
		sb.clickOnRemPopup();
		Thread.sleep(2000);
		sb.isCartEmpty();
		
	}
}
