package com_AcitTime_Generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GenericUtils 
{
	/***
	 * @author CBT
	 * @category take screen shot
	 * @param driver
	 * @param name
	 */
	public static void getScreenShot(WebDriver driver,String name)
	{
		LocalDate date = LocalDate.now();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dset = new File("./ScreenShot/"+date+"_"+name+".png");
		try 
		{
			Files.copy(src, dset);
		} 
		catch (IOException e) 
		{
		}
	}
	
	public void selectByIndex(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectByVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void deSelectByIndex(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}
	
	public void deSelectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}
	public void deSelectByVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}
	public void deSelectAll(WebElement element)
	{
		Select sel = new Select(element);
		sel.deselectAll();
	}
}
