package parellalTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParellalTest1 {
WebDriver driver;
	@Test(priority=1)
	void logoTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\COMTECH\\eclipse-Sarita\\testngg\\chromeExe\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://localhost:8888/");
	WebElement logo=	driver.findElement(By.xpath("//img[@title=\"vtiger CRM\"]"));
Assert.assertTrue(logo.isDisplayed());
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
	}
	@Test(priority=2)
	void homePageTitle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\COMTECH\\eclipse-Sarita\\testngg\\chromeExe\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
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
