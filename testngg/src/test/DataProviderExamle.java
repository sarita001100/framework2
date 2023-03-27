package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamle {
    @Test(dataProvider="loginDataProvider",dataProviderClass=CustomDataProvider.class)
	public void loginTest(String email,String pwd) {
		System.out.println(email+"--- "+pwd);
	}
	
	
	
}
