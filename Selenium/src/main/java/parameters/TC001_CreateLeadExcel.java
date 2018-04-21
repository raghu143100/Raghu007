package parameters;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.LearnProject;


public class TC001_CreateLeadExcel extends LearnProject{
	
	
	@Test(dataProvider="inputdata")//(groups= "smoke")//(invocationCount=2)
	public void createLead(String cname, String fname, String lname, String category, String campid) {
		/*startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("LinkText", "CRM/SFA"));*/
		click(locateElement("LinkText", "Leads"));
		click(locateElement("LinkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), category);
		int markcampid = Integer.parseInt(campid);
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_marketingCampaignId"),markcampid);
		click(locateElement("class", "smallSubmit"));
		//closeBrowser();
	}
	
	@DataProvider(name="inputdata")
	public Object[][] getData() throws IOException
	{
		ReadExcel input=new ReadExcel();
		Object[][] data = input.getData();
		return data;
		
	}
}