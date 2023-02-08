package pageTests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.BaseClass;
import pages.SignUp;

public class SignUpTest extends BaseClass {

	SoftAssert softAssert = new SoftAssert();

	@BeforeClass
	public void init() {
		setup();
	}

	@Test
	public void test() {

		String currentTime = String.valueOf(System.currentTimeMillis());
		String email = "test" + currentTime + "@test.com";
		new SignUp().openLoginAndSignUpPage();
		By element = new SignUp().signUpNewUser("test", "test@test.com");
		boolean check = driver.findElement(element).isDisplayed();
		softAssert.assertTrue(check);
	}

	@AfterTest
	public void tearDown() {
		quitBrowser();
	}

}
