package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC009_MeargeAccount extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC009_MeargeAccount";
		testDescription="Duplicate Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Raghu";
		browserName="chrome";
		dataSheetName="Merge Accounts";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd, String fromid, String toid) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickAccountsMenu()
		.clickMergeAccount()
		.clickFromAccountIcon()
		.enterAccountIDNewWindow(fromid)
		.clickFindAccountsButton()
		.selectFirstResultNewWindow()
		.clickTOAccountIcon()
		.enterAccountIDNewWindow(toid)
		.clickFindAccountsButton()
		.selectFirstResultNewWindow()
		.clickMerge()
		.clickFindAccount()
		.enterAccountID(fromid)
		.clickFindAccountsButton();
		
	}
}
