package SeleniumDemo.SeleniumTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

	protected static WebDriver d;

	@BeforeClass
	public void openBrowser() {
		System.setProperty("driver.chrome.driver", "D:\\eclipse\\chromedriver");
		d = new ChromeDriver();   
		d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		d.get("https://www.amazon.com");
	
		d.manage().window().maximize();
	

	}

	@AfterClass
	public void close() {
		d.close();
	}

}
