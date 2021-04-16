package com_AcitTime_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com_AcitTime_Generic.BaseTest;
import com_AcitTime_Generic.ExcelData;
import com_AcitTime_Page.ActiTIMELoginPage;
@Ignore
public class InvalidLoginTest extends BaseTest
{
	@Test(priority = 2)
	public void invalidLogin() throws InterruptedException
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		ActiTIMELoginPage lp =  new ActiTIMELoginPage(driver);
		//Login page should be displayed
		lp.verifyTitle(title);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i =1; i<=rc; i++)
		{
			String un = ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			Reporter.log("User name = "+un,true);
			//Enter invalid username
			lp.enterUserName(un);
			Reporter.log("Password = "+pw,true);
			//Enter invalid password
			lp.enterPassword(pw);
			//click on Login
			lp.clickOnLoginButton();
			String aErrormessage = lp.verifyErrorMessage();
			String eErrorMessage = ExcelData.getData(file_path, "TC02", 1, 2);
			//Verify Error message
			Assert.assertEquals(aErrormessage, eErrorMessage);
			Reporter.log("================================",true);
			Thread.sleep(1000);
		}
	}

}
