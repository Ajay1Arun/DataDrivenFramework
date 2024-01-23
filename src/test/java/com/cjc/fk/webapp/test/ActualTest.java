package com.cjc.fk.webapp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.fk.webapp.page.PomFile;
import com.cjc.fk.webapp.utility.Commen;

public class ActualTest 
{
	public static WebDriver driver;
	Properties pro=new Properties();

	@BeforeSuite
	public void openBrowser() throws IOException
	{
		 FileInputStream fis=new FileInputStream("G:\\Selenium\\DataDrivenFrameworkFlipcart\\src\\test\\resources\\flipcart.properties");
		 pro.load(fis);
		

		System.setProperty(pro.getProperty("browser"), pro.getProperty("browser1"));
	    Commen.driver=new ChromeDriver();
	   
	    Commen.log.info("open browser");
	    
	    
	
	}
	
	@BeforeTest
	public void openurl()
	{
		Commen.driver.get(pro.getProperty("url"));
	}
	
	@Test
	public void test() throws IOException
	{
		PomFile pom=PageFactory.initElements(Commen.driver, PomFile.class);
		pom.username();
	}
	
	@AfterMethod
	public void sceernshot() throws IOException
	{
		File src=((TakesScreenshot)Commen.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("G:\\Selenium\\DataDrivenFrameworkFlipcart\\src\\test\\resources\\ScreenShot"));
	}
	
	
	
	
	
}
