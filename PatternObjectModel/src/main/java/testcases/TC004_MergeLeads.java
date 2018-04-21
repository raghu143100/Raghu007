package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_MergeLeads";
		testDescription="Merge Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Raghu";
		browserName="chrome";
		dataSheetName="MergeLeads";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd, String id, String id2) {
	
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterLeadIDNewWindow(id)
		.clickFindLeadsButton()
		.selectFirstResultNewWindow()
		.clickTOLeadIcon()
		.enterLeadIDNewWindow(id2)
		.clickFindLeadsButton()
		.selectFirstResultNewWindow()
		.clickMerge()
		.clickFindLeads()
		.enterLeadID(id)
		.clickFindLeadsButton();
		
	}
}
