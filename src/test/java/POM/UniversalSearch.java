package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UniversalSearch extends BaseClass{

	public UniversalSearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@id='idUniverseserach']")
	WebElement universal_search_btn;
	
	@FindBy(xpath="//input[@id='txtcustomername']")
	WebElement customer_name_input;
	
	@FindBy(xpath="//input[@id='txtZipCode']")
	WebElement zipcode_input;
	
	@FindBy(xpath="//input[@id='txtAccountIDPopup']")
	WebElement account_number_input;
	
	@FindBy(xpath="//input[@id='txtEmailPopup']")
	WebElement email_address_input;
	
	@FindBy(xpath="//input[@id='txtMobilePopup']")
	WebElement primary_phone_number;
	
	@FindBy(xpath = "input[@id='txtAddressPopup']")
	WebElement address_input;
	
	@FindBy(xpath="//a[normalize-space()='Submit']")
	WebElement submit_btn;
	
	public void Universal_search() {
		universal_search_btn.click();
	}
	
	public void customer_name(String name) {
		customer_name_input.sendKeys(name);
	}
	
	public void zipCode(String name) {
		zipcode_input.sendKeys(name);
	}
	
	public void account_number(String name) {
		account_number_input.sendKeys(name);
	}
	
	public void email_address(String email) {
		email_address_input.sendKeys(email);
	}
	
	public void primary_phone(String number) {
		primary_phone_number.sendKeys(number);
	}
	
	public void address(String name) {
		address_input.sendKeys(name);
	}

	public void submit_btn() {
		submit_btn.click();
	}
	
}
