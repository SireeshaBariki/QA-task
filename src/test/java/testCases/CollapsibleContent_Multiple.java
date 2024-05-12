package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CollapsibleContent_PageObject;
import pageObjects.HomePage_PageObject;
import pageObjects.LoginPage_PageObject;
import testBase.BaseClass;

public class CollapsibleContent_Multiple extends BaseClass {

	@Test
	public void login() throws InterruptedException
	{
		LoginPage_PageObject loginpg=new LoginPage_PageObject(driver);
		
		loginpg.enterEmail("training@jalaacademy.com");
		
		loginpg.enterPassword("jobprogram");
		
		loginpg.signInClick();
		Thread.sleep(2000);
		
		HomePage_PageObject homepg=new HomePage_PageObject(driver);
		
		String ActualTitle=homepg.displaymagnus();
         Assert.assertEquals(ActualTitle, "Magnus");
         
         
}
	
	
	@Test(dependsOnMethods = { "login" })
		public void MultipleCollapse() throws InterruptedException
	{
		Thread.sleep(2000);
        HomePage_PageObject hmpg=new HomePage_PageObject(driver);
        hmpg.clickmore();
        Thread.sleep(1000);
        hmpg.clickCollapsibleContent();
        CollapsibleContent_PageObject collapsemultiple=new CollapsibleContent_PageObject(driver);
        collapsemultiple.clickMultipleCollapse();
        collapsemultiple.clickMultipleCollapseplusicon1();
        Thread.sleep(2000);
        String info1=collapsemultiple.clickMultipleCollapseplusicon1info();
        System.out.println("<-------------Collaborate with Colleagues--------->" );
        System.out.println(info1);
        
        collapsemultiple.clickMultipleCollapseplusicon2();
        Thread.sleep(2000);
        String info2=collapsemultiple.clickMultipleCollapseplusicon2info();
        System.out.println("<-------------Learn Anything Quickly--------->" );
        System.out.println(info2);
        
        collapsemultiple.clickMultipleCollapseplusicon3();
        Thread.sleep(2000);
        String info3=collapsemultiple.clickMultipleCollapseplusicon3info();
        System.out.println("<-------------Reasons People Give Up on Their Goals Too Early--------->" );
        System.out.println(info3);
        
        collapsemultiple.clickMultipleCollapseplusicon4();
        Thread.sleep(2000);
        String info4=collapsemultiple.clickMultipleCollapseplusicon4info();
        System.out.println("<-------------Signs of Settling For Less In Life--------->" );
        System.out.println(info4);
       
}}
