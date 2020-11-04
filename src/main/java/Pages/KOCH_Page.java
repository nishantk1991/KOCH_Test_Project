package Pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.j2objc.annotations.Property;

import Setup.TestBase;
import Utilty.Util;

public class KOCH_Page extends TestBase{
	
	@FindBy(xpath = "//img[contains(@id,'ixiLogoImg')]")
	WebElement Ixigo_Logo;
	@FindBy(xpath = "//span[contains(text(),'Round Trip')]")
	WebElement Round_Trip;
	@FindBy(xpath = "//div[contains(@class,'clear-input ixi-icon-cross')]")
	WebElement Frm_City_Cross_Btn;
	
	@FindBy(xpath="//div[contains(@class,'form-fields')]//div[contains(text(),'From')]/following-sibling::input[contains(@placeholder,'Enter city')]")
	WebElement From_City;
	@FindBy(xpath="//div[contains(@class,'form-fields')]//div[contains(text(),'To')]/following-sibling::input[contains(@placeholder,'Enter city')]")
	WebElement To_City;
	@FindBy(xpath="//div[contains(text(),'PNQ - Pune, India')]")
	WebElement From_City_Option;
	@FindBy(xpath="//div[contains(text(),'HYD - Hyderabad, India')]")
	WebElement To_City_Option;
	
	@FindBy(xpath="//td[contains(@class,'//div[contains(text(),'Departure')]/following-sibling::input')]")
	WebElement Departure;
	@FindBy(xpath="//td[contains(@class,'//div[contains(text(),'Return')]/following-sibling::input')]")
	WebElement Return;
	//@FindBy(xpath="//td[contains(@class,'selected')]")
	@FindBy(xpath="//div[contains(@class,'dep')]//td[contains(@data-date,'22112020')]")
	WebElement From_Date;
	@FindBy(xpath="//div[contains(@class,'ret')]//td[contains(@data-date,'22122020')]")
	WebElement To_Date;
	@FindBy(xpath="//div[contains(text(),'Travellers | Class')]/following-sibling::input")
	WebElement Passenger_Link;
	@FindBy(xpath="//div[contains(text(),'Adult')]//../..//span[contains(text(),'2')]")
	WebElement Passenger_Count;
	@FindBy(xpath="//button[contains(text(),'Search')]")
	WebElement Search_Button;
	
	@FindBy(xpath="//div[contains(text(),'Stop')]")
	WebElement Stop_Text;
	@FindBy(xpath="//div[contains(@class,'stops')]//div[@data-checkboxindex='0']")
	WebElement Non_Stop_Checkbox;
	@FindBy(xpath="//div[@class='stop-info' and text()='Non stop']")
	WebElement Non_Stop_Text;
	@FindBy(xpath="//div[contains(@class,'stops')]//div[@data-checkboxindex='1']")
	WebElement One_Stop_Checkbox;
	@FindBy(xpath="//div[@class='stop-info' and text()='1 stop']")
	WebElement One_Stop_Text;
	@FindBy(xpath="//div[contains(@class,'stops')]//div[@data-checkboxindex='2']")
	WebElement OnePlus_Stop_Checkbox;
	@FindBy(xpath="//div[@class='stop-info' and text()='1+ stops']")
	WebElement OnePlus_Stop_Text;

	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]")
	WebElement Departure1_Text;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//button[text()='00:00 - 06:00']")
	WebElement Departure1_00_00_06_00;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//div[text()='Early Morning']")
	WebElement Departure1_Early_Morning;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//button[text()='06:00 - 12:00']")
	WebElement Departure1_00_06_12_00;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//div[text()='Morning']")
	WebElement Departure1_Morning;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//button[text()='12:00 - 18:00']")
	WebElement Departure1_12_00_18_00;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//div[text()='Mid Day']")
	WebElement Departure1_Mid_Day;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//button[text()='18:00 - 24:00']")
	WebElement Departure1_18_00_24_00;
	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//div[text()='Night']")
	WebElement Departure1_Night;
	
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]")
	WebElement Departure2_Text;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//button[text()='00:00 - 06:00']")
	WebElement Departure2_00_00_06_00;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//div[text()='Early Morning']")
	WebElement Departure2_Early_Morning;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//button[text()='06:00 - 12:00']")
	WebElement Departure2_00_06_12_00;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//div[text()='Morning']")
	WebElement Departure2_Morning;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//button[text()='12:00 - 18:00']")
	WebElement Departure2_12_00_18_00;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//div[text()='Mid Day']")
	WebElement Departure2_Mid_Day;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//button[text()='18:00 - 24:00']")
	WebElement Departure2_18_00_24_00;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//div[text()='Night']")
	WebElement Departure2_Night;

	@FindBy(xpath="//div[contains(text(),'Departure from PNQ')]/parent::div//div[@class='time-sldr']")
	WebElement Departure1_Time_Slider;
	@FindBy(xpath="//div[contains(text(),'Departure from HYD')]/parent::div//div[@class='time-sldr']")
	WebElement Departure2_Time_Slider;
	@FindBy(xpath="//div[contains(text(),'Prices')]/parent::div//div[@class='slider-cntr lower']")
	WebElement Price_Slider;
	@FindBy(xpath="//div[contains(text(),'Airlines')]")
	WebElement Airlines_Text;
	
	@FindBy(xpath="//div[@title='Air India']")
	WebElement Air_india_Text;
	@FindBy(xpath="//div[contains(@class,'arln')]//div[@data-checkboxindex='0']")
	WebElement Air_india_Checkbox;
	@FindBy(xpath="//div[@title='AirAsia India']")
	WebElement AirAsia_india_Text;
	@FindBy(xpath="//div[contains(@class,'arln')]//div[@data-checkboxindex='1']")
	WebElement AirAsia_India_Checkbox;
	@FindBy(xpath="//div[@title='IndiGo']")
	WebElement IndiGo_Text;
	@FindBy(xpath="//div[contains(@class,'arln')]//div[@data-checkboxindex='2']")
	WebElement IndiGo_Checkbox;
	@FindBy(xpath="//div[@title='SpiceJet']")
	WebElement SpiceJet_Text;
	@FindBy(xpath="//div[contains(@class,'arln')]//div[@data-checkboxindex='3']")
	WebElement SpiceJet_Checkbox;
	@FindBy(xpath="//div[@title='Vistara']")
	WebElement Vistara_Text;
	@FindBy(xpath="//div[contains(@class,'arln')]//div[@data-checkboxindex='4']")
	WebElement Vistara_Checkbox;
	@FindBy(xpath="//button[text()='APPLY']")
	WebElement Apply_Button;
	@FindBy(xpath="//div[text()='LESS FILTERS']")
	WebElement Less_Filters_Button;
	@FindBy(xpath="//div[text()='MORE FILTERS']")
	WebElement More_Filters_Button;
	@FindBy(xpath="//div[text()='MORE FILTERS']")
	WebElement First_Trip_Flight_Results;
	@FindBy(xpath="//div[text()='MORE FILTERS']")
	WebElement Return_Trip_Flight_Results;
	
	
	public KOCH_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void search_Flight_With_Data() {
		Util.waitForPageLoader();
		wait.until(ExpectedConditions.visibilityOf(Ixigo_Logo));
		String title = driver.getCurrentUrl();
		assertEquals(title, prop.getProperty("url"));
		Round_Trip.click();
		Frm_City_Cross_Btn.click();
		From_City.sendKeys("Pune");
		From_City_Option.click();
		To_City.sendKeys("Hyderabad");
		To_City_Option.click();
		From_Date.click();
		To_Date.click();
		Passenger_Count.click();
		Search_Button.click();
		Util.waitForPageLoader();
		
		String title_Serach_Page = driver.getCurrentUrl();
		
		title_Serach_Page.contains(prop.getProperty("serach_page_url"));
		wait.until(ExpectedConditions.visibilityOf(First_Trip_Flight_Results));
		wait.until(ExpectedConditions.visibilityOf(Return_Trip_Flight_Results));
		
		
		More_Filters_Button.click();
		
		wait.until(ExpectedConditions.visibilityOf(Stop_Text));
		wait.until(ExpectedConditions.visibilityOf(Non_Stop_Text));
		Non_Stop_Checkbox.click();
		wait.until(ExpectedConditions.visibilityOf(One_Stop_Text));
		One_Stop_Checkbox.click();
		wait.until(ExpectedConditions.visibilityOf(OnePlus_Stop_Text));
		OnePlus_Stop_Checkbox.click();
		
		wait.until(ExpectedConditions.visibilityOf(Departure1_Text));
		//Departure1_00_00_06_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure1_Early_Morning));
		//Departure1_00_06_12_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure1_Morning));
		Departure1_12_00_18_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure1_Mid_Day));
		Departure1_18_00_24_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure1_Night));
		
		wait.until(ExpectedConditions.visibilityOf(Departure2_Text));
		Departure2_00_00_06_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure2_Early_Morning));
		//Departure2_00_06_12_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure2_Morning));
		Departure2_12_00_18_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure2_Mid_Day));
		Departure2_18_00_24_00.click();
		wait.until(ExpectedConditions.visibilityOf(Departure2_Night));
		
		wait.until(ExpectedConditions.visibilityOf(Departure1_Time_Slider));
		wait.until(ExpectedConditions.visibilityOf(Departure2_Time_Slider));
		wait.until(ExpectedConditions.visibilityOf(Price_Slider));
		
		wait.until(ExpectedConditions.visibilityOf(Airlines_Text));
		
		Air_india_Checkbox.click();
		//wait.until(ExpectedConditions.visibilityOf(Air_india_Text));
		AirAsia_India_Checkbox.click();
		//wait.until(ExpectedConditions.visibilityOf(AirAsia_india_Text));
		IndiGo_Checkbox.click();
		//wait.until(ExpectedConditions.visibilityOf(IndiGo_Text));
		//SpiceJet_Checkbox.click();
		//wait.until(ExpectedConditions.visibilityOf(SpiceJet_Text));
		//Vistara_Checkbox.click();
		//wait.until(ExpectedConditions.visibilityOf(Vistara_Text));

		Apply_Button.click();
		
		Util.waitForPageLoader();
		System.out.println("Please find below flight details from Pune to Hyderabad");
		List<WebElement> ls1=driver.findElements(By.xpath("//div[@class='result-col outr']//div[@class='price']//span/following-sibling::span"));
		ls1.size();
		for(int i=1;i<=ls1.size();i++) {
			String amount=driver.findElement(By.xpath("(//div[@class='result-col outr']//div[@class='price']//span/following-sibling::span)["+i+"]")).getText();
			int price=Integer.parseInt(amount);
			if(price<5000) {
				String flight=driver.findElement(By.xpath("(//div[@class='result-col outr']//div[@class='price']//span/following-sibling::span)["+i+"]/ancestor::div[@class='summary-section']//div[@class='u-text-ellipsis']")).getText();
				String[] Details=flight.split("  ");
				System.out.println("Flight name is "+Details[0]);
				System.out.println("Flight number is "+Details[1]);
			}
		}
		System.out.println("Please find below flight details from Hyderabad to Pune");
		List<WebElement> ls2=driver.findElements(By.xpath("//div[@class='result-col']//div[@class='price']//span/following-sibling::span"));
		ls1.size();
		for(int i=1;i<=ls2.size();i++) {
			String amount=driver.findElement(By.xpath("(//div[@class='result-col']//div[@class='price']//span/following-sibling::span)["+i+"]")).getText();
			int price=Integer.parseInt(amount);
			if(price<5000) {
				String flight=driver.findElement(By.xpath("(//div[@class='result-col']//div[@class='price']//span/following-sibling::span)["+i+"]/ancestor::div[@class='summary-section']//div[@class='u-text-ellipsis']")).getText();
				String[] Details=flight.split("  ");
				System.out.println("Flight name is "+Details[0]);
				System.out.println("Flight number is "+Details[1]);
			}
		}		
	}
}