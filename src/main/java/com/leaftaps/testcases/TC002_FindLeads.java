package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC002_FindLeads extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	
	@Test(dataProvider = "GetData")
	public void runCreateLead(String username, String password, String fname) {
		System.out.println(getDriver());

		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeadsLink()
		.enterFirstName(fname)
		.clickFindLeadsButton();

	}
}
