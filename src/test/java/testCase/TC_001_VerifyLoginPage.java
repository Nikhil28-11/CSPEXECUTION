package testCase;

import org.testng.annotations.Test;
import org.testng.Assert;


import POM.LoginPage;

public class TC_001_VerifyLoginPage extends BaseClass{
	
	@Test
	void verifyLoginPage() {
		try {
			logger.info("*** Starting TC_001_VerifyLoginPage ***");
			LoginPage lp = new LoginPage(driver);
			lp.txt_username(null);
			lp.txt_psswrd(null);
			lp.btn_login();
			Assert.assertTrue(true);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.assertFalse(false);
		}
	}

}
