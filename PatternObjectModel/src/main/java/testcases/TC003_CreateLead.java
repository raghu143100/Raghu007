package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create Lead";
		testNodes="Leads";
		category="Smoke";
		authors="RS";
		browserName="chrome";
		dataSheetName="Create Lead";
	}


	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String cName, String fName, String lName, String source, String campid) {
		int markcampid = Integer.parseInt(campid);
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.selectSource(source)
		.selectCompaign(markcampid)
		.clickCreateLeadButton()
		.verifyFirstName(fName);

	}
}
