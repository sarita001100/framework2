package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2 {

	@BeforeSuite
	void beforeSuit() {
		System.out.println("this is before suit method");
	}
	@AfterSuite
	void aftersuit() {
		System.out.println("this is after suit method");
	}
	
	@BeforeClass
	void beforeClass() {
		System.out.println("this is before class method");
	}
	
	@AfterClass
	void afterlass() {
		System.out.println("this is after class method");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("this is before method");
	}
	@AfterMethod
	void afterMethod() {
		System.out.println("this is after method");
	}

	
	@Test
	void test3() {
		System.out.println("this is test3 method");
		}
	@Test
	void test4() {
		System.out.println("this is test4 method");
		}
}
