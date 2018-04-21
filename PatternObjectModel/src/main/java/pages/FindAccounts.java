package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindAccounts extends ProjectMethods{

	public FindAccounts() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH, using="//input[@name='id']")
	private WebElement eleAccountID;

	public FindAccounts enterAccountIDNewWindow(String id) {
		switchToWindow(1);
		type(eleAccountID, id);
		return this;
	}

	@FindBy(how=How.XPATH, using="//button[text()='Find Accounts']")
	private WebElement eleFindAccountsButton;

	public FindAccounts clickFindAccountsButton() {
		click(eleFindAccountsButton);
		return this;
	}

	@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleSelectFirstResult;

	public MergeAccounts selectFirstResultNewWindow() {
		clickWithNoSnap(eleSelectFirstResult);
		switchToWindow(0);
		return new MergeAccounts();
	}
	
	



}