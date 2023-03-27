package test;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name="loginDataProvider")
	public Object[][] getData(){
		Object[][] data= {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
    return data;
		
	}
	
}
