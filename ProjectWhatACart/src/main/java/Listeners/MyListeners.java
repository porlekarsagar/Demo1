	
	package Listeners;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import com.aventstack.extentreports.Status;
	import BasePackage_2.BaseClass;
	import utilities_1.DriverUtils;


  public class MyListeners extends BaseClass implements ITestListener  {

	public void onTestStart(ITestResult result) {
	
		test = report.createTest(result.getName());
		//createTest(String name)
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "testcase passed with name as:- "+ result.getName());
		//log(Status status, String details)
		// public enum Status
		
	}

	public void onTestFailure(ITestResult result) {
	
		test.log(Status.FAIL, "testcase failed with name as:- "+ result.getName());
		String path = DriverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "testcase skipped with name as:- "+result.getName());
	}

	

	public void onStart(ITestContext context) {
	
		reportInit() ;
		// // method defined by us in base class to initialize report
	}

	public void onFinish(ITestContext context) {
	
		report.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
