package com.traxsmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.traxsmart.qa.base.TestBase;

public class HomePage  extends TestBase{
	
	@FindBy(xpath="(//a[@class=\"nav-link\"])[11]")
	
	WebElement ServiceReportLink;
	
	@FindBy(xpath="(//a[@href=\"#/service-request\"])[1]")
	
	WebElement servicerequesttLink;
	
	
	
	
	//initialization the page object 
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ServiceRequestPage ClickOnServiceRequestLink()
	{
		ServiceReportLink.click();
		
		return new ServiceRequestPage();
	}
	
	public ServiceReportPage  ClickOnServiceReportLink()
	{
		ServiceReportLink.click();
	 	
		return new ServiceReportPage();

		
	}

}
