package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollapsibleContent_PageObject extends BasePage {
WebDriver driver;
	
	public CollapsibleContent_PageObject (WebDriver driver)
		{
			super(driver);
			
		}
	 
// WebElements Locators+identification
//Single Collapse
@FindBy(xpath="//a[normalize-space()='Single Collapse']")  WebElement singleCollapse;
@FindBy(xpath="//a[normalize-space()='Know your goals and Prioritize Wisely']")  WebElement plusIcon1;
@FindBy(xpath="//a[normalize-space()='Be focused and Eliminate Distractions']")  WebElement plusIcon2;
@FindBy(xpath="//a[normalize-space()='Chose the right mentor to Succeed in career']")  WebElement plusIcon3;
@FindBy(xpath="//div[@id='collapseOne']//div[@class='panel-body']")  WebElement plusIconInfo1;
@FindBy(xpath="//p[contains(text(),'Are you really present physically and mentally. Tr')]")  WebElement plusIconInfo2;
@FindBy(xpath="//div[@id='collapseThree']//div[@class='panel-body']") WebElement plusIconInfo3;

//Multiple Collapse
@FindBy(xpath="//a[normalize-space()='Multiple Collapse']")  WebElement multipleCollapse;
@FindBy(xpath="//a[normalize-space()='Collaborate with Colleagues']") WebElement multiplecollapseplusIcon1;
@FindBy(xpath="//a[normalize-space()='Learn Anything Quickly']")  WebElement multiplecollapseplusIcon2;
@FindBy(xpath="//a[normalize-space()='Reasons People Give Up on Their Goals Too Early']")  WebElement multiplecollapseplusIcon3;
@FindBy(xpath="//a[normalize-space()='Signs of Settling For Less In Life']")  WebElement multiplecollapseplusIcon4;
@FindBy(xpath="//div[@id='collapseFour']//div[@class='panel-body']")  WebElement multiplecollapseplusIcon1Info;
@FindBy(xpath="//div[@id='collapseFive']//div[@class='panel-body']") WebElement multiplecollapseplusIcon2Info;
@FindBy(xpath="//div[@id='collapseSix']//div[@class='panel-body']") WebElement multiplecollapseplusIcon3Info;
@FindBy(xpath="//div[@id='collapseSeven']//div[@class='panel-body']") WebElement multiplecollapseplusIcon4Info;

//Action Methods
//Single Collapse
public void clickSingleCollapse()
{
	singleCollapse.click();
}
public void clickSingleCollapseplusicon1()
{
	plusIcon1.click();
}
public void clickSingleCollapseplusicon2()
{
	plusIcon2.click();
}
public void clickSingleCollapseplusicon3()
{
	plusIcon3.click();
}
public String clickSingleCollapseplusicon1info()
{
	return plusIconInfo1.getText();
}
public String clickSingleCollapseplusicon2info()
{
	return plusIconInfo2.getText();
}
public String clickSingleCollapseplusicon3info()
{
	return plusIconInfo3.getText();
}

//Multiple Collapse
public void clickMultipleCollapse()
{
	multipleCollapse.click();
}
public void clickMultipleCollapseplusicon1()
{
	multiplecollapseplusIcon1.click();
}
public void clickMultipleCollapseplusicon2()
{
	multiplecollapseplusIcon2.click();
}
public void clickMultipleCollapseplusicon3()
{
	multiplecollapseplusIcon3.click();
}
public void clickMultipleCollapseplusicon4()
{
	multiplecollapseplusIcon4.click();
}
public String clickMultipleCollapseplusicon1info()
{
	return multiplecollapseplusIcon1Info.getText();
}
public String clickMultipleCollapseplusicon2info()
{
	return multiplecollapseplusIcon2Info.getText();
}
public String clickMultipleCollapseplusicon3info()
{
	return multiplecollapseplusIcon3Info.getText();
}
public String clickMultipleCollapseplusicon4info()
{
	return multiplecollapseplusIcon4Info.getText();
}
}
