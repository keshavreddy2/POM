package com.Genericfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class CommonFunction1 {

	public static WebDriver driver = new FirefoxDriver();
	public static  SoftAssert arr = new  SoftAssert();
	
	public static Boolean waitForElement(WebElement element)
	{
		boolean status=true;
		for(int i=0; i<10;i++)
		{
			try
			{
			status = true;
			Actions acc = new Actions(driver);
			acc.moveToElement((WebElement) element).build().perform();
			System.out.println("Element is identified");
			break;
			}
			catch(Exception e)
			{
				status = false;
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e1)
				{
					
				}
			}
		
		}
	    System.out.println("Wait is cmpleted");
	
       return status;
     
        }
}




	