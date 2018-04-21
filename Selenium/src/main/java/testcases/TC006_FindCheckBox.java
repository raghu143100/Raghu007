package testcases;

import org.junit.Test;

import wdMethods.SeMethods;

public class TC006_FindCheckBox extends SeMethods {
	@Test
	public void findCheckBox() {
		startApp("chrome", "http://leafground.com/pages/checkbox.html");
		verifySelected(locateElement("Xpath", "//div[@id='contentblock']/section/div[1]/input[1]"));
		unselect(locateElement("Xpath", "//div[@id='contentblock']/section/div[2]/input[1]"));
		closeBrowser();
	}
}