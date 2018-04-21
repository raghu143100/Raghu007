package accounts;

import org.junit.Test;

import com.google.common.base.CharMatcher;

import wdMethods.LearnProject;

public class CreateAccount extends LearnProject {
	@Test
	public void createAccount() {

		loginleaf();
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Create Account']"));
		type(locateElement("Xpath", "//input[@id='accountName']"), "RaghuS");
		selectDropDownUsingText(locateElement("Xpath", "//select[@name='industryEnumId']"), "Telecommunications");
		selectDropDownUsingValue(locateElement("Xpath", "//select[@id='currencyUomId']"), "INR");
		selectDropDownUsingValue(locateElement("Xpath", "//select[@id='dataSourceId']"), "LEAD_EMPLOYEE");
		selectDropDownUsingIndex(locateElement("Xpath", "//select[@id='marketingCampaignId']"), 2);
		type(locateElement("Xpath", "//input[@id='primaryPhoneNumber']"), "5765757253");
		type(locateElement("Xpath", "//input[@id='generalCity']"), "Chennai");
		type(locateElement("Xpath", "//input[@id='primaryEmail']"), "test@gmail.com");
		selectDropDownUsingValue(locateElement("Xpath", "//select[@id='generalCountryGeoId']"), "IND");
		selectDropDownUsingText(locateElement("Xpath", "//select[@id='generalStateProvinceGeoId']"), "TAMILNADU");
		click(locateElement("Xpath", "//input[@class='smallSubmit']"));
		String text = getText(locateElement("Xpath", "//td[@class='titleCell']/following::td[1]"));
		@SuppressWarnings("deprecation")
		String id = (CharMatcher.DIGIT).retainFrom(text);
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "(//input[@name='accountName'])[2]"), "Raghusandeep");
		type(locateElement("Xpath", "//input[@name='id']"), id);
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		verifyPartialText(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"), id);
		closeleaf();
	}
}