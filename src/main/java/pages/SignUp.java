package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends BaseClass {
	
	By loginPage = By.xpath("//a[contains(text(),' Signup / Login')]");
	
	
	
	public SignUp() {
		PageFactory.initElements(driver, this);

	}
	
	public void openLoginAndSignUpPage(){
		
		driver.findElement(loginPage).click();
	}

}
