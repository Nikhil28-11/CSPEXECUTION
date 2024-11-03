package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Analytics_CustomerEngagement_Dashboard extends BaseClass{

	public Analytics_CustomerEngagement_Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id='CEA.Access']")
	WebElement customer_anlytics_grid;
	
	@FindBy(xpath = "//*id[@spnTotalBanner]//br")
	WebElement banner_header;
	
	@FindBy(xpath = "//*[@id = 'spnTotalConnectMe']//b")
	WebElement contact_us_header;
	
	@FindBy(xpath = "//*[@id = 'spnTotalServiceRequest']//b")
	WebElement service_header;
	
	@FindBy(xpath = "//div[@title='Calender']")
	WebElement calendar;
	
	
	public void calender_Option(WebElement el) {
		el.click();
		WebElement option1 = driver.findElement(By.xpath("//*[@class='month-select']"));
		Select sl1 = new Select(option1);
		sl1.selectByValue("7");
		WebElement option2 = driver.findElement(By.xpath("//*[@class = 'year-select']"));
		Select sl2 = new Select(option2);
		sl2.selectByValue("2024");
		WebElement option3 = driver.findElement(By.xpath(""));
	}
	
	
	
	
}
