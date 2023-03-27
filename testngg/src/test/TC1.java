package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

	@BeforeTest
	void beforeTest() {
		System.out.println("this is before test method");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("this is after test method");
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("this is before class method");
	}
	
	@AfterClass
	void afterlass() {
		System.out.println("this is after class method");
	}
	
	
	
	
	@Test(groups = { "sanity"})
	void test1() {
		System.out.println("this is test 1");
//		Assert.assertTrue(false);
	}
	@Test(dependsOnGroups = {"sanity"}, alwaysRun = false)
	
	void test2() {
		System.out.println("this is test 2");
	}
	@BeforeMethod
	void beforeMethod() {
		System.out.println("this is before method");
	}
	@AfterMethod
	void afterMethod() {
		System.out.println("this is after method");
	}
}
