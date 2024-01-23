package com.cjc.fk.webapp.page;


import java.io.IOException;
import java.sql.PseudoColumnUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

import com.cjc.fk.webapp.utility.Commen;

public class PomFile 
{
    WebDriver driver;
	public PomFile(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(css = "input[class=\"_2IX_2- VJZDxU\"]")
	WebElement un;
	
	@FindBy(css = "input[class=\"_2IX_2- _3mctLh VJZDxU\"]")
    WebElement ps;	
	
	@FindBy(css = "button[class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")
	WebElement login;
	
	@FindBy(css = "input[placeholder=\"Search for products, brands and more\"]")
	WebElement search;
	
	@FindBy(css = "svg[width=\"20\"]")
	WebElement seartching;
	
	public void username() throws IOException
	{
		String s=Commen.excel();
		un.sendKeys(s);	
		
		String s1=Commen.excel1();
		ps.sendKeys(s1);
		//click on login page
		login.click();
		//click on search product
		search.click();
		//click
		search.sendKeys("iphone12");
		
	
		seartching.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
