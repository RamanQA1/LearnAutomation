package ecommerce.myListerner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyListener implements IRetryAnalyzer {
	
	int maxtry=3;
	int counter=0;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(counter<=maxtry) {
			counter++;
			return true;
		}
		return false;
	}

}
