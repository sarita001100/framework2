package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExamle {

	@Test
	void startCar() {
		System.out.println("this is start car method ");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"startCar"} )
	void driveCar() {
		System.out.println("this is drive car method ");
	}
	@Test(dependsOnMethods = {"driveCar"})
	void stopCar() {
		System.out.println("this is stop car method ");
	}
	@Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun=true)
	void parkCar() {
		System.out.println("this is park car method ");
	}
	
}
