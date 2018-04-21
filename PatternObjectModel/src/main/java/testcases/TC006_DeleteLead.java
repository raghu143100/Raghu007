package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DeleteLead";
		testDescription="Delete Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Raghu";
		browserName="chrome";
		dataSheetName="Delete Lead";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd, String phone) {
	
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phone)
		.clickFindLeadsButton()
		.getLeadID()
		.selectFirstResult()
		.clickDeleteButton()
		.clickFindLeads()
		.enterLeadID(firstResultLeadID)
		.clickFindLeadsButton();
	}
}
