package contacts;

import org.junit.Test;

import wdMethods.LearnProject;

public class EditContact extends LearnProject  {
	@Test
	public void editAccount() {

		loginleaf();
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "(//input[@name='accountName'])[2]"), "Raghu");
		type(locateElement("Xpath", "//input[@name='id']"), "10786");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		getTitle();
		click(locateElement("Xpath", "//a[text()='Edit']"));
		clear(locateElement("Xpath", "//input[@id='accountName']"));
		type(locateElement("Xpath", "//input[@id='accountName']"), "Raghusandy");
		click(locateElement("Xpath", "//input[@class='smallSubmit']"));
		verifyPartialText(locateElement("Xpath", "//td[@class='titleCell']/following::td[1]/span"), "Raghusandy");
		closeleaf();
	}
}