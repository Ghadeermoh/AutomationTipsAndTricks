package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends BaseClass {

	By loginPage = By.xpath("//a[contains(text(),' Signup / Login')]");
	By name = By.name("name");
	By email = By.xpath("//input[@name='name']/following-sibling::input[@name='email']");
	By signUpButton = By.xpath("//button[contains(text(),'Signup')]");
	By headerInformation = By.xpath("//*[contains(text(),'Enter Account Information')]");

	public SignUp() {
		PageFactory.initElements(driver, this);

	}

	public void openLoginAndSignUpPage() {
		driver.findElement(loginPage).click();
	}
	
	public By signUpNewUser(String nameVal , String mailVal) {
		driver.findElement(email).sendKeys(mailVal);
		driver.findElement(name).sendKeys(nameVal);
		driver.findElement(signUpButton).click();
		return headerInformation;
	}

}
