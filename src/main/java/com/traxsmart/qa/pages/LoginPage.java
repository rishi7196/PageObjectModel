package com.traxsmart.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.traxsmart.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-rose btn-lg col-md-9 login-btn']")
	WebElement SignIn;
	
	@FindBy(xpath="(//a[@class='nav-link'])[2]")
	public WebElement login_btn;
	
	//initliazation the page object 
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public HomePage Login(String un,String pwd) throws InterruptedException
	{
		login_btn.click();
		Thread.sleep(5000);
		username.sendKeys(un);
		Thread.sleep(3000);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", SignIn);
    	Thread.sleep(5000);
		
		return  new HomePage();
	}

}
