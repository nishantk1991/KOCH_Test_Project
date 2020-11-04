package TestCases;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.KOCH_Page;
import Setup.TestBase;
import Utilty.Util;

public class KOCH_TestCase extends TestBase{
	KOCH_Page koch_page;
	
	@BeforeMethod
	public void setUp(ITestResult result) throws IOException {
		initialization();
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" testcase has started");
		koch_page =new KOCH_Page();

	}
	@Test
	public void search_Flights() {
		koch_page.search_Flight_With_Data();
	}
}
