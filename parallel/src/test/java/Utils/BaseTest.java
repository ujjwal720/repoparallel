package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest
	public void setup() throws IOException, InterruptedException {

		WebDriver driver = WebdriverManager.initilizedriver();
		threadLocalDriver.set(driver);
		getdriver().get("https://www.google.com/");
		getdriver().manage().window().maximize();
		Thread.sleep(6000);
		System.out.println(Thread.currentThread().getId());

	}

	public static WebDriver getdriver() {

		return threadLocalDriver.get();

	}
	
	
	/*
	@AfterTest
	public void teardown() {
		
		
		getdriver().quit();
		System.out.println(Thread.currentThread().getId());
		threadLocalDriver.remove();
		
	}
	
	*/

}
