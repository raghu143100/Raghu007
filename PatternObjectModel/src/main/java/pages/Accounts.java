package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Accounts extends ProjectMethods{
	
	public Accounts() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="//a[text()='Find Accounts']")
	private WebElement eleFindAccount;
	
	public Accounts clickFindAccount() {
		click(eleFindAccount);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Merge Accounts']")
	private WebElement eleMergeAccount;
	
	public MergeAccounts clickMergeAccount() {
		click(eleMergeAccount);
		return new MergeAccounts();
	}
	
	@FindBy(how=How.XPATH, using="(//input[@name='accountName'])[2]")
	private WebElement eleAccountName;
	
	public Accounts enterAccountName(String accountName) {
		type(eleAccountName, accountName);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='id']")
	private WebElement eleAccountID;
	
	public Accounts enterAccountID(String accountID) {
		type(eleAccountID, accountID);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Accounts']")
	private WebElement eleFindAccountsButton;
	
	public Accounts clickFindAccountsButton() {
		click(eleFindAccountsButton);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleSelectFirstResult;


	public Accounts selectFirstResult() {
		click(eleSelectFirstResult);
		return this;
	}
	
	
	public Accounts getAccountsTitle() {
		getTitle();
		return this;
	}
		
	@FindBy(how=How.XPATH, using="//a[text()='Deactivate Account']")
	private WebElement eleDeactivateAccount;


	public Accounts clickDeactivateButton() {
		click(eleDeactivateAccount);
		return this;
	}
	
	public Accounts getAlertTextOfDeactivate() {
		getAlertText();
		return this;		
	}
	
	public Accounts acceptDeactivateAlert() {
		acceptAlert();
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//span[@class='subSectionWarning']")
	private WebElement eleDeactivationConfirmaiton;
	
	public AccountDetails deactivationConfirmation(String expectedText) {
		verifyPartialText(eleDeactivationConfirmaiton, expectedText);
		return new AccountDetails();
		
	}
	
}
