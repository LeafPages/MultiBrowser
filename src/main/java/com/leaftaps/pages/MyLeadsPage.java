package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod{
	public CreateLeadPage clickCreateLeadLink() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeadsLink() {
		getDriver().findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage();
	}
}
