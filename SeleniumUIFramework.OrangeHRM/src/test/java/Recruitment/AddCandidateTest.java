package Recruitment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.genericutility.Base;
import com.orangehrm.seleniumuiframework.genericutility.BaseClass;
import com.orangehrm.seleniumuiframework.object_repository.AddCandidatePage;
import com.orangehrm.seleniumuiframework.object_repository.CandidatePage;
import com.orangehrm.seleniumuiframework.object_repository.Dashboard;
import com.orangehrm.seleniumuiframework.object_repository.Recruitment;
@Listeners(com.orangehrm.seleniumuiframework.genericutility.ListenersImplementation.class)
public class AddCandidateTest extends Base {
	@Test(dataProvider = "CandidateExcelData")
	public void testMethod(String fname, String mname, String lname, String email, String contact, String resume,
			String date, String searchName, String fromDate, String toDate) throws InterruptedException {

		Dashboard db = new Dashboard(driver);
		db.clickRecruitment();
		Recruitment rc = new Recruitment(driver);
		rc.clickAddBtn();
		AddCandidatePage ac = new AddCandidatePage(driver);
		ac.addCandidate(fname, mname, lname, email, contact, resume, date);
		rc.clickCandidates();
//		CandidatePage cp = new CandidatePage(driver);
//		cp.verifyCandidate(searchName, fromDate, toDate);
		Assert.assertTrue(ac.ValidateCandidateList(fname), "Candidate was NOT found in the table");
	}
}