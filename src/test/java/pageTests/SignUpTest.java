package pageTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.SignUp;

public class SignUpTest extends BaseClass{
	
	
	@BeforeClass
	public void init() {
		setup();
	}
	
	@Test
	public void test() {
		 new SignUp().openLoginAndSignUpPage();
	}

	@AfterTest
	public void tearDown(){
		quitBrowser();
	}

}
