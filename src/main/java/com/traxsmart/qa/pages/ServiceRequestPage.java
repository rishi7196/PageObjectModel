package com.traxsmart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.traxsmart.qa.base.TestBase;

public class ServiceRequestPage extends TestBase{
//	
//	@FindBy(xpath="(//a[@class=\"nav-link\"])[11]")
//	
//	WebElement serviceRequest;
//	
//	@FindBy(name="name")
//	WebElement name;
//	@FindBy(name="phone")
//	WebElement phone;
//	@FindBy(name="email")
//	WebElement email;
//	@FindBy(xpath="//input[@id=\"mat-input-3\"]")
//	WebElement Address;
//	@FindBy(xpath="(//div[@class=\"mat-form-field-infix\"])[5]")
//	WebElement subject;
//	@FindBy(xpath="(//div[@class=\"mat-form-field-infix\"])[7]")
//	WebElement Description;
//	@FindBy(xpath="//button[@type=\"submit\"]")
//	
//	WebElement submitBtn;	
//	
	public ServiceRequestPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void fillServiceRequest() throws InterruptedException
	{
     	JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(250,0)", "");
	
		
		
		driver.findElement(By.name("name")).sendKeys("amit");	
		driver.findElement(By.name("phone")).sendKeys("0987654321");		
		driver.findElement(By.name("email")).sendKeys("rishi@traxsmart.in");		
		driver.findElement(By.name("address")).sendKeys("patna");
		Thread.sleep(2000);		
		driver.findElement(By.name("subject")).sendKeys("device");		
		driver.findElement(By.xpath("(//div[@class=\"mat-select-value\"])[1]")).click();
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();		
		driver.findElement(By.name("description")).sendKeys("abc");		
		driver.findElement(By.xpath("(//div[@class=\"mat-select-value\"])[2]")).click();
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
		
	}
	{
		
//		Select sc= new Select(driver.findElement(By.className("option")));
//		sc.selectByVisibleText(option);
//		sc= new Select(driver.findElement(By.className("option")));		
//		sc.selectByVisibleText("option");
//		
//		name.sendKeys(nm);
//		phone.sendKeys(num);
//		email.sendKeys(eml);
//		Address.sendKeys(add);
//		subject.sendKeys(sub);
//		driver.findElement(By.xpath("(//div[@class=\"mat-form-field-infix\"])[6]")).click();
//		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();
//		driver.findElement(By.xpath("//span[@class=\"mat-select-placeholder ng-tns-c3-9 ng-star-inserted\"]")).click();
//		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[4]")).click();
//		
//		Description.sendKeys(desc);
//		submitBtn.click();
	}
}