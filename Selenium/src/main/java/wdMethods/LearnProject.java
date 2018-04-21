package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LearnProject extends SeMethods{
	
	@Parameters({"url","uname","password"})
	@BeforeMethod//(groups="all")
	public void loginleaf(String url, String uname, String password) {
		startApp("chrome", url);
		type(locateElement("id", "username"), uname);
		type(locateElement("id", "password"), password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));
	}
	@AfterMethod(groups="all")
	public void closeleaf() {
		closeBrowser();
	}

	public void closeAllleaf() {
		closeAllBrowsers();
	}
}