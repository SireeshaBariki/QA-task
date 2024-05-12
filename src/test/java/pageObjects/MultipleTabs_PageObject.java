package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleTabs_PageObject extends BasePage {

	 WebDriver driver;
	public MultipleTabs_PageObject( WebDriver driver)
	{
		super(driver);
	}
	
	// WebElements Locators+identification

@FindBy(xpath="//a[normalize-space()='Plan to Succeed']")  WebElement planToSucceed;
@FindBy(xpath="//input[@id='textbox1']")  WebElement PlanToSucceed_textbox1;
@FindBy(xpath="//input[@id='textbox2']")  WebElement PlanToSucceed_textbox2;
@FindBy(xpath="//a[normalize-space()='UnLearning']")  WebElement unLearning;
@FindBy(xpath="//input[@id='textbox3']")  WebElement unLearning_textbox3;
@FindBy(xpath="//input[@id='textbox4']")  WebElement unLearning_textbox4;
@FindBy(xpath="//a[normalize-space()='Ways of Unlearning']")  WebElement waysOfUnlearning;
@FindBy(xpath="//input[@id='textbox5']")  WebElement waysOfUnlearning_textbox5;
@FindBy(xpath="//input[@id='textbox6']") WebElement waysOfUnlearning_textbox6;


//Action methods

public void clickPlantoSucceed()
{
	planToSucceed.click();
}
public void enterTextplanToSucceedTB1(String textbox1)
{
	PlanToSucceed_textbox1.sendKeys(textbox1);
}
public void enterTextplanToSucceedTB2(String textbox2)
{
	PlanToSucceed_textbox2.sendKeys(textbox2);
}
public void clickunLearning()
{
	unLearning.click();
}
public void enterTextunLearningTB3(String textbox3)
{
	unLearning_textbox3.sendKeys(textbox3);
}
public void enterTextunLearningTB4(String textbox4)
{
	unLearning_textbox4.sendKeys(textbox4);
}
public void clickwaysOfUnlearning()
{
	waysOfUnlearning.click();
}
public void enterTextwaysOfUnlearningTB5(String textbox5)
{
	waysOfUnlearning_textbox5.sendKeys(textbox5);
}
public void enterTextwaysOfUnlearningTB6(String textbox6)
{
	waysOfUnlearning_textbox6.sendKeys(textbox6);
}
}
