package contacts;

import org.junit.Test;

import wdMethods.LearnProject;

public class CreateContact extends LearnProject{
	@Test
	public void contact() {
		loginleaf();
		click(locateElement("Xpath", "//a[text()='Contacts']"));
		click(locateElement("Xpath", "//a[text()='Create Contact']"));
		type(locateElement("Xpath","//input[@id='firstNameField']"), "Raghusandy");
		type(locateElement("Xpath","//input[@id='lastNameField']"), "Shetty");
		type(locateElement("Xpath","//input[@id='createContactForm_firstNameLocal']"), "Sandy");
		type(locateElement("Xpath","//input[@id='createContactForm_lastNameLocal']"), "Shetty");
		type(locateElement("Xpath","//input[@id='createContactForm_personalTitle']"), "RaghuShetty");
		type(locateElement("Xpath","//input[@id='createContactForm_generalProfTitle']"), "TitleRaghu");
		type(locateElement("Xpath","//input[@id='createContactForm_departmentName']"), "Student");
		selectDropDownUsingValue(locateElement("Xpath", "//select[@id='createContactForm_preferredCurrencyUomId']"), "INR");
		type(locateElement("Xpath", "//textarea[@id='createContactForm_description']"), "Creating Test Contact");
		type(locateElement("Xpath", "//textarea[@id='createContactForm_importantNote']"), "Creating Test Note");
		clear(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneCountryCode']"));
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneCountryCode']"), "91");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneAreaCode']"), "044");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneExtension']"), "231");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneNumber']"), "255231");
		type(locateElement("Xpath", "//input[@id='createContactForm_primaryPhoneAskForName']"), "Raghu");
		verifyExactText(locateElement("Xpath", "//input[@id='generalToNameField']"), "Raghusandy Shetty");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalAttnName']"), "TestAtt");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalAddress1']"), "perangalathur");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalAddress2']"), "kurunjinagar");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalCity']"), "Chennai");
		selectDropDownUsingValue(locateElement("Xpath", "//select[@id='createContactForm_generalCountryGeoId']"), "IND");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalPostalCode']"), "600063");
		type(locateElement("Xpath", "//input[@id='createContactForm_generalPostalCodeExt']"), "63");
		selectDropDownUsingText(locateElement("Xpath", "//select[@id='createContactForm_generalStateProvinceGeoId']"),"TAMILNADU");
		click(locateElement("Xpath", "//input[@value='Create Contact']"));
	}
}