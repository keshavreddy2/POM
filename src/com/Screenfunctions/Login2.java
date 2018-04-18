package com.Screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Genericfunctions.CommonFunction1;


public class Login2 extends CommonFunction1 {
	
@FindBy(how = How.XPATH, using = "//*[text()='Admin ']")
public static WebElement adminlnk;
 @FindBy(how = How.XPATH, using = "//input[@name='uname']")
  public static WebElement username;
 @FindBy(how = How.XPATH, using= "//input[@pname='pwd']")
 public static WebElement password;
  @FindBy(how= How.XPATH, using = "//input[@name= 'submitBtn]")
  public static WebElement login;
  
 public static void Validate_field_verify()
 {
	 boolean status = true;
	 status = waitForElement(username);
	 
	 /*if(status)
	 {
		 arr.assertEquals(true, username.isDisplayed()); 
		 
		 if (username.isDisplayed())
		 {
			 System.out.println("username  is displayed");
		 }
	 }
	 */
	 	 try
	 	 {
	 		adminlnk.click();
	 		 System.out.println("link is found");
	 	 }
	 	 catch(Exception e)
	 	 {
	 		 System.out.println("link not found");
	 	 }
	 	 
	 	 try
	 	 {
	 		username.sendKeys("admin");
	 	 }catch(Exception e)
	 	 {
	 		 status = false;
	 	 }
	 	 	 try
	 		 {
	 			password.sendKeys("admin");
	 		 }catch(Exception e)
	 		 {
	 			 status = false;
	 		 }
	 		 try
	 		 {
	 			login.click();
	 		 }catch(Exception e)
	 		 {
	 			 System.out.println("login sucuess");
	 		 }
	 		 }
	 		 
	 	 }
	 


