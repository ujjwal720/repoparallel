package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Google;
import Utils.BaseTest;

public class TestCase02 extends BaseTest {

	public Google gohl;

	public TestCase02() throws IOException {
		
		

	}

	@Test
	public void test4() throws InterruptedException {
		
		gohl.search("man00");

	}
	
	
	@BeforeMethod
	public void setup1() {
		System.out.println("hello");
		gohl = new Google(BaseTest.getdriver());
		
	}
	

	@Test
	public void test5() throws InterruptedException {
		
		Thread.sleep(4000);
		gohl.search("india");

	}
	

}
