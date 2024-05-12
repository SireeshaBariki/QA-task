package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage_PageObject extends BasePage {
	WebDriver driver;
	
	 public MenuPage_PageObject (WebDriver driver)
		{
			super (driver);
			
		}
	 
	 // WebElements Locators+identification


@FindBy(xpath="//a[normalize-space()='Single Menus']")  WebElement singleMenus;
@FindBy(xpath="//a[@id='b1']")  WebElement singleMenu_testing;
@FindBy(xpath="//span[@id='label']")  WebElement singleMenu_testing_txt;
@FindBy(xpath="//a[@id='b2']")  WebElement singleMenu_java;
@FindBy(xpath="//span[@id='label']")  WebElement singleMenu_java_txt;
@FindBy(xpath="//a[@id='b3']")  WebElement singleMenu_Net;
@FindBy(xpath="//span[@id='label']")  WebElement singleMenu_Net_txt;
@FindBy(xpath="//a[@id='b4']") WebElement singleMenu_dataBase;
@FindBy(xpath="//span[@id='label']")  WebElement singleMenu_dataBase_txt;


//SUBMENUS
@FindBy(xpath="//a[normalize-space()='Sub Menus']")  WebElement subMenus;
@FindBy(xpath="//a[@class='dropbtn'][normalize-space()='Testing']") WebElement submenu_testing;
@FindBy(xpath="//a[@id='selbtn']") WebElement selenium;
@FindBy(xpath="//a[@id='manualbtn']")  WebElement manualTesting;
@FindBy(xpath="//a[@id='dbbtn']")  WebElement dBTesting;
@FindBy(xpath="//a[@id='unitbtn']")  WebElement unitTesting;
@FindBy(xpath="//a[normalize-space()='JAVA']")  WebElement submenu_jAVA;
@FindBy(xpath="//a[@id='advjavabtn']") WebElement advJava;
@FindBy(xpath="//a[@id='corejavabtn']")  WebElement coreJava;
@FindBy(xpath="//a[@id='springbtn']")  WebElement spring;
@FindBy(xpath="//a[@id='hibernatebtn']")  WebElement hibernate;
@FindBy(xpath="//a[@class='dropbtn'][normalize-space()='.Net']")  WebElement submenu_Net;
@FindBy(xpath="//a[@id='cbtn']")  WebElement cSharp;
@FindBy(xpath="//a[@id='aspbtn']")  WebElement ASPNET;
@FindBy(xpath="//a[@id='adobtn']")  WebElement ADONET;
@FindBy(xpath="//a[@id='mvcbtn']")  WebElement mVC;
@FindBy(xpath="//a[normalize-space()='Database']")  WebElement submenu_database;
@FindBy(xpath="//a[@id='sqlbtn']")  WebElement sQL;
@FindBy(xpath="//a[@id='mysqlbtn']")  WebElement mySql;
@FindBy(xpath="//a[@id='oraclebtn']")  WebElement oracle;
@FindBy(xpath="//a[@id='h2btn']")  WebElement h2;

@FindBy(xpath="//span[@id='label1']") WebElement subMenu_Txt;


//Action methods for Single Menu
public void clickSingleMenus()
{
	singleMenus.click();
}
public void clickSingleMenu_Testing()
{
	singleMenu_testing.click();
}
public void clickSingleMenu_Java()
{
	singleMenu_java.click();
}
public void clickSingleMenu_Net()
{
	singleMenu_Net.click();
}
public void clickSingleMenu_DataBase()
{
	singleMenu_dataBase.click();
}
public String clickSingleMenuDataBase_Txt()
{
	return singleMenu_dataBase_txt.getText();
}
public String clickSingleMenuTesting_Txt()
{
	return singleMenu_testing_txt.getText();
}
public String clickSingleMenuJava_Txt()
{
	return singleMenu_java_txt.getText();
}
public String clickSingleMenuNet_Txt()
{
	return singleMenu_Net_txt.getText();
}


//Action methods for SUB MENUS

public void clickSubMenus()
{
	subMenus.click();
}
public void clickSubMenu_Testing()
{
	submenu_testing.click();
}
public void clickSubMenu_Java()
{
	submenu_jAVA.click();
}
public void clickSubMenu_Net()
{
	submenu_Net.click();
}
public void clickSubMenu_DataBase()
{
	submenu_database.click();
}
public void clickSubMenuJava_Corejava()
{
	coreJava.click();
}
public String clickSubMenuCoreJava_Txt()
{
	return subMenu_Txt.getText();
}

}
