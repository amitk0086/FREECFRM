package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
		 public HomePageTest()
		 {
			 super();
		 }
		 
		 @BeforeMethod
		 public void Setup()
		 {
			 initialization();
			 loginpage = new LoginPage();
			 homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 }
		 
		 @Test
		 public void VerifyHomePageTitleTest()
		 {
			 String Homepagetitle= homepage.VerifyHomePageTitle();
			 Assert.assertEquals(Homepagetitle, "Cogmento CRM11", "Home Page Title Not Matched");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 @AfterMethod
		 public void tearDown()
		 {
			 driver.quit();
		 }
 	
	
}
