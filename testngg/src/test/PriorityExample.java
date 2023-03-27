package test;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=1)
	void firstMethod() {
		System.out.println("this is first method");
	}
	
	@Test(priority=2,enabled = false)
	void secondMethod() {
		System.out.println("this is second method");
	}
	
	@Test(priority=3)
	void thirdMethod() {
		System.out.println("this is third method");
	}
	
	@Test(priority=4)
	void forthMethod() {
		System.out.println("this is forth method");
	}
}
