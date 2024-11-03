package testCase;

import org.testng.annotations.Test;

import POM.CSRDashboard;
import POM.CSRNormalSearch;
import POM.LoginPage;

public class TC_003_VerifyCSRNormalSearch extends BaseClass {

	@Test
	void verifyNormalSearch() {
		try {
			logger.info("*** Starting testcase ***");
			LoginPage lp = new LoginPage(driver);
			lp.txt_username("qauser");
			lp.txt_psswrd("Sew@2021$!");
			lp.btn_login();
			CSRDashboard cd = new CSRDashboard(driver);
			cd.csr_icon_click();
			CSRNormalSearch search = new CSRNormalSearch(driver);
			search.serviceAccountNumber();
			Thread.sleep(10);
			search.customerName();
			Thread.sleep(10);
			search.customerNumber();
			Thread.sleep(10);
			search.primaryEmail();
			Thread.sleep(10);
			search.primaryPhone();
			Thread.sleep(10);
			search.userName();
			Thread.sleep(10);
			search.zipCode();
			Thread.sleep(10);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
	}
}
