package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	public static String randomstring()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public static String randomnumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	public static String randomalphanumeric()
	{
		String str1=RandomStringUtils.randomAlphabetic(7);
		String str2=RandomStringUtils.randomNumeric(3);
		return (str1+str2);
	}

}
