package com.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Genericfunctions.CommonFunction1;
import com.Screenfunctions.Login2;



public class Tc_02_VerifyLoginFields extends CommonFunction1  {

	@Test
	public static void verifyLoginFields()
	{
		driver.get("http://server/bank/");
        driver.manage().window().maximize();
        
      Login2 lgn = PageFactory.initElements(driver, Login2.class); 
        lgn.Validate_field_verify();
        
		}
}
