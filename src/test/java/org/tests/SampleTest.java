package org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {

	public WebDriver driver;

	@Test

	public void main() {

		String title = driver.getTitle();
		System.out.println("Title ==========" + title);

	}

	@BeforeMethod

	public void beforeMethod() {
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl/");
		driver.manage().window().maximize();

	}

	@AfterMethod

	public void afterMethod() {

		driver.quit();

	}

}
