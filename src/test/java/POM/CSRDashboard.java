package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSRDashboard extends BaseClass{

	public CSRDashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//li[@id='ContentPlaceHolder1_csr']")
	WebElement csr_icon;
	
	
	public void csr_icon_click() {
		csr_icon.click();
	}

	
	
}
