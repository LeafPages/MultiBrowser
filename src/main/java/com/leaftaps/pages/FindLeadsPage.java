package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leataps.testng.base.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod{
	
	public FindLeadsPage enterFirstName(String data) {
		getDriver().findElement(By.xpath("//span[text()='Name and ID']/following::input[@name='firstName']")).sendKeys(data);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() {
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
}
