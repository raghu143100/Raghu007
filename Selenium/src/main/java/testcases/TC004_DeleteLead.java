package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC004_DeleteLead extends SeMethods {
	@Test(groups="regression",dependsOnGroups="sanity")//(dependsOnMethods= {"TestCases.TC001_CreateLead.createLead"})
	public void deleteLead() {
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText", "Leads"));
		click(locateElement("Xpath", "//a[@href='/crmsfa/control/findLeads']"));
		click(locateElement("Xpath", "//span[text()='Phone']"));
		type(locateElement("Xpath", "//input[@name='phoneNumber']"), "1234567890");
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		String text = getText(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("Xpath", "//a[@href='javascript:document.deleteLeadForm.submit()']"));
		click(locateElement("Xpath", "//a[@href='/crmsfa/control/findLeads']"));
		type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input"),text );
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		getText(locateElement("Xpath", "//div[text()='No records to display']"));
		closeBrowser();
	}
}