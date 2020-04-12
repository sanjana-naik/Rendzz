package regressionscripts;

import generic.Generic_test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.NikeBenassiJDIFloralPage;
import pom.NikeJustDoItPage;
import pom.NikeStoreCartPage;
import pom.WomensShoesSandalPage;

public class TestNike extends Generic_test
{
	@Test
	public void Nike() throws InterruptedException
	{	
		NikeJustDoItPage njd=new NikeJustDoItPage(driver);
		njd.mouseOverOnWomen(driver);
		Thread.sleep(2000);
		njd.clickOnSandalFlipflop();
		
		WomensShoesSandalPage wss=new WomensShoesSandalPage(driver);
		Thread.sleep(4000);
		//wss.clickOnX();
		wss.clickOnSandal();
		
		NikeBenassiJDIFloralPage nb=new NikeBenassiJDIFloralPage(driver);
		Thread.sleep(2000);
		nb.clickOnSize();
		nb.clickOnAddToBag();
		//Thread.sleep(2000);
		nb.clickOnCheckout();
		
		NikeStoreCartPage ns=new NikeStoreCartPage(driver);
		Thread.sleep(4000);
		ns.clickOnRemove();
		Thread.sleep(4000);
		ns.emptyBag();
	}
}
