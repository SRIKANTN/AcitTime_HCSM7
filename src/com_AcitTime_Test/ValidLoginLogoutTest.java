package com_AcitTime_Test;

import org.testng.annotations.Test;

import com_AcitTime_Generic.BaseTest;
import com_AcitTime_Generic.ExcelData;
import com_AcitTime_Page.ActiTIMEEnterTimeTrackPage;
import com_AcitTime_Page.ActiTIMELoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority = 1)
	public void validLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String epTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		ActiTIMEEnterTimeTrackPage ep = new ActiTIMEEnterTimeTrackPage(driver);
		//to verify title of login page
		lp.verifyTitle(lgTitle);
		//to enter valid user name
		lp.enterUserName(un);
		//to enter valid password
		lp.enterPassword(pw);
		//to click on login button
		lp.clickOnLoginButton();
		//to verify title of enter time track page 
		lp.verifyTitle(epTitle);
		//to click on logout button
		ep.clickOnLogoutButton();
		//to verify title of login page
		lp.verifyTitle(lgTitle);
	}
}
