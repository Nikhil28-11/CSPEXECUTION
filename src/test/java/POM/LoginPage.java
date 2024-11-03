package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@name = 'txtAdminLogin']")
	WebElement txt_username;
	
	@FindBy(xpath = "//*[@name= 'txtpwd']")
	WebElement txt_psswrd;
	
	@FindBy(xpath = "//*[@type = 'submit']")
	WebElement btn_login;
	
	@FindBy(xpath="//i[@class='arrow_down']")
	WebElement btn_arrow;
	
	@FindBy(xpath = "//a[@id='imgLogoff']")
	WebElement signOut_btn;
	
	public void txt_username(String username) {
		txt_username.sendKeys(username);
	}
	
	public void txt_psswrd(String password) {
		txt_psswrd.sendKeys(password);
	}
	
	public void btn_login() {
		btn_login.click();
	}
	
	public void btn_arrow() {
		btn_arrow.click();
	}
	
	public void signOut_btn() {
		signOut_btn.click();
	}
	
	public boolean isLoginPage() {
		btn_arrow.isDisplayed();
		return true;
	}
	
	public void clearOutUsername() {
		txt_username.clear();
	}
}
