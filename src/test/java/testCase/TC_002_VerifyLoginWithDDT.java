package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.LoginPage;
import utilities.DataProviders;

public class TC_002_VerifyLoginWithDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void verifyLoginDDT(String username, String psswrd, String result) {

		LoginPage lp = new LoginPage(driver);
		try {
			logger.info("Testcase starts from Here");
			lp.txt_username(username);
			lp.txt_psswrd(psswrd);
			lp.btn_login();
			boolean targetpage = lp.isLoginPage();
			if(result.equalsIgnoreCase("Pass")) {
				if(targetpage==true) {
					lp.btn_arrow();
					lp.signOut_btn();
					lp.clearOutUsername();
					Assert.assertTrue(true);
				}
				else {
					lp.clearOutUsername();
					Assert.assertFalse(false);
				}
			}
			if(result.equalsIgnoreCase("Fail")) {
				if(targetpage==true) {
					lp.btn_arrow();
					lp.signOut_btn();
					lp.clearOutUsername();
					Assert.assertFalse(true);
				}
				else {
					lp.clearOutUsername();
					Assert.assertTrue(false);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		logger.info("Testcase ends here");
	}
}
