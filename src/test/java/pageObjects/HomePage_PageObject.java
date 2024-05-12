package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_PageObject extends BasePage {
	 
	WebDriver driver;
	
	public HomePage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
// WebElements Locators+identification

@FindBy(xpath="//span[@class='logo-lg font_20']//b[contains(text(),'Magnus')]") WebElement magnus;
@FindBy(xpath="//a[normalize-space()='Home']")  WebElement home;
@FindBy(xpath="//a[normalize-space()='Employee']")  WebElement employee;
@FindBy(xpath="//a[normalize-space()='More']") WebElement more;
@FindBy(xpath="//a[normalize-space()='Settings']")  WebElement settings;


@FindBy(xpath="//a[normalize-space()='Create']")  WebElement create;
@FindBy(xpath="//a[normalize-space()='Search']")  WebElement search;
@FindBy(xpath="//a[normalize-space()='Multiple Tabs']")  WebElement multipleTabs;
@FindBy(xpath="//a[normalize-space()='Menu']")  WebElement menu;
@FindBy(xpath="//a[normalize-space()='Autocomplete']")  WebElement autocomplete;
@FindBy(xpath="//a[normalize-space()='Collapsible Content']")  WebElement collapsibleContent;
@FindBy(xpath="//a[normalize-space()='Images']")  WebElement images;
@FindBy(xpath="//a[normalize-space()='Slider']")  WebElement slider;
@FindBy(xpath="//a[normalize-space()='Tooltips']")  WebElement tooltips;
@FindBy(xpath="//a[normalize-space()='Popups']")  WebElement popups;
@FindBy(xpath="//a[normalize-space()='Links']")  WebElement links;
@FindBy(xpath="//a[normalize-space()='CSS Properties']")  WebElement cSSProperties;
@FindBy(xpath="//a[normalize-space()='iFrames']")  WebElement iFrames;
	
//Action methods


public String displaymagnus()
{
	try {
	return (magnus.getText());
	}
	catch(Exception e)
	{
	return(e.getMessage());	
	}
}
public void clickEmployee()
{
	employee.click();
}
public void clickCreate()
{
	create.click();
}	
public void clickSearch()
{
	search.click();
}	
public void clickmore()
{
	more.click();
}	
public void clickMultipleTabs()
{
	multipleTabs.click();
}
public void clickMenu()
{
	menu.click();
}

public void clickAutoComplete()
{
	autocomplete.click();
}
public void clickSlider()
{
	slider.click();
}
public void clickCollapsibleContent()
{
	collapsibleContent.click();
}
public void clickIFrames()
{
	iFrames.click();
}
public void clickImages()
{
	images.click();
}
public void clickCSSProperties()
{

	cSSProperties.click();
}
public void clickPopups()
{
	popups.click();
}
public void clickLinks()
{
	links.click();
}
}
