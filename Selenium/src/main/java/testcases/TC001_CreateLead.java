package testcases;

import org.testng.annotations.Test;
import wdMethods.LearnProject;


public class TC001_CreateLead extends LearnProject{
	@Test(groups= "smoke")//(invocationCount=2)
	public void createLead() {
		/*startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));*/
		click(locateElement("LinkText", "Leads"));
		click(locateElement("LinkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "Axxenture");
		type(locateElement("id", "createLeadForm_firstName"), "Raghusandeep");
		type(locateElement("id", "createLeadForm_lastName"), "Sandeep");
		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), "Employee");
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_marketingCampaignId"),7);
		click(locateElement("class", "smallSubmit"));
		//closeBrowser();
	}
}