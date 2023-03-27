package test;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups={"sanity"})
	void test1() {
		System.out.println("this is test1 method");
	}
	@Test(groups={"sanity"})
	void test2() {
		System.out.println("this is test2 method");
	}
	@Test(groups= {"smoke"})
	void test3() {
		System.out.println("this is test3 method");
	}
	@Test(groups= {"regression"})
	void test4() {
		System.out.println("this is test4 method");
	}
	@Test(groups= {"sanity","regression"})
	void test5() {
		System.out.println("this is test5 method");
	}
	
}
