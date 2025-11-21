package flipkart.utitity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyreader {
	
	public static void main(String[] args) throws Throwable {
//		FileInputStream f1 = new FileInputStream("C:\\Users\\T VIJAY KARTHIK\\OneDrive\\Desktop\\JAVA 2025\\FLIPKART\\OBJECTREPO\\Amazon.config.proprites");
//		Properties p1 = new Properties();
//		p1.load(f1);
//		String ok=p1.getProperty("url");
//		System.out.println(ok);
		System.out.println(vijay("url"));
		
		
	}
	//method return type string
	//method should be static
	//method parameterized string
	public static String vijay(String s1) throws Throwable
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\T VIJAY KARTHIK\\OneDrive\\Desktop\\JAVA 2025\\FLIPKART\\OBJECTREPO\\Amazon.config.proprites");
		Properties p1 = new Properties();
		p1.load(f1);
		String ok=p1.getProperty(s1);
		return ok;
	}

}
