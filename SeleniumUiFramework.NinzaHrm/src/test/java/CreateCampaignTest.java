import org.testng.Assert;
import org.testng.annotations.Test;

import com.ninzaHrmFramework.Utilities.BaseClass;
import com.ninzahrm.Object_Repository.CampaginsPage;
import com.ninzahrm.Object_Repository.CreateCampaginsPage;

public class CreateCampaignTest extends BaseClass {

	@Test(dataProvider = "campaignData")
	public void createCampaignTest(String campaignName, String targetSize) {

		dashboardPage.clickCampagins();

		CampaginsPage cp = new CampaginsPage(driver);
		cp.clickOnCreateCampaign();
		CreateCampaginsPage ccp = new CreateCampaginsPage(driver);
		ccp.createCampaign(campaignName, targetSize);
		//cp.clickOnToastCloseButton();
		Assert.assertTrue(cp.verifyCampaign(campaignName), "Campaign not created: " + campaignName);
	}
}