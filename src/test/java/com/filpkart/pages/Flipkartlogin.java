package com.filpkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartlogin
{
	 @FindBy(xpath="//input[contains(@class,'r4vIwl')]") WebElement emailaddress;
     @FindBy(xpath="//span[text()='Login']")WebElement loginbutton;
    
     public Flipkartlogin(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     public void clickonlogin()
     {
    	 loginbutton.click();
     }
     public void enteremailaddress(String e1)
     {
    	 emailaddress.sendKeys(e1);
     }
     
     
}
