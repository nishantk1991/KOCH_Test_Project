package Setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import Utilty.Util;

public class TestBase{
	public static WebDriver driver;
	//public static ChromeOptions options;
	public static WebDriverWait wait;
	public static Wait<WebDriver> fluentWait;
	public static Properties prop;
	public static Actions actions;

	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources"
					+ "/Resources/Configure.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	public WebDriver initialization() {
		System.out.println("Starting Test On Chrome Browser");
		System.setProperty("webdriver.chrome.driver", Util.chromeDriverPath);
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-extensions");
		driver=new ChromeDriver(options);
		wait=new WebDriverWait(driver,Util.ExplicitWait);
				
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		String methodName = result.getMethod().getMethodName();
		Util.takeScreenshot(methodName);
		System.out.println(methodName+" testcase has completed");
		//driver.close();
	}
}