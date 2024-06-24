package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Google;
import Utils.BaseTest;

public class TestCase01 extends BaseTest {

	public Google goh;

	public TestCase01() throws IOException {
	

	}

	@BeforeMethod
	public void setUpPage() {
		System.out.println("lop");
		goh = new Google(BaseTest.getdriver());
	}

	@Test
	public void searcf() throws InterruptedException {

		goh.search("mamk");
		Thread.sleep(4000);

	}

}
