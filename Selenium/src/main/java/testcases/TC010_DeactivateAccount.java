package testcases;

import org.junit.Test;

import wdMethods.LearnProject;

public class TC010_DeactivateAccount extends LearnProject{
	@Test
	public void deactivateAccount() {
		//loginleaf();
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "(//input[@name='accountName'])[2]"), "data2");
		type(locateElement("Xpath", "//input[@name='id']"), "11421");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		getText(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		getTitle();
		clickWithNoSnap(locateElement("Xpath", "//a[text()='Deactivate Account']"));
		getAlertText();
		acceptAlert();
		verifyPartialText(locateElement("Xpath", "//span[@class='subSectionWarning']"), "This account was deactivated");
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "(//input[@name='accountName'])[2]"), "data2");
		type(locateElement("Xpath", "//input[@name='id']"), "11421");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("Xpath", "//div[text()='No records to display']"), "No records to display");
		closeleaf();
	}
}