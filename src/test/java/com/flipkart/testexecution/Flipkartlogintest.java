package com.flipkart.testexecution;

import org.testng.annotations.Test;

import com.filpkart.pages.Flipkartlogin;

import flipkart.utitity.Geneticmethods;
import flipkart.utitity.Propertyreader;

public class Flipkartlogintest extends Basepage
{
      @Test
	public void loginvalidatedata() throws Throwable
	{
		Flipkartlogin fl = new Flipkartlogin(Geneticmethods.diver);
		takescreenshot();
		fl.clickonlogin();
		takescreenshot();
		fl.enteremailaddress(Propertyreader.vijay("username"));
		takescreenshot();
	}
}
