package parellalTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParellalTesting2 {

	WebDriver driver;
	@Test
	void loginTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\COMTECH\\eclipse-Sarita\\testngg\\chromeExe\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("sarita");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//td[@class='moduleName']"));
		Assert.assertEquals(driver.getTitle(),"admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM");
	}
	
	@AfterMethod
	void close() {
		driver.quit();
	}
}
