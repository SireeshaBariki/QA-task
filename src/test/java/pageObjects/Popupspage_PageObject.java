package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Popupspage_PageObject extends BasePage {
WebDriver driver;
	
	public Popupspage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
// WebElements Locators+identification

@FindBy(xpath="//a[@id='btn-one']")  WebElement popupOne;
@FindBy(xpath="//a[@id='btn-two']")  WebElement popupTwo;
@FindBy(xpath="//a[@id='btn-three']")  WebElement popupThree;
@FindBy(xpath="//a[@id='btn-four']")  WebElement popupDuplicate;
@FindBy(xpath="//a[@id='btn-five']")  WebElement duplicateTab;
@FindBy(xpath="//a[@id='btn-six']")  WebElement inWindowPopup;
@FindBy(xpath="//input[@id='alertBox']")  WebElement alert;
@FindBy(xpath="//input[@id='confirmBox']") WebElement confirm;
@FindBy(xpath="//button[@id='promptBtn']") WebElement promptBox;

//Inwindowpopup close button
@FindBy(xpath="//button[normalize-space()='Close']") WebElement inWindowpopup_closebtn;
//Action Methods

public void ClickPopupOne()
{
	popupOne.click();
}
public void ClickPopupTwo()
{
	popupTwo.click();
}
public void ClickPopupThree()
{
	popupThree.click();
}
public void ClickPopupDuplicate()
{
	popupDuplicate.click();
}
public void Clickdupliactetab()
{
	duplicateTab.click();
}
public void clickinWindowPopup()
{
	inWindowPopup.click();
}
public void clickAlert()
{
	alert.click();
}
public void clickconfirm()
{
	confirm.click();
}
public void clickpromptBox()
{
	promptBox.click();
}

public void inWindowpopup_closebtn()
{
	inWindowpopup_closebtn.click();
}
}
//driver.findElement(By.xpath("//button[normalize-space()="Close"]"))