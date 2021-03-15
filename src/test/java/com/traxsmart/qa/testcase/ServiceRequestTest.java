package com.traxsmart.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.traxsmart.qa.base.TestBase;
import com.traxsmart.qa.pages.HomePage;
import com.traxsmart.qa.pages.LoginPage;
import com.traxsmart.qa.pages.ServiceReportPage;
import com.traxsmart.qa.pages.ServiceRequestPage;

public class ServiceRequestTest extends TestBase{
	 LoginPage loginpage;
	 HomePage homePage;
	 ServiceReportPage servicereport;
	 ServiceRequestPage servicerequest;
	
	 
	 public ServiceRequestTest()
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
		     servicerequest= homePage.ClickOnServiceRequestLink();
		    
		}	
	
	@Test
	public void validateServiceFilled() throws InterruptedException
	{
		homePage.ClickOnServiceRequestLink();
		
		servicerequest.fillServiceRequest();
		
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
