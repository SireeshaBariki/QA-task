package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class IFrame_PageObject extends BasePage {

WebDriver driver;
	
	public IFrame_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
// WebElements Locators+identification

@FindBy(xpath="//iframe[@id='iframe1']")  WebElement frameOne;
@FindBy(xpath="//iframe[@id='iframe2']")  WebElement frameTwo;
@FindBy(xpath="//iframe[@id='iframe3']")  WebElement frameThree;


public void clickFrameone()
{
	frameOne.click();
}
public void clickFrameTwo()
{
	frameTwo.click();
}
public void clickFrameThree()
{
	frameThree.click();
}
}
