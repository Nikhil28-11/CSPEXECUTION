package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CSRNormalSearch extends BaseClass {

	public CSRNormalSearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//select[@id='searchColumn']")
	WebElement normal_search;

	@FindBy(xpath = "//input[@id = 'txtBasicSearch']")
	WebElement normal_search_area;

	@FindBy(xpath = "//a[@id='BtnFilternew']")
	WebElement search_btn;

	public void serviceAccountNumber() throws InterruptedException {
		Select elements = new Select(normal_search);
		elements.selectByValue("UtilityAccountNumber");
		normal_search_area.sendKeys("411002248606");
		search_btn();
		Thread.sleep(10);
	}

	public void customerName() throws InterruptedException {
		Select elements = new Select(normal_search);
		elements.selectByValue("FullName");
		search_btn();
		normal_search_area.sendKeys("Logan Watts");
		Thread.sleep(10);
	}

	public void customerNumber() throws InterruptedException {
		Select elements = new Select(normal_search);
		elements.selectByValue("CustomerNo");
		normal_search_area.sendKeys("C000216558");
		search_btn();
		Thread.sleep(10);
	}

	public void primaryEmail() throws InterruptedException {
		Select elements = new Select(normal_search);
		elements.selectByValue("EmailId");
		normal_search_area.sendKeys("nikhil.jain@smartenergywater.in");
		search_btn();
		Thread.sleep(10);
	}

	public void primaryPhone() throws InterruptedException {
		Select elements = new Select(normal_search);
		elements.selectByValue("MobilePhone");
		normal_search_area.sendKeys("909-581-9443");
		search_btn();
		Thread.sleep(10);
	}

	public void userName() throws InterruptedException {
		Select elements = new Select(normal_search);
		elements.selectByValue("UserName");
		normal_search_area.sendKeys("81abc@mailinator.com");
		search_btn();
		Thread.sleep(10);
	}

	public void zipCode() throws InterruptedException {
		Select elements = new Select(normal_search);
		elements.selectByValue("ZipCode");
		normal_search_area.sendKeys("18708");
		search_btn();
		Thread.sleep(10);
	}

	public void search_btn() {
		search_btn.click();
	}

}
