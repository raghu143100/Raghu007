package testcases;

import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC002_MergeLead extends SeMethods{
	@Test(groups="sanity",dependsOnGroups="smoke")//(timeOut=20000)
	public void mergelead() {
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText", "Leads"));
		click(locateElement("Xpath", "//a[text()='Merge Leads']"));
		click(locateElement("Xpath", "//a[contains(@href,'ComboBox_partyIdFrom')]/img"));
		switchToWindow(1);
		String inputtext = getText(locateElement("Xpath", "//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a"));
		type(locateElement("Xpath", "//input[@name='id']"),getText(locateElement("Xpath", "//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a")));
		click(locateElement("Xpath","//button[text()='Find Leads']"));
		clickWithNoSnap(locateElement("Xpath","//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a"));
		switchToWindow(0);
		click(locateElement("Xpath", "//a[contains(@href,'ComboBox_partyIdTo')]/img"));
		switchToWindow(1);
		type(locateElement("Xpath", "//input[@name='id']"),getText(locateElement("Xpath", "//div[@class='x-grid3-scroller']/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a")));
		click(locateElement("Xpath","//button[text()='Find Leads']"));
		clickWithNoSnap(locateElement("Xpath","//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("Xpath", "//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("Xpath", "//a[text()='Find Leads']"));
		type(locateElement("Xpath", "//input[@name='id']"),inputtext);
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		/*String verifytext =getText(locateElement("Xpath", "//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a"));
		if(inputtext!=verifytext)
		{
			getText(locateElement("Xpath", "//div[text()='No records to display']"));
		}*/
		closeBrowser();		
	}
}