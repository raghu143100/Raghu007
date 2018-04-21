package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.LearnProject;


public class TC001_CreateLead extends LearnProject{
	
	
	@Test(dataProvider="inputdata")//(groups= "smoke")//(invocationCount=2)
	public void createLead(String cname, String fname, String lname, String category, int campid) {
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
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_marketingCampaignId"),campid);
		click(locateElement("class", "smallSubmit"));
		//closeBrowser();
	}
	
	@DataProvider(name="inputdata")
	public Object[][] getData()
	{
		Object[][] input=new Object[2][5];
		input[0][0]="Axxenture";
		input[0][1]="Raghusandeep";
		input[0][2]="Sandeep";
		input[0][3]="Employee";
		//input[0][4]=7;
		
		input[1][0]="Axxenture";
		input[1][1]="Syed";
		input[1][2]="Musavir";
		input[1][3]="Employee";
		//input[1][4]=6;
		
		return input;
		
	}
}