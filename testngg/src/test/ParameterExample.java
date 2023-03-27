package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterExample {

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser","url"})
	void setUp(String browser,String url ) {
		if(browser.equalsIgnoreCase("chrome"))
			
		{System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\COMTECH\\eclipse-Sarita\\testngg\\chromeExe\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		}
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("sarita");
		driver.findElement(By.name("Login")).click();
	}

	@Test(priority = 1)
	void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"vtiger CRM\"]"));
		Assert.assertTrue(logo.isDisplayed(), "logo not displayed on the page");
		//Assert.assertFalse(logo.isDisplayed(), "logo not displayed on the page");

	}

	@Test(priority = 2)
	void homePageTitle() {
		String title= driver.getTitle();
		driver.findElement(By.xpath("//td[@class='moduleName']"));
		Assert.assertEquals("admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM",
				title,"title is not matched");
		
	}
	
}
