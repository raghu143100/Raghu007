package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC008_DeactivateAccount extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC008_DeactivateAccount";
		testDescription="Duplicate Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Raghu";
		browserName="chrome";
		dataSheetName="Deactivate Account";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd, String accountName, String accountID, String confirmationText) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickAccountsMenu()
		.clickFindAccount()
		.enterAccountName(accountName)
		.enterAccountID(accountID)
		.clickFindAccountsButton()
		.selectFirstResult()
		.getAccountsTitle()
		.clickDeactivateButton()
		.getAlertTextOfDeactivate()
		.acceptDeactivateAlert()
		.deactivationConfirmation(confirmationText)
		.clickFindAccount()
		.enterAccountName(accountName)
		.enterAccountID(accountID);
		
	}
}
