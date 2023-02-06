     package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer{
	
	int start=0;
	
	int end= 5;

	@Override
	public boolean retry(ITestResult result) {
		if (start<=end) {
			
			 start++;
			 
			 return true;
			
		}
		return false;
	}

}
