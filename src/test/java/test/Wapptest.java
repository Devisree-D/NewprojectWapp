package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Wapppg;


public class Wapptest {

	WebDriver driver;
	String baseurl="https://www.wappalyzer.com";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeTest
	public void urlLoad() {
		driver.get(baseurl);
	}
	@Test
	public void runPage() throws InterruptedException{
		Wapppg ob=new Wapppg(driver);
		ob.searchTech();
		
	}
	@AfterMethod
	public void aftermethod1() {
		System.out.println("success");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
