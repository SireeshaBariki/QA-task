package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImagePage_PageObject extends BasePage {
WebDriver driver;
	
	public ImagePage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
// WebElements Locators+identification

@FindBy(xpath="//input[@id='file']")  WebElement selectFile;
@FindBy(xpath="//button[normalize-space()='Upload']")  WebElement upload;


public void clickSelectFile(String filelocation)
{
	 selectFile.sendKeys(filelocation);
}
public void clickUpload()
{
	 upload.click();
}
}


