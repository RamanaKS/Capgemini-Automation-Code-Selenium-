package PIM;


import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.genericutility.BaseClass;
import com.orangehrm.seleniumuiframework.object_repository.AddTerminationReasonPage;
import com.orangehrm.seleniumuiframework.object_repository.Dashboard;

import com.orangehrm.seleniumuiframework.object_repository.PimPage;
import com.orangehrm.seleniumuiframework.object_repository.TerminationPage;

public class AddTerminationReasonsAndVerifyTest extends BaseClass {

	@Test
	public void testMethod() throws InterruptedException {


		// Dashboard → PIM
		Dashboard db = new Dashboard(driver);
		db.clickPimLink();

		// PIM → Configuration → Termination Reasons
		PimPage pim = new PimPage(driver);
		pim.clickConfiguration();
		pim.clickTerminationReasons();

		// Click Add
		TerminationPage tp = new TerminationPage(driver);
		tp.clickAddBtn();

		// Add Termination Reason
		AddTerminationReasonPage at = new AddTerminationReasonPage(driver);

		String reason = "Summa Fun dhan hello updated2111111";

		at.addTerminationReason(reason);

		// Verify
		boolean result = pim.verifyTerminationReason(reason);

		if (result)
			System.out.println("Termination reason is added");
		else
			System.out.println("Termination not added");
	}
}
