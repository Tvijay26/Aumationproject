package com.flipkart.testexecution;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;

import flipkart.utitity.Geneticmethods;
import flipkart.utitity.Propertyreader;


public class Basepage {
	@BeforeMethod
	public void setup() throws Throwable
	{
		Geneticmethods.openbrowser(Propertyreader.vijay("browser"));
		Geneticmethods.Enterurl(Propertyreader.vijay("url"));
	}

	public void takescreenshot() throws Throwable
	{
		String exactdate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		System.out.println(exactdate);
		File file = new File("C:\\Users\\T VIJAY KARTHIK\\OneDrive\\Desktop\\JAVA 2025\\FLIPKART\\screenshot\\"+exactdate+".png");
		TakesScreenshot screen = (TakesScreenshot)Geneticmethods.diver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, file);
		

	}
//        public static void checktime()
//        {
//			Date currenttime = new Date();
//			System.out.println(currenttime);
//			SimpleDateFormat changedate = new SimpleDateFormat("yyyyMMddHHmmss");
//			String changetime=changedate.format(currenttime);
//			System.out.println("changetime is " +changetime);
//		}
//        public static void main(String[] args) {
//			checktime();
//		}
}

