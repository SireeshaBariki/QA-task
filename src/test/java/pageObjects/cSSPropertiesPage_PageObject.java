package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cSSPropertiesPage_PageObject extends BasePage {
WebDriver driver;
	
	public cSSPropertiesPage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
// WebElements Locators+identification

//Progress Bars
@FindBy(xpath="//a[normalize-space()='Progress Bars']")  WebElement progressBars;
@FindBy(xpath="//div[@class='progress-bar progress-bar-success']")  WebElement Complete40_success;
@FindBy(xpath="//div[@class='progress-bar progress-bar-info']")  WebElement Complete20;
@FindBy(xpath="//div[@class='progress-bar progress-bar-warning']")  WebElement Complete60_warning;
@FindBy(xpath="//div[@class='progress-bar progress-bar-danger']")  WebElement Complete80_danger;

//Alerts
@FindBy(xpath="//a[normalize-space()='Alerts']")  WebElement alerts;
@FindBy(xpath="//div[@class='alert alert-success']/button[@class='close']")  WebElement success;
@FindBy(xpath="//div[@class='alert alert-info']/button[@class='close']")  WebElement info;
@FindBy(xpath="//div[@class='alert alert-warning']/button[@class='close']")  WebElement warning;
@FindBy(xpath="//div[@class='alert alert-danger']/button[@class='close']")  WebElement danger;


//Buttons
@FindBy(xpath="//a[normalize-space()='Buttons']")  WebElement buttons;
@FindBy(xpath="//button[normalize-space()='Default']")  WebElement default_btn;
@FindBy(xpath="//button[normalize-space()='Primary']")  WebElement primary;
@FindBy(xpath="//button[normalize-space()='Success']") WebElement success_btn;
@FindBy(xpath="//button[normalize-space()='Warning']") WebElement warning_btn;
@FindBy(xpath="//button[normalize-space()='Danger']")  WebElement danger_btn;

//Links

@FindBy(xpath="//li[@class='active']//a[contains(text(),'Links')]")  WebElement links;
@FindBy(xpath="//a[normalize-space()='Link 1']")  WebElement link1;
@FindBy(xpath="//a[normalize-space()='Link 2']")  WebElement link2;
@FindBy(xpath="//a[normalize-space()='Link 3']")  WebElement link3;
@FindBy(xpath="//a[normalize-space()='Link 4']")  WebElement link4;
@FindBy(xpath="//a[normalize-space()='Link 5']")  WebElement link5;


//Action Methods
//Link Methods
public void clickLinks()
{
	links.click();
}
public void clickLink1()
{
	 link1.click();
}
public void ClickLink2()
{
	link2.click();
}
public void clickLink3()
{
	 link3.click();
}
public void clickLink4()
{
	 link4.click();
}
public void clickLink5()
{
	 link5.click();
}

//Progress Bars Methods
public void clickProgressBars()
{
	progressBars.click();
}
public String complete40Success()
{
	return Complete40_success.getText();
}
public String complete20()
{
	return Complete20.getText();
}
public String complete60warning()
{
	return Complete60_warning.getText();
}
public String complete80danger()
{
	return Complete80_danger.getText();
}
//Button Methods
public void clickButtons()
{
	buttons.click();
}
public void clickSuccess_btn()
{
	 success_btn.click();
}
public void ClickDefault_btn()
{
	default_btn.click();
}
public void clickPrimary()
{
	 primary.click();
}
public void clickWarning_btn()
{
	 warning_btn.click();
	 
}
public void clickDanger_btn()
{
	 danger_btn.click();
	 
}
public String clickSuccess_txt()
{
	return success_btn.getText();
}
public String ClickDefault_txt()
{
	return default_btn.getText();
}
public String clickPrimary_txt()
{
	 return primary.getText();
}
public String clickWarning_txt()
{
	 return warning_btn.getText();
	 
}
public String clickDanger_txt()
{
	 return danger_btn.getText();
	 
}

//Alert Methods
public void clickAlerts()
{
	alerts.click();
}
public void clickSuccess()
{
	 success.click();
}
public void Clickinfo()
{
	info.click();
}
public void clickWarning()
{
	 warning.click();
}
public void clickdanger()
{
	 danger.click();;
}
}
