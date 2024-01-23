package com.cjc.fk.webapp.utility;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.cjc.fk.webapp.test.ActualTest;


public class Commen 
{	
public static WebDriver driver;
public static FileInputStream fil;
public static XSSFWorkbook wb;
public static XSSFSheet sheet;
public static XSSFRow row;
public static XSSFCell cell;
public static Logger log=Logger.getLogger(ActualTest.class.getName());	
	
	

	
	public static String excel() throws IOException
	{
		fil=new FileInputStream("G:\\Selenium\\DataDrivenFrameworkFlipcart\\src\\test\\resources\\ExcelFlipcart\\fk.xlsx");
		wb=new XSSFWorkbook(fil); 
		sheet=wb.getSheet("sheet1"); 
	String user=sheet.getRow(1).getCell(0).getStringCellValue();
	//String pass=sheet.getRow(1).getCell(1).getStringCellValue();
	return user;
	
	}
	
	
	public static String excel1() throws IOException
	{
		fil=new FileInputStream("G:\\Selenium\\DataDrivenFrameworkFlipcart\\src\\test\\resources\\ExcelFlipcart\\fk.xlsx");
		wb=new XSSFWorkbook(fil); 
		sheet=wb.getSheet("sheet1"); 
	//String user=sheet.getRow(1).getCell(0).getStringCellValue();
	String pass=sheet.getRow(1).getCell(1).getStringCellValue();
	return pass;
	
	}
	
	
	
	
		
	
	
}
