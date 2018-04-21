package testcases;

import org.junit.Test;

import wdMethods.SeMethods;

public class TC009_IRCTCSignUp extends SeMethods{
	@Test
	public void irctcSignUp() {
		startApp("Chrome", "https://www.irctc.co.in/eticketing/loginHome.jsf");
		click(locateElement("LinkText", "Sign up"));
		type(locateElement("userRegistrationForm:userName"), "test007456");
		type(locateElement("userRegistrationForm:password"), "ravindra");
		type(locateElement("userRegistrationForm:confpasword"), "ravindra");
		selectDropDownUsingIndex(locateElement("userRegistrationForm:securityQ"), 1);
		type(locateElement("userRegistrationForm:securityAnswer"), "Chintu");
		selectDropDownUsingText(locateElement("userRegistrationForm:prelan"), "English");
		type(locateElement("userRegistrationForm:firstName"), "Raghu");
		type(locateElement("userRegistrationForm:middleName"), "sandeep");
		type(locateElement("userRegistrationForm:lastName"), "Shetty");
		click(locateElement("userRegistrationForm:gender:0"));
		click(locateElement("userRegistrationForm:maritalStatus:0"));
		selectDropDownUsingText(locateElement("userRegistrationForm:dobDay"), "13");
		selectDropDownUsingText(locateElement("userRegistrationForm:dobMonth"), "DEC");
		selectDropDownUsingText(locateElement("userRegistrationForm:dateOfBirth"), "1993");
		selectDropDownUsingText(locateElement("userRegistrationForm:occupation"), "Private");
		type(locateElement("userRegistrationForm:uidno"), "3532464365364");
		type(locateElement("userRegistrationForm:idno"), "ASDF345432");
		selectDropDownUsingText(locateElement("userRegistrationForm:countries"), "India");
		type(locateElement("userRegistrationForm:email"), "dummy@gamil.com");
		type(locateElement("userRegistrationForm:mobile"), "9876543456");
		selectDropDownUsingValue(locateElement("userRegistrationForm:nationalityId"), "94");
		type(locateElement("userRegistrationForm:address"), "ramnagar");
		type(locateElement("userRegistrationForm:street"), "ramstreet");
		type(locateElement("userRegistrationForm:area"), "rammandir");
		type(locateElement("userRegistrationForm:pincode"), "600063");
		selectDropDownUsingValue(locateElement("userRegistrationForm:cityName"), "Kanchipuram");
		selectDropDownUsingValue(locateElement("userRegistrationForm:postofficeName"), "Old Perungalathur B.O");
		type(locateElement("userRegistrationForm:landline"), "044123456");
		click(locateElement("userRegistrationForm:resAndOff:0"));
		closeBrowser();
	}
}