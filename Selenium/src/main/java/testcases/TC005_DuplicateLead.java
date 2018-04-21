package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC005_DuplicateLead extends SeMethods{
	@Test(groups="sanity",dependsOnGroups="smoke")//(enabled=false)
	public void duplicateLead() {
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		verifyTitle("Leaftaps - TestLeaf Automation Platform");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("LinkText", "Leads"));
		click(locateElement("Xpath", "//a[text()='Find Leads']"));
		click(locateElement("Xpath", "//span[text()='Email']"));
		type(locateElement("Xpath", "//input[@name='emailAddress']"), "guna@gmail.com");
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		String temp = getText(locateElement("Xpath", "//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a"));
		click(locateElement("Xpath", "//div[@class='x-grid3-scroller']/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a"));
		click(locateElement("Xpath", "//a[text()='Duplicate Lead']"));
		verifyExactText(locateElement("sectionHeaderTitle_leads"),"Duplicate Lead");
		click(locateElement("Xpath", "//input[@value='Create Lead']"));
		String temp2 = getText(locateElement("viewLead_firstName_sp"));
		if(temp.equals(temp2))
			System.out.println("Name has been Matched");
		else
			System.out.println("Does NOT match the name");
		closeBrowser();
	}
}