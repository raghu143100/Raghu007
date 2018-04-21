package testcases;

import org.junit.Test;

import wdMethods.SeMethods;

public class TC008_Alert_Frame extends SeMethods {

	@Test
	public void alert_Frame() {
		startApp("Chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		switchToFrameUsingName("iframeResult");
		clickWithNoSnap(locateElement("Xpath", "//button[text()='Try it']"));
		getAlertText();
		typeOnAlert("Hi World");
		acceptAlert();
		verifyPartialText(locateElement("Xpath", "//p[contains(text(),'How are you')]"),"Hi World");
		closeBrowser();
	}
}