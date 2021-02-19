package com.crm.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy (xpath="//span[contains(text(),'Amit Jaiswal')]")
	WebElement userNameLabel;
	
	@FindBy (xpath= "//span[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	
	
	@FindBy (xpath="//span[contains(text(),'Deals')]")
	WebElement Dealslink;
	
	@FindBy (xpath="//span[contains(text(),'Tasks')]")
	WebElement Taskslink;
	
	//Initialization of HomePage
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	 //Action
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickonContactsLink()
	{
		contactslink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickonDealsLink()
	{
		Dealslink.click();
		return new DealsPage();
	}
	
	public Taskspage clickonTaskLink()
	{
		Taskslink.click();
		return new Taskspage();
	}
}
