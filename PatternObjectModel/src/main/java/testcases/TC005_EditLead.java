package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLeads";
		testDescription="Edit Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Raghu";
		browserName="chrome";
		dataSheetName="Edit Lead";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd, String leadname, String fName) {
	
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickFindLeads()
		.enterLeadFirstName(leadname)
		.clickFindLeadsButton()
		.selectFirstResult()
		.clickEditButton()
		.enterCompnayName(fName)
		.clickUpdateButton();	
		
	}
}
