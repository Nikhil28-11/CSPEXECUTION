package testCase;

import org.testng.annotations.Test;

import POM.CSRDashboard;
import POM.CSRNormalSearch;
import POM.LoginPage;
import POM.UniversalSearch;

public class TC_003_VerifyUniversalSearch extends BaseClass {

	@Test
	void verifyUniversalSearch() {
		try {
			logger.info("*** Starting testcase ***");
			LoginPage lp = new LoginPage(driver);
			lp.txt_username("qauser");
			lp.txt_psswrd("Sew@2021$!");
			lp.btn_login();
			CSRDashboard cd = new CSRDashboard(driver);
			cd.csr_icon_click();
			UniversalSearch us = new UniversalSearch(driver);
			us.account_number("411002248606");
			us.customer_name("");
			us.email_address("");
			us.address("");
			us.zipCode("");
			us.primary_phone("");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
