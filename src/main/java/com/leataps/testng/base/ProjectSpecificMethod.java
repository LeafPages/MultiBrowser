package com.leataps.testng.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.ReadExcel;

public class ProjectSpecificMethod {
	//public static ChromeDriver driver;
	public String excelFileName;
	public static final ThreadLocal<RemoteWebDriver> tl = new ThreadLocal<RemoteWebDriver>();

	@Parameters({"url"})
	@BeforeMethod
	public void openApp(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		tl.set(new ChromeDriver());		
		getDriver().manage().window().maximize();
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp() {
		getDriver().close();
	}

	@DataProvider(name = "GetData", indices= {0,1}, parallel=true)
	public String[][] sendData() throws IOException {
		String[][] array = ReadExcel.readExcelData(excelFileName);
		return array;
	}
	
	public RemoteWebDriver getDriver() {
		return tl.get();
	}
}
