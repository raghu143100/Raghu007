package testcases;

import org.junit.Test;

import wdMethods.LearnProject;

public class TC011_MergeAccounts extends LearnProject{
	@Test
	public void mergeAccounts() {
		//loginleaf();
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Merge Accounts']"));
		click(locateElement("Xpath", "//a[contains(@href,'ComboBox_partyIdFrom')]/img"));
		switchToWindow(1);
		type(locateElement("Xpath", "//input[@name='id']"), "11367");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		clickWithNoSnap(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("Xpath", "//a[contains(@href,'ComboBox_partyIdTo')]/img"));
		switchToWindow(1);
		type(locateElement("Xpath", "//input[@name='id']"), "11368");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		clickWithNoSnap(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("Xpath", "//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "//input[@name='id']"), "11367");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("Xpath", "//div[text()='No records to display']"), "No records to display");
	}
}