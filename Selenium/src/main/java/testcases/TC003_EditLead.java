package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.LearnProject;

public class TC003_EditLead extends LearnProject {
	@Test(groups="smoke")//(dependsOnMethods= {"TestCases.TC001_CreateLead.createLead"})
	public void editLead() {
		/*startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
	*/	click(locateElement("LinkText", "Leads"));
		click(locateElement("Xpath", "//a[text()='Find Leads']"));
		type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input[2]"),"g");
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("Xpath", "//a[contains(@href,'updateLeadForm?partyId')]"));
		clear(locateElement("Xpath", "//input[@id='updateLeadForm_companyName']"));
		type(locateElement("Xpath", "//input[@id='updateLeadForm_companyName']"), "TestingR");
		click(locateElement("Xpath", "//input[@value='Update']"));
		getText(locateElement("Xpath", "//span[@id='viewLead_companyName_sp']"));
		//closeBrowser();
	}
}