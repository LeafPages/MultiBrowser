package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leataps.testng.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

public LoginPage clickLogout() {
	getDriver().findElement(By.className("decorativeSubmit")).click();
	return new LoginPage();
}
public MyHomePage clickCRMSFA() {
	getDriver().findElement(By.linkText("CRM/SFA")).click();
	return new MyHomePage();
}
}
