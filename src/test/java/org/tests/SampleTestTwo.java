package org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestTwo {
	public WebDriver driver;

	@Test

	public void maintest() {

		String title = driver.getTitle();
		System.out.println("Title ==========" + title);

	}

	@BeforeMethod

	public void beforeMethod() {
		
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod

	public void afterMethod() {

		driver.quit();

	}
}
