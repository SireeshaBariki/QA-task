package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPage_PageObject extends BasePage {
WebDriver driver;
	
	public SliderPage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
// WebElements Locators+identification
	
	@FindBy(xpath="//div[@class='slider-handle min-slider-handle round']") WebElement slider;
	
//Action methods
	
	public WebElement moveSlider()
	{
		 slider.getLocation();
		 
	return slider;
	}

}
