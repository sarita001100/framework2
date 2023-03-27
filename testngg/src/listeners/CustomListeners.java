package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

	
	public void onStart(ITestContext arg) {
		System.out.println("starts test excution........."+arg.getName());
	}
	
	public void onFinish(ITestContext arg) {
		System.out.println("finish test excution........."+arg.getName());
	}
	
	public void onTestStart(ITestResult arg) {
		System.out.println("starts test excution........."+arg.getName());
	}
	
	public void onTestSkipped(ITestResult arg) {
		System.out.println("skipped test excution........."+arg.getName());
	}
	public void onTestsuccess(ITestResult arg) {
		System.out.println("passed test excution........."+arg.getName());
	}
	public void onTestFailure(ITestResult arg) {
		System.out.println("failed test excution........."+arg.getName());
	}
	public void onTestFailed(ITestResult arg) {
		//System.out.println("passed test excution........."+arg.getName());
	}
	
}
