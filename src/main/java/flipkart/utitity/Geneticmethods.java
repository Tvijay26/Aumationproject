package flipkart.utitity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geneticmethods {
	
	public static WebDriver diver;


	public static void openbrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			diver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			diver = new FirefoxDriver();
		}
		
	}


	public static void Enterurl(String url)
	{
		diver.get(url);
		diver.manage().window().maximize();
	}

	public static void main(String[] args) {
		openbrowser("firefox");
		Enterurl("https://flipkart.com");

	}
}
