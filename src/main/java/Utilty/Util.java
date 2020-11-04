package Utilty;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Setup.TestBase;

public class Util extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 90;
	
	public static long IMPLICIT_WAIT = 50;
	
	public static long ExplicitWait = 60;
	
	public static String chromeDriverPath = "./src/test/resources/Drivers/chromedriver.exe";
	
	
	public static void takeScreenshot(String methodName) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"/screenshots/"+methodName+System.currentTimeMillis()+".png"));
	}
	
	public static void waitForPageLoader() {
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'poll-ldr')]")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'poll-ldr')]")));
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
}
