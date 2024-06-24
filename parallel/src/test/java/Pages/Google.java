package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

	public WebDriver driver;

	public Google(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//textarea[@class='gLFyf']")
	WebElement search;

	public void search(String s) {
		
		search.sendKeys(s);

	}
	
	
	

}
