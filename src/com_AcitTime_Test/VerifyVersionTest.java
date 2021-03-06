package com_AcitTime_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com_AcitTime_Generic.BaseTest;
import com_AcitTime_Generic.ExcelData;
import com_AcitTime_Page.ActiTIMELoginPage;

public class VerifyVersionTest extends BaseTest
{
	@Test(priority = 3)
	public void verifyVersion()
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		//Login page should be displayed
		lp.verifyTitle(title);
		String aVersion = lp.verifyVersion();
		String eVersion = ExcelData.getData(file_path, "TC03", 1, 0);
		//Verify version
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(aVersion, eVersion);
		Reporter.log("Actual version = "+aVersion,true);
		sa.assertAll();
	}

}
