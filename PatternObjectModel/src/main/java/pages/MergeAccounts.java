package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeAccounts extends ProjectMethods{
	
	public MergeAccounts() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="//a[contains(@href,'ComboBox_partyIdFrom')]/img")
	private WebElement eleFromAccount;
	
	public FindAccounts clickFromAccountIcon() {
		click(eleFromAccount);
		return new FindAccounts();
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(@href,'ComboBox_partyIdTo')]/img")
	private WebElement eleTOAccount;
	
	public FindAccounts clickTOAccountIcon() {
		click(eleTOAccount);
		return new FindAccounts();
	}
	
	
	@FindBy(how=How.XPATH, using="//a[text()='Merge']")
	private WebElement eleMerge;
	
	public AccountDetails clickMerge() {
		clickWithNoSnap(eleMerge);
		acceptAlert();
		return new AccountDetails();
	}
	
		
}