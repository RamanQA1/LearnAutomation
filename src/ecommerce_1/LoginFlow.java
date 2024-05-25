package ecommerce_1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginFlow {
	
	@BeforeSuite
	public void beofreSuite() {
		
		System.out.println("Load db connection and file connection to load data");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Unload db connection and file connection to load data");
	}
	
	@Test(timeOut=1000,invocationCount=1,description="login with valid user",groups={"Regression"})
	public void login() {
		
		System.out.println("login with valid user");
	}

}
 
 