package com.traxsmart.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.traxsmart.qa.base.TestBase;
import com.traxsmart.qa.pages.HomePage;
import com.traxsmart.qa.pages.LoginPage;
import com.traxsmart.qa.pages.ServiceReportPage;
import com.traxsmart.qa.pages.ServiceRequestPage;

public class HomePageTest  extends TestBase{
	 LoginPage loginpage;
	 HomePage homePage;
	 ServiceReportPage servicereport;
	 ServiceRequestPage servicerequest;
	
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	     servicereport= new ServiceReportPage();
	    servicerequest= new ServiceRequestPage();
	    loginpage= new LoginPage();
	    homePage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}
	
	@Test(priority=1)
	public void verifyHomaPageTitle() throws InterruptedException {
		
		String title1=homePage.verifyHomePageTitle();
		Thread.sleep(2000);
	    Assert.assertEquals(title1, "Traxsmart ERP");
	}
	@Test (priority=2)
	public void verifyServiceReport()
	{
		servicereport=homePage.ClickOnServiceReportLink();
		
	}
	@Test(priority=3)
	public void verifyServiceRequestlink()
	{
		 servicerequest=homePage.ClickOnServiceRequestLink();
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
