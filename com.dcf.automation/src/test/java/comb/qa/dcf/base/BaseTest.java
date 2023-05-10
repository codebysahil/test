package comb.qa.dcf.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import com.dcf.automation.factory.DriverFactory;

public class BaseTest {
	public WebDriver driver;
	public DriverFactory df;
	
	@BeforeTest
	public void setup() {
		
		df = new DriverFactory();
		driver = df.initDriver();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
