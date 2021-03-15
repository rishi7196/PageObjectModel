package com.traxsmart.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.traxsmart.qa.base.TestBase;
import com.traxsmart.qa.pages.HomePage;
import com.traxsmart.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	 LoginPage loginpage;
	 HomePage homepage;
	
	 public LoginPageTest() {
		 super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    loginpage= new LoginPage();
	}
	@Test(priority=1)
	public void LoginPageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Traxsmart ERP");
		System.out.println("Print the title of login page::::::: "+title);
		}
	@Test(priority=2)
	public void LoginTest() throws InterruptedException
	{ 
		
		homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("User logged in Sucessfully");
		
		
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	

}
