package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoComplete_PageObject extends BasePage {
	WebDriver driver;
	
	 public AutoComplete_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
	 // WebElements Locators+identification
//Single values
@FindBy(xpath="//a[normalize-space()='Single Values']")  WebElement singleValues;
@FindBy(xpath="//ul[@id='ui-id-1']//div[@class='ui-menu-item-wrapper']")  WebElement singlevaluesautoComplete;
@FindBy(xpath="//input[@id='txtSingleAutoComplete']")  WebElement clickSingleTag;


//Mutiple values
@FindBy(xpath="//a[normalize-space()='Multiple Values']")  WebElement multipleValues;
@FindBy(xpath="//ul[@id='ui-id-2']//div[@class='ui-menu-item-wrapper']")  WebElement multiplevaluesautoComplete;
@FindBy(xpath="//input[@id='txtMultipleAutoComplete']")  WebElement clickMultiTag;

//Action Methods for single values
public void clickonSingleValues()
{
	singleValues.click();
}
public void clickonSingleValueTag(String value)
{
	clickSingleTag.sendKeys(value);
}
public void singleValueautocomplete()
{
	singlevaluesautoComplete.click();
}

//Action Methods for Multiple values
public void clickonMutipleValues()
{
	multipleValues.click();
}
public void clickonMultipleValueTag(String values)
{
	clickMultiTag.sendKeys(values);
}
public void multipleValueautocomplete()
{
	multiplevaluesautoComplete.click();
}

}
