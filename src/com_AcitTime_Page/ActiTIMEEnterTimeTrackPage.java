package com_AcitTime_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_AcitTime_Generic.BasePage;

public class ActiTIMEEnterTimeTrackPage extends BasePage
{
	@FindBy(id = "logoutLink")
	private WebElement logout;

	public ActiTIMEEnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogoutButton()
	{
		logout.click();
	}

}
