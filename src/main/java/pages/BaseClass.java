package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Utility;

public class BaseClass {

//	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	protected static WebDriver driver;
	protected static Properties prop;

	public BaseClass() {
		prop = new Properties();
		FileInputStream IN;
		try {
			IN = new FileInputStream("src\\main\\java\\utilities\\system.properties");
			prop.load(IN);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	protected static void setup() {
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(new Utility().Page_Load_TimeOut,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(new Utility().Implicit_Wait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	protected static void quitBrowser() {
		if (driver!= null)
			driver.quit();
	}

}
