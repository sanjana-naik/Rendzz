package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Screenshot 
{
	public static String capture(WebDriver driver,String testName)
	{
		Date d=new Date();
		String d1 = d.toString();
		String date = d1.replace(":", "-");
		String path="./photos"+date+testName+".png";
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			Reporter.log("failed to take screenshot", true);
		}
		return path;
	}
}
