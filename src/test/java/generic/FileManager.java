package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileManager 
{
	Properties pro;
	public FileManager()
	{
		try 
		{
			FileInputStream fis=new FileInputStream("./configuration.properties");
			pro=new Properties();
			pro.load(fis);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getSHUrl()
	{
		String url=pro.getProperty("SH");
		if(url==null)
		{
			throw new RuntimeException("url not found");
		}
		return url;
	}
	
	public String getNIUrl()
	{
		String url=pro.getProperty("NI");
		if(url==null)
		{
			throw new RuntimeException("url not found");
		}
		return url;
	}
	
	public String getMYUrl()
	{
		String url=pro.getProperty("MY");
		if(url==null)
		{
			throw new RuntimeException("url not found");
		}
		return url;
	}
	
	public String getLUUrl()
	{
		String url=pro.getProperty("LU");
		if(url==null)
		{
			throw new RuntimeException("url not found");
		}
		return url;
	}
	
	public String getFBUrl()
	{
		String url=pro.getProperty("FB");
		if(url==null)
		{
			throw new RuntimeException("url not found");
		}
		return url;
	}
	
	public String getPPUrl()
	{
		String url=pro.getProperty("PP");
		if(url==null)
		{
			throw new RuntimeException("url not found");
		}
		return url;
	}
}
