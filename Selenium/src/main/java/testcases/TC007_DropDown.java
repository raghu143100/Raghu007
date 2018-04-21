package testcases;

import org.junit.Test;

import wdMethods.SeMethods;

public class TC007_DropDown extends SeMethods {
	@Test
	public void dropDown() {
		startApp("chrome", "http://leafground.com/pages/Dropdown.html");
		selectDropDownUsingIndex(locateElement("dropdown1"), 3);		
		selectDropDownUsingText(locateElement("Name", "dropdown2"), "UFT/QTP");
		selectDropDownUsingValue(locateElement("dropdown3"),"3");
		type(locateElement("Xpath", "//div[@id='contentblock']/section/div[5]/select"), "UFT/QTP");
		click(locateElement("Xpath", "//div[@id='contentblock']/section/div[6]/select/option[4]"));
		closeBrowser();
	}
}