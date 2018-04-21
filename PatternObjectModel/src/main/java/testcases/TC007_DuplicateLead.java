package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC007_DuplicateLead";
		testDescription="Duplicate Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Raghu";
		browserName="chrome";
		dataSheetName="Duplicate Lead";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd, String email, String title) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmailID(email)
		.clickFindLeadsButton()
		.selectFirstResult()
		.getFirstLeadName()
		.clickDuplicateButton()
		.verifyHeaderTitle(title)
		.clickCreateLead()
		.verifyDuplicatedLeadName();		
	}
}
