package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.annotations.BeforeMethod;



public class WebdriverManager {
	
	/*
	 * driver setup for the webdriver
	 */

	public static WebDriver initilizedriver() throws IOException {

		WebDriver driver = null;
		

		try {

			String browser = "chrome";
			if (browser.equals("chrome")) {

				driver = new ChromeDriver();

			}

		}

		catch (Exception e) {

			e.printStackTrace();

		}

		return driver;

	}

}
