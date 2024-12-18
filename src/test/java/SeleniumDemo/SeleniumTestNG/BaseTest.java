package SeleniumDemo.SeleniumTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertEquals
public  class BaseTest {

	protected static WebDriver d;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();   
		d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		d.get("https://www.amazon.com");
	
		d.manage().window().maximize();
	

	}
	
	@Test
	public void test(){
		 String actualTitle = d.getTitle();

        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

        assertEquals(actualTitle, expectedTitle, "Page title does not match the expected value");
		
	}
	@AfterClass
	public void close() {
		d.close();
	}

}
